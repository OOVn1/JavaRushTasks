-- Write your code here:
SELECT *
FROM film_directors
         RIGHT JOIN (SELECT title, director_id
               FROM films
               WHERE year_released > 1990) film
              ON film_directors.id = film.director_id
WHERE film_directors.country = 'USA'
LIMIT 5;