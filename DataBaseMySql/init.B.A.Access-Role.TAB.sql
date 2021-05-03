USE ResumeCreator;

CREATE TABLE AccessRole(
    idAccessRole INTEGER NOT NULL AUTO_INCREMENT,
    idPersonalInformation INTEGER NOT NULL,
    rol nvarchar(20) NOT NULL,
    userAccess nvarchar(20) NOT NULL,
    passwordAccess nvarchar(20) NOT NULL,
    readingAccess BOOLEAN NOT NULL,
    writingAccess BOOLEAN NOT NULL,
    userCreation nvarchar(20) NOT NULL,
    dateCreation DateTime NOT NULL,
    userModification nvarchar(20),
    dateModification DateTime,
    CONSTRAINT PK_AccessRole_idAccessRole PRIMARY KEY (idAccessRole)
);