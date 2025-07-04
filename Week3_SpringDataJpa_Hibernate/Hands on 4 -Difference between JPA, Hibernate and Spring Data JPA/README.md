# 📝 Exercise 4: Difference Between JPA, Hibernate, and Spring Data JPA

---

## 🔸 Java Persistence API (JPA)
- JPA is a **Java specification (JSR 338)** for object-relational mapping (ORM).
- It provides a standard way to persist Java objects into relational databases.
- JPA itself does **not include any implementation**.
- Requires a **JPA provider** like Hibernate to function.

---

## 🔸 Hibernate
- Hibernate is a **popular ORM tool** and a **JPA implementation**.
- It handles object-relational mapping and database operations.
- Provides features beyond the JPA specification (e.g., HQL, caching).
- Requires **manual configuration**, session management, and transactions (if not used with Spring).

---

## 🔸 Spring Data JPA
- Spring Data JPA is a **Spring-based abstraction layer** over JPA.
- It does **not implement JPA**, but uses Hibernate (or another provider) under the hood.
- Minimizes boilerplate code using interfaces like `JpaRepository`.
- Manages transactions and sessions automatically (especially in Spring Boot).
- Enables automatic query generation using method names.

---

## 🔁 Code Comparison

### 🔹 Hibernate Example
```java
public Integer addEmployee(Employee employee) {
    Session session = factory.openSession();
    Transaction tx = null;
    Integer employeeID = null;

    try {
        tx = session.beginTransaction();
        employeeID = (Integer) session.save(employee);
        tx.commit();
    } catch (HibernateException e) {
        if (tx != null) tx.rollback();
        e.printStackTrace();
    } finally {
        session.close();
    }
    return employeeID;
}
```
### 🔹 Spring Data JPA Example

**EmployeeRepository.java**
```java
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
```

**EmployeeService.java**

```java
@Autowired
private EmployeeRepository employeeRepository;

@Transactional
public void addEmployee(Employee employee) {
    employeeRepository.save(employee);
}
```
### 📊 Summary Table

| Feature                | JPA                       | Hibernate                            | Spring Data JPA                  |
|------------------------|---------------------------|---------------------------------------|----------------------------------|
| Type                   | Specification             | Implementation                        | Abstraction                      |
| ORM Features           | Defined                   | Provided                              | Delegated to Hibernate           |
| Reduces Boilerplate    | ❌                        | ❌                                    | ✅                               |
| Transaction Management | Manual                    | Manual (unless integrated)            | Automatic                        |
| Query Methods          | Requires JPQL             | Requires HQL                          | Auto-generated                   |
