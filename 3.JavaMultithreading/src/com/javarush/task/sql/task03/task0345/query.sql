-- Write your code here:
SELECT last_name
FROM film_directors
         LEFT JOIN (SELECT grossed, director_id
                    FROM films
                    WHERE grossed > 100) film
                   ON film_directors.id = film.director_id
WHERE film_directors.country = 'UK';