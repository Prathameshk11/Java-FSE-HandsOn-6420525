public class FinancialForecast {

    public static double calculateFutureValue(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return (1 + rate) * calculateFutureValue(principal, rate, years - 1);
    }
}
