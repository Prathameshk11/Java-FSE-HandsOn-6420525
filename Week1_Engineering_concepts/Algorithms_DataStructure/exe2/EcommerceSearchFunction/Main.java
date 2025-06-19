public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Shoes", "Footwear"),
            new Product(4, "Watch", "Accessories")
        };

        System.out.println("Linear Search: Looking for 'Phone'");
        SearchService linearService = new SearchService(new LinearSearch());
        Product result1 = linearService.performSearch(products, "Phone");
        if (result1 != null) result1.display();
        else System.out.println("Product not found");

        System.out.println("\nBinary Search: Looking for 'Watch'");
        SearchService binaryService = new SearchService(new BinarySearch());
        Product result2 = binaryService.performSearch(products, "Watch");
        if (result2 != null) result2.display();
        else System.out.println("Product not found");
    }
}
