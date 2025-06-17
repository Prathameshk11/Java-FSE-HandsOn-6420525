public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileUser = new MobileApp("Alice");
        Observer webUser = new WebApp("Bob");

        market.register(mobileUser);
        market.register(webUser);

        market.setStockPrice(105.75f);
        market.setStockPrice(108.40f);

        market.deregister(mobileUser);
        market.setStockPrice(110.00f);
    }
}
