# 📦 Sorting Customer Orders 

This project implements sorting customer orders by their `totalPrice` to help prioritize high-value orders on an e-commerce platform. It uses both **Bubble Sort** and **Quick Sort**.

---

##  Exercise 3: Sorting Customer Orders

### 1. Understand Sorting Algorithms

####  Bubble Sort
- Repeatedly swaps adjacent elements if they are in the wrong order.
- Simple but slow.

####  Quick Sort
- Uses a divide-and-conquer strategy.
- Picks a pivot and places elements smaller to the left and larger to the right.
- Much faster than Bubble Sort for large data sets.

| Algorithm   | Best Case   | Average Case | Worst Case |
|-------------|-------------|---------------|-------------|
| Bubble Sort | O(n)        | O(n²)         | O(n²)       |
| Quick Sort  | O(n log n)  | O(n log n)    | O(n²)       |

---

### 2. Setup

I created the following classes:

- `Order` – Holds `orderId`, `customerName`, and `totalPrice`
- `SortStrategy` – Interface for sorting strategy
- `BubbleSort` – Implements bubble sort
- `QuickSort` – Implements quick sort
- `SortService` – Accepts a sort strategy and performs sort
- `Main` – Runs the demo and prints sorted orders

---

### 3. Implementation

####  Features:
- Sort customer orders by `totalPrice`
- Demonstrates both Bubble Sort and Quick Sort
- Uses interface-based design (Strategy Pattern)

####  How It Works:
- `SortService` class takes a `SortStrategy` (Bubble or Quick)
- You can switch algorithms without changing the rest of the code
- Orders are displayed after sorting

---

### 4. Analysis

####  Bubble Sort vs Quick Sort

| Feature            | Bubble Sort        | Quick Sort          |
|--------------------|--------------------|----------------------|
| Simple to write    | ✅ Yes             | ❌ Slightly harder   |
| Efficient          | ❌ No (O(n²))      | ✅ Yes (O(n log n))  |
| Best for small data| ✅                 | ✅                   |
| Real-world use     | ❌ Rarely used     | ✅ Widely used       |

####  Conclusion:
- Use **Bubble Sort** for small datasets or when learning.
- Use **Quick Sort** for real applications where performance matters.

---




