-- Write your code here:
SELECT
    CASE position
           WHEN 'backend developer' THEN 'yes'
           WHEN 'frontend developer' THEN 'yes'
           else 'no'
    END
FROM employee
WHERE department = 'cool devs';