-- Write your code here:
SELECT department,
       position,
       COUNT(*) AS total
FROM employee
GROUP BY department, position
HAVING position = 'frontend developer' AND total > 1
LIMIT 1;
