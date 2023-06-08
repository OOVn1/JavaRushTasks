-- Write your code here:
SELECT *
FROM customers c
         JOIN orders o
              ON c.customer_id = o.customer_id
WHERE o.total_cost > 100;