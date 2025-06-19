public class SortService {
    private SortStrategy strategy;

    public SortService(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void performSort(Order[] orders) {
        strategy.sort(orders);
    }
}
