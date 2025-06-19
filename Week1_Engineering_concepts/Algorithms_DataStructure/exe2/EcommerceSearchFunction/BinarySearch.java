import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch implements SearchStrategy {
    @Override
    public Product search(Product[] products, String keyword) {
        Arrays.sort(products, Comparator.comparing(p -> p.getProductName().toLowerCase()));

        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].getProductName().compareToIgnoreCase(keyword);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
}
