-- Write your code here:
SELECT gum.location,
       person.location
FROM gums AS gum,
     customers AS person
WHERE person.location != 'London'
GROUP BY gum.location, person.location;