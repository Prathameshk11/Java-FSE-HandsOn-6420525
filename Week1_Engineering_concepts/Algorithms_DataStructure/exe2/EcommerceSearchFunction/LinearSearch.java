public class LinearSearch implements SearchStrategy {
    @Override
    public Product search(Product[] products, String keyword) {
        for (Product p : products) {
            if (p.getProductName().equalsIgnoreCase(keyword)) {
                return p;
            }
        }
        return null;
    }
}
