USE universityespe;

CREATE TABLE Course(
	idCourse int NOT NULL,
	nameCourse varchar(100),
	scheduleCourse varchar(200),
	costCourse float,
	instructor varchar(100),
	PRIMARY KEY (idCourse)
);

CREATE TABLE Student(
	idStudent int NOT NULL,
	idCourseStu int,
	nameStudent varchar(50),
	deposit float,
	PRIMARY KEY (idStudent),
)	