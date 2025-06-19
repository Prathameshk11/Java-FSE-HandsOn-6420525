#  Employee Management System 

This project implements a basic system to manage employee records using arrays in Java.

---

##  Exercise 4: Employee Management System

### 1. Understand Array Representation

- Arrays are stored in **contiguous blocks of memory**.
- Each element can be accessed using an index.
- Advantage: **Fast random access** using index (`O(1)` time).

---

### 2. Setup

I created:
- `Employee` class → holds data like `employeeId`, `name`, `position`, and `salary`.
- `EmployeeService` class → manages employees using an array.

---

### 3. Implementation

####  Features:
- Add an employee
- Search by `employeeId`
- Traverse and display all employees
- Delete an employee by ID


---

### 4. Analysis

| Operation     | Time Complexity | Reason                        |
|---------------|------------------|-------------------------------|
| Add           | O(1)             | Add at next index             |
| Search        | O(n)             | May need to look through all |
| Traverse      | O(n)             | Visit each employee once     |
| Delete        | O(n)             | Shift elements after delete  |

---

### Limitations of Arrays

- **Fixed size** – can't grow dynamically
- Insertion/deletion in middle = shifting = slow
- Better options: **ArrayList**, **LinkedList** for dynamic use cases



