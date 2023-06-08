-- Write your code here:
SELECT *
FROM top_retailers t
         JOIN suppliers s ON t.ret_location = s.sup_country;