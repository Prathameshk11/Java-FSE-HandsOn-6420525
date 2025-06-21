#  Financial Forecasting Tool 

This project forecasts future financial values based on a fixed annual growth rate using **recursive algorithms**, and demonstrates how to optimize them.

---

##  Exercise 7: Financial Forecasting

### 1. Understand Recursive Algorithms

####  What is recursion?
- A function that calls itself to break a problem into smaller subproblems.
- It simplifies logic for repetitive tasks like calculating power, factorial, etc.

---

### 2. Setup

- We created a recursive method to calculate future value based on:
  FV = PV * (1 + rate)^n

- Inputs:
- `PV`: Principal value (starting amount)
- `rate`: Growth rate (e.g., 5% → 0.05)
- `n`: Number of years

---

### 3. Implementation

- `FinancialForecast.java` → basic recursive version
- `OptimizedForecast.java` → memoized version (stores results)
- `Main.java` → runs both methods and prints results

---

### 4. Analysis

| Version        | Time Complexity | Space Complexity | Comment                    |
|----------------|------------------|------------------|----------------------------|
| Basic Recursion| O(n)             | O(n) (call stack)| Recalculates same values   |
| Memoized       | O(n)             | O(n) (HashMap)   | Faster with no repeats     |

---

###  Why optimize recursion?
- Without optimization, recursion **repeats the same calculations**.
- Memoization stores results to avoid repeated work.
- Makes recursion scalable for larger inputs.




