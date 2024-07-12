CREATE DATABASE animals;

USE animals;

CREATE TABLE otters(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    species VARCHAR(50) NOT NULL,
    age INT,
    weight DECIMAL(5,2) );


INSERT INTO
    Otters (name, species, age, weight)
    VALUES ('Kai', 'Sea Otter', 4, 25.5),
           ('Luna', 'River Otter', 3, 18.2),
           ('Milo', 'Giant Otter', 7, 42.1),
           ('Poppy', 'Sea Otter', 2, 14.8),
           ('River', 'River Otter', 5, 21.3),
           ('Samara', 'Marine Otter', 6, 37.9);


