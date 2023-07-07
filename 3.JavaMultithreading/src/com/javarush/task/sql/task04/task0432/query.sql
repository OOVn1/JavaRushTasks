-- Write your code here:
SELECT MONTHNAME(date), COUNT(*)
FROM event
WHERE status = 'ERROR' OR status = 'FAILED'
GROUP BY MONTHNAME(date)
ORDER BY COUNT(*) DESC
LIMIT 1;