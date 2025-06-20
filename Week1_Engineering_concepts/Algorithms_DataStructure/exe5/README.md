# ✅ Task Management System (Java Project)

This project uses a **singly linked list** to manage tasks in a task management system. 

---

##  Exercise 5: Task Management System

### 1. Understand Linked Lists

####  Singly Linked List
- Each node points to the next node.
- Traversal is only forward.
- More memory-efficient than doubly linked lists.

####  Doubly Linked List
- Each node has `next` and `prev`.
- Allows traversal in both directions.
- Slightly more complex and memory-heavy.

---

### 2. Setup

- `Task` class holds task ID, name, and status.
- `TaskNode` is a wrapper for each linked list node.
- `TaskLinkedList` handles add, search, delete, and traverse logic.

---

### 3. Implementation

#### ✅ Features:
- Add task
- Search task by ID
- Display all tasks
- Delete task by ID

---

### 4. Analysis

| Operation | Time Complexity | Reason                          |
|-----------|------------------|---------------------------------|
| Add       | O(n)             | Traverse to end to add          |
| Search    | O(n)             | Traverse each node              |
| Traverse  | O(n)             | Visit all nodes                 |
| Delete    | O(n)             | May need to find and shift link|

---

###  Linked List vs Array

| Feature            | Linked List | Array      |
|--------------------|-------------|------------|
| Dynamic size       | ✅ Yes      | ❌ Fixed   |
| Fast insert/delete | ✅ Yes      | ❌ Slow    |
| Random access      | ❌ No       | ✅ Yes     |
| Memory             | More (nodes)| Less       |

✅ Linked lists are **better when you do frequent add/delete operations**.



