public class SearchService {
    private SearchStrategy strategy;

    public SearchService(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public Product performSearch(Product[] products, String keyword) {
        return strategy.search(products, keyword);
    }
}
