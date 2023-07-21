-- Write your code here:
SELECT name FROM book JOIN author a on a.id = book.author_id
WHERE a.full_name = 'Mark Twain'
GROUP BY name;