-- Write your code here:
SELECT full_name, COUNT(*) AS books FROM book JOIN author a on a.id = book.author_id
GROUP BY full_name
HAVING books > 1;
