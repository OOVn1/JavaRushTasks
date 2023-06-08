-- Write your code here:
SELECT gum.id,
       gum.name,
       cust.id
FROM gums AS gum,
     customers AS cust
WHERE cust.id < 50;