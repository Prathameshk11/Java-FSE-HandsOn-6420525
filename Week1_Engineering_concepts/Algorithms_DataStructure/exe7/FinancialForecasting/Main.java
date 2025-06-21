public class Main {
    public static void main(String[] args) {
        double principal = 10000; 
        double rate = 0.05;       
        int years = 10;

        System.out.println(" Basic Recursive Forecast:");
        double result1 = FinancialForecast.calculateFutureValue(principal, rate, years);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, result1);

        System.out.println("\n Optimized Recursive Forecast (Memoization):");
        double result2 = OptimizedForecast.calculateFutureValue(principal, rate, years);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, result2);
    }
}
