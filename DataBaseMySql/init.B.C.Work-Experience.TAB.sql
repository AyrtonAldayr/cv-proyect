USE ResumeCreator;

CREATE TABLE WorkExperience(
    idWorkExperience INTEGER NOT NULL AUTO_INCREMENT,
    idPersonalInformation INTEGER NOT NULL,
    companyName nvarchar(20),
    position nvarchar(20),
    descriptionPosition nvarchar(100),
    contractStartDate nvarchar(10),
    contractEndDate nvarchar(10),
    userCreation nvarchar(20) NOT NULL,
    dateCreation DateTime NOT NULL,
    userModification nvarchar(20),
    dateModification DateTime,
    CONSTRAINT PK_WorkExperience_idWorkExperience PRIMARY KEY (idWorkExperience)
);