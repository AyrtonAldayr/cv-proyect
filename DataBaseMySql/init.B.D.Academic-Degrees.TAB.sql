USE ResumeCreator;

CREATE TABLE AcademicDegrees(
    idAcademicDegrees INTEGER NOT NULL AUTO_INCREMENT,
    idPersonalInformation INTEGER NOT NULL,
    academicDgree nvarchar(30),
    studyCenter nvarchar(50),    
    nameOfTheRace nvarchar(20),    
    studyStartDate nvarchar(10),
    studyEndDate nvarchar(10),
    userCreation nvarchar(20) NOT NULL,
    dateCreation DateTime NOT NULL,
    userModification nvarchar(20),
    dateModification DateTime,
    CONSTRAINT PK_AcademicDegrees_idAcademicDegrees PRIMARY KEY (idAcademicDegrees)
);