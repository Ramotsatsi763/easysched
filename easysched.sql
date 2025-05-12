CREATE DATABASE IF NOT EXISTS easysched;
USE easysched;

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(100) NOT NULL UNIQUE,
  password VARCHAR(100) NOT NULL
);

CREATE TABLE timeslots (
  id INT AUTO_INCREMENT PRIMARY KEY,
  date DATE NOT NULL,
  time TIME NOT NULL,
  status VARCHAR(50) DEFAULT 'available'
);

CREATE TABLE appointments (
  id INT AUTO_INCREMENT PRIMARY KEY,
  user_id INT,
  timeslot_id INT,
  FOREIGN KEY (user_id) REFERENCES users(id),
  FOREIGN KEY (timeslot_id) REFERENCES timeslots(id)
);

-- Sample timeslots
INSERT INTO timeslots (date, time) VALUES
('2025-05-14', '10:00:00'),
('2025-05-14', '11:00:00'),
('2025-05-14', '12:00:00');
