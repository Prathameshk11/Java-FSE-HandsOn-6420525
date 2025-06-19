import java.util.*;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void display() {
        System.out.println("ID: " + productId + ", Name: " + productName +
                           ", Quantity: " + quantity + ", Price: " + price);
    }
}

public class InventorySystem {
    static HashMap<Integer, Product> inventory = new HashMap<>();

    public static void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Product added!");
    }

    public static void updateProduct(int productId, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.quantity = quantity;
            p.price = price;
            System.out.println("Product updated!");
        } else {
            System.out.println("Product not found!");
        }
    }

    public static void deleteProduct(int productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Product deleted!");
        } else {
            System.out.println("Product not found!");
        }
    }

    public static void displayInventory() {
        for (Product p : inventory.values()) {
            p.display();
        }
    }

    public static void main(String[] args) {
        addProduct(new Product(1, "Laptop", 10, 75000));
        addProduct(new Product(2, "Mouse", 50, 500));

        displayInventory();

        updateProduct(2, 40, 450);
        deleteProduct(1);

        displayInventory();
    }
}
