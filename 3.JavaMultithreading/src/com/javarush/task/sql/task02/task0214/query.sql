-- Write your code here:
SELECT
    CASE experience
           WHEN experience < 1 THEN 'junior'
           WHEN experience < 3 THEN 'middle'
           WHEN experience < 5 THEN 'senior'
    END
FROM developers;