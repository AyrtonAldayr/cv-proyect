USE ResumeCreator;

CREATE TABLE PersonalInformation(
    idPersonalInformation INTEGER NOT NULL AUTO_INCREMENT,
    typeDocument nvarchar(5),
    numberDocument nvarchar(12),
    fatherLastName nvarchar(20),
    motherFirstName nvarchar(20),
    firstName nvarchar(20),    
    secondName nvarchar(20),
    otherNames nvarchar(100),
    numberPhone nvarchar(9),
    email nvarchar(100),
    userCreation nvarchar(20) NOT NULL,
    dateCreation DateTime NOT NULL,
    userModification nvarchar(20),
    dateModification DateTime,
    CONSTRAINT PK_PersonalInformation_idPersonalInformation PRIMARY KEY (idPersonalInformation)
);