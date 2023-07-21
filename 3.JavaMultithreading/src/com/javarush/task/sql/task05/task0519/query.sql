-- Write your code here:
SELECT released, COUNT(*) AS total FROM lego_set
WHERE number < 100000
GROUP BY released
ORDER BY total DESC;
