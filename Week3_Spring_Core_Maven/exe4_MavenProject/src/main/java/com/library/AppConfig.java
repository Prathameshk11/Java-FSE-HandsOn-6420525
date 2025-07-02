package com.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public LibraryService libraryService() {
        return new LibraryService();
    }
}
