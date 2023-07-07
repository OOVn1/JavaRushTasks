-- Write your code here:
SELECT YEAR(date), MONTH(date), DAY(date), COUNT(*)
FROM event
GROUP BY YEAR(date), MONTH(date), DAY(date)
HAVING COUNT(*) > 5
