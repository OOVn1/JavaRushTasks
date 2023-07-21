-- Write your code here:
SELECT name, YEAR(discovery_date) AS d_year, MONTHNAME(discovery_date) AS d_month, DAYNAME(discovery_date) AS d_day
FROM object;