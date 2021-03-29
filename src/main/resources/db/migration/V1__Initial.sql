CREATE TABLE IF NOT EXISTS question (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(200));
INSERT INTO question (name) VALUES ('Who do you like most?');

CREATE TABLE IF NOT EXISTS answer (id INT AUTO_INCREMENT PRIMARY KEY, question_id INT, name VARCHAR(200));
INSERT INTO answer (question_id, name) VALUES (1, 'cats');
INSERT INTO answer (question_id, name) VALUES (1, 'dogs');

CREATE TABLE IF NOT EXISTS vote (id INT AUTO_INCREMENT PRIMARY KEY, answer_id INT);

CREATE VIEW vote_count AS SELECT answer_id, COUNT(id) AS count FROM vote GROUP BY answer_id;