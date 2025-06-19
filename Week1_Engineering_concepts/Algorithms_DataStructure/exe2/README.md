#  E-commerce Platform Search Function

This is a simple Java project that implements search functionality for an e-commerce platform.

---

##  Exercise 2: E-commerce Platform Search Function

### 1. Understand Asymptotic Notation

####  What is Big O Notation?
Big O notation tells us how fast or slow an algorithm is as the input size grows. It's used to compare performance and efficiency.

- **Best Case**: The fastest time (e.g., the item is the first one in the list)
- **Average Case**: The expected time in a typical scenario
- **Worst Case**: The slowest time (e.g., the item is not found or is last in the list)

| Search Method   | Best Case | Average Case | Worst Case |
|----------------|-----------|---------------|-------------|
| Linear Search   | O(1)     | O(n)          | O(n)        |
| Binary Search   | O(1)     | O(log n)      | O(log n)    |

---

### 2. Setup

I created the following classes:

- `Product` - holds product details (`id`, `name`, `category`)
- `SearchStrategy` - an interface for search algorithms
- `LinearSearch` - goes through each product one by one
- `BinarySearch` - searches faster using sorted product names
- `SearchService` - performs search using the selected strategy
- `Main` - runs the search demo

---

### 3. Implementation

####  Features Implemented:
- Perform **linear search** on an unsorted array
- Perform **binary search** on a sorted array
- Use **OOP principles** like interfaces and classes


####  How It Works:
- `SearchService` uses a strategy (either linear or binary)
- You can swap the strategy without changing the core logic

---

### 4. Analysis

####  Time Complexity

| Operation         | Time Complexity |
|------------------|------------------|
| Linear Search     | O(n)             |
| Binary Search     | O(log n)         |

####  Which one is better?
- **Binary Search** is faster but needs a **sorted array**
- **Linear Search** is simple and works on any array

####  When to use what?
- If the product list is small or unsorted → use Linear Search
- If the list is large and sorted → use Binary Search

---

###  What I Learned

- How search algorithms work
- How to use OOP concepts in real-world problems
- How separating logic makes code easier to manage

---

