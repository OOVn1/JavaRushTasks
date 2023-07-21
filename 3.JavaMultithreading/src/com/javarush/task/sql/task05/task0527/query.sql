-- Write your code here:
SELECT title FROM book JOIN author a on a.id = book.author_id
WHERE a.full_name = 'Edgar Allan Poe'
GROUP BY title;