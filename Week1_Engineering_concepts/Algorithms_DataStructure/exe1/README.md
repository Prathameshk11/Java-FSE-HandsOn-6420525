# Inventory Management System 

## Exercise 1: Inventory Management System

### 1. Understand the Problem

In a warehouse, there can be thousands of products. If we use bad data structures, even simple tasks like searching for a product or updating quantity can become slow. That’s why we need efficient ways (like HashMaps) to store and access data quickly.

####  Data Structure Used:
I chose to use a `HashMap<Integer, Product>` because:
- `productId` can be used as a unique key
- It allows fast insert, update, delete operations (all in O(1) time)

---

###  2. Setup

- I created a Java class called `Product` to store product details like `productId`, `productName`, `quantity`, and `price`.
- I also created a main class `InventorySystem` where all operations like add, update, delete are performed using a `HashMap`.

---

###  3. Implementation

####  Features implemented:
- Add new product
- Update existing product
- Delete a product
- Display all products

####  Code Summary:
- Used a `Product` class to model the data.
- Used `HashMap` to store product data with `productId` as the key.

##  4. Analysis

###  Time Complexity (using HashMap)

- **Add**: O(1)  
- **Update**: O(1)  
- **Delete**: O(1)  
- **Search**: O(1)  

`HashMap` is very efficient for key-based operations. This becomes especially helpful when the inventory size increases, as operations remain fast regardless of the number of products.

---

###  Optimization Ideas

- Use a **database like MySQL** if the product data needs to be stored permanently.
- If there are **multiple users**, using `ConcurrentHashMap` would make operations thread-safe.
- Add more features like:
  - **Search by product name**
  - **Filter by price range or quantity**
  - **Sorting options**

---

###  What I Learned

- How to use **HashMaps** in a real-world problem
- How to model objects using **Java classes**
- Why **time complexity** matters as the size of data grows

