import java.util.HashMap;

public class OptimizedForecast {

    private static HashMap<Integer, Double> memo = new HashMap<>();

    public static double calculateFutureValue(double principal, double rate, int years) {
        if (years == 0) return principal;

        if (memo.containsKey(years)) {
            return memo.get(years);
        }

        double value = (1 + rate) * calculateFutureValue(principal, rate, years - 1);
        memo.put(years, value);
        return value;
    }
}
