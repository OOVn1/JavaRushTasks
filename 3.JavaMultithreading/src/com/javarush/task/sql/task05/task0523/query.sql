-- Write your code here:
SELECT number, inventory, ROUND(inventory * 1.01) AS with_spare_parts
FROM lego_set;