-- Write your code here:
SELECT c.zop_code, o.order_id
FROM customers c
         LEFT JOIN orders o
                   ON c.customer_id = o.customer_id
WHERE shipped_date IS NOT NULL
  AND o.store_id = 27;