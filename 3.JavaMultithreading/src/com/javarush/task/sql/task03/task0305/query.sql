-- Write your code here:
SELECT g.id,
       g.name,
       c.name,
       c.email
FROM gums AS g, customers AS c;