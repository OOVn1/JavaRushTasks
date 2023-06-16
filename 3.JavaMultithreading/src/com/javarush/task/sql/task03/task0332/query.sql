-- Write your code here:
SELECT аuth.last_name     AS author,
       book.genre         AS book_title,
       book.date_released AS book_genre
FROM authors аuth
         RIGHT JOIN books book
                    ON аuth.author_id = book.author_id
WHERE book.book_genre < 1900
GROUP BY book.genre, book.book_genre;