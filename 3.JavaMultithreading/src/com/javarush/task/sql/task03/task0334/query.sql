-- Write your code here:
SELECT аuthor.last_name AS author,
       аuthor.country   AS author_country,
       book.genre     AS book_genre
FROM authors аuthor
         LEFT JOIN books book
              ON аuthor.author_id = book.author_id
WHERE book_genre = 'fantasy'
GROUP BY author, author_country, book_genre
ORDER BY author_country
LIMIT 5;