BEGIN
  FOR rec IN (
    SELECT customer_id, name, loan_due_date
    FROM customers
    WHERE loan_due_date BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: ' || rec.name || ' (ID: ' || rec.customer_id || ') has a loan due on ' || TO_CHAR(rec.loan_due_date, 'DD-MON-YYYY'));
  END LOOP;
END;
/
