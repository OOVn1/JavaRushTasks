-- Write your code here:
SELECT department,
       position,
       COUNT(*) AS total
FROM employee
GROUP BY department, position
HAVING position = 'manager' OR total = 1
LIMIT 2 OFFSET 1;