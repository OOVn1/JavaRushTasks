-- Write your code here:
UPDATE employee SET
salary = salary + 1000
WHERE id IN
(SELECT employee_id FROM task
WHERE exp_date > '2022-10-01');