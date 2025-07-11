package com.cognizant.jwt_auth.controller;

import com.cognizant.jwt_auth.util.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic ")) {
            String base64Credentials = authHeader.substring(6);
            String credentials = new String(Base64.getDecoder().decode(base64Credentials));
            String[] parts = credentials.split(":", 2);

            if (parts.length == 2 && authenticateUser(parts[0], parts[1])) {
                String token = jwtUtil.generateToken(parts[0]);
                Map<String, String> response = new HashMap<>();
                response.put("token", token);
                return ResponseEntity.ok(response);
            }
        }
        return ResponseEntity.status(401).body("Invalid credentials");
    }

    private boolean authenticateUser(String username, String password) {
        return "user".equals(username) && "pwd".equals(password);
    }
}
