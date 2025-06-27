-- Table for accounts
CREATE TABLE accounts (
  account_id     NUMBER PRIMARY KEY,
  account_type   VARCHAR2(20),
  balance        NUMBER
);

-- Table for employees
CREATE TABLE employees (
  emp_id   NUMBER PRIMARY KEY,
  name     VARCHAR2(50),
  dept_id  NUMBER,
  salary   NUMBER
);

-- Sample accounts
INSERT INTO accounts VALUES (1001, 'savings', 10000);
INSERT INTO accounts VALUES (1002, 'savings', 15000);
INSERT INTO accounts VALUES (1003, 'current', 8000);

-- Sample employees
INSERT INTO employees VALUES (1, 'John', 10, 50000);
INSERT INTO employees VALUES (2, 'Alice', 10, 60000);
INSERT INTO employees VALUES (3, 'Bob', 20, 55000);

COMMIT;
