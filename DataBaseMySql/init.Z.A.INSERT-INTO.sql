USE ResumeCreator;

INSERT INTO `ResumeCreator`.`PersonalInformation`
(`fatherLastName`,`motherFirstName`,`firstName`,
`secondName`,`otherNames`,
`email`,`userCreation`,`dateCreation`,
`userModification`,`dateModification`)
VALUES
('Fernandez','Martinez','Miguel',
'Angel',null,
'ejemplo@gmail.com',CURRENT_USER(),
SYSDATE(),null,null);

INSERT INTO `ResumeCreator`.`PersonalInformation`
(`fatherLastName`,`motherFirstName`,`firstName`,
`secondName`,`otherNames`,
`email`,`userCreation`,`dateCreation`,
`userModification`,`dateModification`)
VALUES
('Medina','Mendoza','Luis',
'Miguel',null,
'ejemplo2@gmail.com',CURRENT_USER(),SYSDATE(),
null,null);

INSERT INTO `ResumeCreator`.`PersonalInformation`
(`fatherLastName`,`motherFirstName`,`firstName`,
`secondName`,`otherNames`,
`email`,`userCreation`,`dateCreation`,
`userModification`,`dateModification`)
VALUES
('Zuares','Quitanilla','Carlos',
'Miguel',null,
'ejemplo3@gmail.com',CURRENT_USER(),SYSDATE(),
null,null);

INSERT INTO `ResumeCreator`.`AccessRole`
(`idPersonalInformation`,`rol`,`userAccess`,
`passwordAccess`,`readingAccess`,`writingAccess`,
`userCreation`,`dateCreation`,
`userModification`,`dateModification`)
VALUES
('1','ADMINISTRADOR','admin',
	'admin',true,true,
CURRENT_USER(),SYSDATE(),
null,null);