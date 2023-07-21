-- Write your code here:
# CREATE TABLE users(
#     user_id INT AUTO_INCREMENT PRIMARY KEY,
#     first_name VARCHAR(255),
#     last_name VARCHAR(255)
# )

CREATE TABLE users(
    user_id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    PRIMARY KEY (user_id)
)