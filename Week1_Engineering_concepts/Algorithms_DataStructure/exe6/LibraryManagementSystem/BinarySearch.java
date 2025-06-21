import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Book searchByTitle(Book[] books, String title) {
        Arrays.sort(books, Comparator.comparing(b -> b.getTitle().toLowerCase()));

        int low = 0, high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);
            if (cmp == 0) return books[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
}       
