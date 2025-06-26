BEGIN
  FOR rec IN (SELECT customer_id FROM customers WHERE age > 60) LOOP
    UPDATE customers
    SET loan_interest_rate = loan_interest_rate - 1
    WHERE customer_id = rec.customer_id;
  END LOOP;
  COMMIT;
END;
/
