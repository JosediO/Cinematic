USE cinematicdatabase;

CREATE TABLE movies (
	id INT PRIMARY KEY,
    name VARCHAR(30),
	gender ENUM('ACTION','ANAMATION','COMEDY','DRAMA','HORROR','MUSICAL','ROMANTIC','ROMANTIC_COMEDY','SCIENCE_FICTION','THRILLER'),
	created_at DATETIME,
    updated_at DATETIME

);