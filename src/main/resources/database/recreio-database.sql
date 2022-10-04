DROP DATABASE IF EXISTS `recreio`;

CREATE DATABASE IF NOT EXISTS `recreio`
	DEFAULT CHARACTER SET utf8mb4
    DEFAULT COLLATE utf8mb4_general_ci;
 
USE `recreio`;
 
CREATE TABLE IF NOT EXISTS `profile` (
	pkProfile VARCHAR(256) PRIMARY KEY NOT NULL,
    firstName VARCHAR(30) NOT NULL,
    lastName VARCHAR(30) NOT NULL,
    birthday DATE NOT NULL,
    email VARCHAR(60) NOT NULL,
    passwd VARCHAR(256) NOT NULL
);

CREATE TABLE IF NOT EXISTS `parent` (
	pkParent VARCHAR(256) PRIMARY KEY NOT NULL,
    fkProfile VARCHAR(256) NOT NULL
);

CREATE TABLE IF NOT EXISTS `student` (
	pkStudent VARCHAR(256) NOT NULL,
    rm VARCHAR(20) NOT NULL,
    fkProfile VARCHAR(256) NOT NULL,
    fkParent VARCHAR(256) NOT NULL
);

CREATE TABLE IF NOT EXISTS `teacher` (
	pkTeacher VARCHAR(256) PRIMARY KEY NOT NULL,
    contrato BLOB DEFAULT NULL,
    isVoluntary BOOLEAN DEFAULT FALSE,
    fkProfile VARCHAR(256) NOT NULL
);

ALTER TABLE `parent` ADD FOREIGN KEY (`fkProfile`) REFERENCES `profile`(`pkProfile`);
ALTER TABLE `student` ADD FOREIGN KEY (`fkProfile`) REFERENCES `profile`(`pkProfile`);
ALTER TABLE `teacher` ADD FOREIGN KEY (`fkProfile`) REFERENCES `profile`(`pkProfile`);

ALTER TABLE `student` ADD FOREIGN KEY (`fkParent`) REFERENCES `parent`(`pkParent`);

INSERT INTO recreio.profile
	(pkProfile, firstName, lastName, birthday, email, passwd)
VALUES
	('1', 'Gui', 'Aug', '2001-09-13', 'guiaug@gmail.com', '109876543'),
	('2', 'Foo', 'Bar', '2001-09-13', 'foobar@gmail.com', '123456789'),
    ('3', 'tester', '001', '2002-12-02', 'tester001@gamil.com', '4567898766');

SELECT * FROM recreio.profile;

INSERT INTO recreio.parent
	(pkParent, fkProfile)
VALUES
	('1', '2');
    
SELECT * FROM recreio.parent;

INSERT INTO recreio.student
	(pkStudent, rm, fkProfile, fkParent)
VALUES
	('1', '123-123-123', '1', '1');

SELECT * FROM recreio.student;

INSERT INTO recreio.teacher
	(pkTeacher, contrato, isVoluntary, fkProfile)
VALUES
	('1', null, false, '3');

SELECT * FROM recreio.teacher;