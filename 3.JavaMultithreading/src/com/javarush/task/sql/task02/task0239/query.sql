-- Write your code here:
SELECT YEAR(date_of_birth), MONTH(date_of_birth)
FROM employee
WHERE MONTH(date_of_birth) IN (1, 2, 12);