--create user_role table
DROP TABLE IF EXISTS user_role;

CREATE TABLE user_role
(
  role_id INT PRIMARY KEY AUTO_INCREMENT,
  role_name VARCHAR(5) NOT NULL
);

INSERT INTO user_role (role_name) VALUES ('user');

--create user table
USE salescenter;

DROP TABLE IF EXISTS user;

CREATE TABLE user
(
  user_id INT PRIMARY KEY AUTO_INCREMENT,
  user_name VARCHAR(20) UNIQUE NOT NULL,
  user_f_name VARCHAR(15) NOT NULL,
  user_l_name VARCHAR(15) NOT NULL,
  user_pass VARCHAR(25) NOT NULL,
  email VARCHAR(40) NOT NULL,
  phone BIGINT NOT NULL,
  role INT(1) DEFAULT 1
);

INSERT INTO user (user_name,user_f_name, user_l_name, user_pass, email, phone)
    VALUES ('tester', 'first', 'last', 'pass', 'test@test.com', 1231231234);