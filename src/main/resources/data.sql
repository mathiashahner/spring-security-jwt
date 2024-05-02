CREATE TABLE IF NOT EXISTS users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  age INT NOT NULL
);

-- CREATE TABLE IF NOT EXISTS todo (
--   id INT AUTO_INCREMENT PRIMARY KEY,
--   users_id INT FOREIGN KEY REFERENCES users(users_id)
--   title VARCHAR(255) NOT NULL,
--   description VARCHAR(1024) NOT NULL,
--   status INT NOT NULL
-- );

INSERT INTO users (name, email, age) VALUES
  ('Emily', 'emily@gmail.com', 23),
  ('Mathias', 'mathias@hotmail.com', 22);
