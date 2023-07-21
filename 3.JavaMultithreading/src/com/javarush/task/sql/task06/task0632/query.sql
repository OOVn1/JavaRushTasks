-- Write your code here:
ALTER TABLE event
ADD FOREIGN KEY (user_id)
REFERENCE users (id)
ON UPDATE CASCADE
ON DELETE SET NULL;