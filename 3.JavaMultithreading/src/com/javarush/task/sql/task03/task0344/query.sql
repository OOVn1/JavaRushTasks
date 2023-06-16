-- Write your code here:
SELECT title
FROM films
         LEFT JOIN (SELECT last_name, id
                    FROM film_directors
                    WHERE film_directors.last_name = 'Spielberg') director
                   ON director.id = films.director_id;