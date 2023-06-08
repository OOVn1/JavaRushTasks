-- Write your code here:
SELECT top_retailers.ret_name,
       top_retailers.ret_revenue,
       suppliers.sup_name,
       suppliers.sup_revenue
FROM top_retailers t
         JOIN suppliers s
              ON t.ret_revenue = s.sup_revenue;
