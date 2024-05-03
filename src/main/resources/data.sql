CREATE TABLE IF NOT EXISTS users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
);

-- password: 123
INSERT INTO users (name, email, password) VALUES
  ('Mathias Hahner', 'mathias@gmail.com', '$2y$10$n6WHK0Uxb69A5aGHU3xk4.jo7kV56Y0Rkm0ic8YfIMj2V268vRrhC');
