-- Write your code here:
SELECT required, identifier, descriptio FROM parts WHERE description IS NULL OR required IS true;