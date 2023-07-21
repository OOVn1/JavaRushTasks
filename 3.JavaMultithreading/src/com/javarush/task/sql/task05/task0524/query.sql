-- Write your code here:
SELECT isbn, title FROM book JOIN author a on a.id = book.author_id
WHERE a.last_name LIKE 'S%';