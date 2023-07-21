-- Write your code here:
CREATE TABLE users(
    user_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    date DATE NOT NULL DEFAULT GETDATE(),
    weight FLOAT(10) NULL
)