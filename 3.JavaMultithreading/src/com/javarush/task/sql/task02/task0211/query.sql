-- Write your code here:
SELECT IF(age <= 12, 'child', IF(age >= 20, 'adult', 'teenager')) FROM employee LIMIT 5;