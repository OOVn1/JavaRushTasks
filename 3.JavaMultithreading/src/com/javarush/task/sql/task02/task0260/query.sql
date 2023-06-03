-- Write your code here:
SELECT rating, GROUP_CONCAT(name)
FROM employee
ORDER BY rating
HAVING rating > 2;