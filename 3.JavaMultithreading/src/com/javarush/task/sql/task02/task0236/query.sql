-- Write your code here:
SELECT departament, position, COUNT(*)
FROM employee
GROUP BY departament, position;