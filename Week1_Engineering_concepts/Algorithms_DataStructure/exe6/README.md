#  Library Management System (Java Project)

This project demonstrates searching for books in a library using **Linear Search** and **Binary Search**, built using beginner-friendly Java code.

---

##  Exercise 6: Library Management System

### 1. Understand Search Algorithms

####  Linear Search
- Checks each item one by one.
- Simple and works on **unsorted** data.
- Time complexity: **O(n)**

####  Binary Search
- Only works on **sorted** data.
- Divides the search range in half each step.
- Time complexity: **O(log n)**

---

### 2. Setup

- `Book` class → stores `bookId`, `title`, and `author`.
- `LinearSearch` → basic loop to find a book.
- `BinarySearch` → sorts first, then applies binary search.
- `Library` → calls both search functions.
- `Main` → runs the program.

---

### 3. Implementation

####  Features:
- Store a list of books in an array
- Display all books
- Search by title using:
  - Linear Search
  - Binary Search (with sorting)

---

### 4. Analysis

| Operation      | Linear Search | Binary Search |
|----------------|---------------|---------------|
| Time Complexity| O(n)          | O(log n)      |
| Needs Sorted?  | No            | Yes           |
| When to Use    | Small data or unsorted | Large or sorted data |



