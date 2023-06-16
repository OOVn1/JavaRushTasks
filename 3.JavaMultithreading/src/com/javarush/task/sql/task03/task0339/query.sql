-- Write your code here:
SELECT *
FROM authors
WHERE id IN (SELECT author_id
                          FROM books
                          WHERE genre = 'fantasy');
