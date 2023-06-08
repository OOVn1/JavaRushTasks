-- Write your code here:
SELECT gum.location,
       visitor.name,
       visitor.sex
FROM gums AS gum, customers AS visitor;