-- Write your code here:
SELECT book.publication_year, book.isbn, book.title, a.full_name AS author, p.name AS publisher
FROM book
LEFT JOIN author a on a.id = book.author_id
LEFT JOIN publisher p on p.id = book.publisher_id