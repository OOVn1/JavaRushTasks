-- Write your code here:
SELECT top_retailers.name                AS company_name,
       top_retailers.rank                AS company_rank,
       suppliers.annual_revenue_billions AS supplier_revenue
FROM top_retailers,
     suppliers
WHERE supplier_revenue > 25;