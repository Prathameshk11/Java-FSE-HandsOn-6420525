public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Ravi", 8500.0),
            new Order(102, "Sneha", 2300.5),
            new Order(103, "Amit", 12500.0),
            new Order(104, "Priya", 4900.75)
        };

        System.out.println(" Bubble Sort (By Total Price):");
        SortService bubbleSortService = new SortService(new BubbleSort());
        bubbleSortService.performSort(orders);
        for (Order o : orders) o.display();

        orders = new Order[] {
            new Order(101, "Ravi", 8500.0),
            new Order(102, "Sneha", 2300.5),
            new Order(103, "Amit", 12500.0),
            new Order(104, "Priya", 4900.75)
        };

        System.out.println("\n Quick Sort (By Total Price):");
        SortService quickSortService = new SortService(new QuickSort());
        quickSortService.performSort(orders);
        for (Order o : orders) o.display();
    }
}
