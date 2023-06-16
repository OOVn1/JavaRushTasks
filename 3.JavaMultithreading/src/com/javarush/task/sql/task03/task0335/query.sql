-- Write your code here:
SELECT аuthor.country AS author_country,
       COUNT(book.book_id) AS book_count
FROM authors аuthor
         JOIN books book
              ON аuthor.id = book.author_id
WHERE book.genre = 'novel'
GROUP BY author_country
HAVING COUNT(book.book_id) > 2;