-- Write your code here:
INSERT INTO sale_addresses
SELECT street, city, ctate, zip_code, country FROM customers;