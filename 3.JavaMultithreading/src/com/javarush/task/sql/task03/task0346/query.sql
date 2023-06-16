-- Write your code here:
SELECT *
FROM films
         JOIN (SELECT year_born, id
               FROM film_directors
               WHERE year_born < 1940) director
              ON director.id = films.director_id
WHERE films.genre = 'sci-fi';