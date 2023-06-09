ALTER TABLE `PHAROS`.`CANDIDATE` DROP FOREIGN KEY `fk_CANDIDATE_GENDER_1`;
ALTER TABLE `PHAROS`.`CANDIDATE` DROP FOREIGN KEY `fk_CANDIDATE_NATIONALITY_1`;
ALTER TABLE `PHAROS`.`CANDIDATE` DROP FOREIGN KEY `fk_CANDIDATE_ID_DOCUMENT_1`;
ALTER TABLE `PHAROS`.`ADDRESS` DROP FOREIGN KEY `fk_ADDRESS_CANDIDATE_1`;

DROP TABLE IF EXISTS `PHAROS`.`CANDIDATE`;
DROP TABLE IF EXISTS `PHAROS`.`DOCUMENT`;
DROP TABLE IF EXISTS `PHAROS`.`GENDER`;
DROP TABLE IF EXISTS `PHAROS`.`NATIONALITY`;
DROP TABLE IF EXISTS `PHAROS`.`ADDRESS`;

DROP SCHEMA IF EXISTS "PHAROS" CASCADE;

CREATE DATABASE `PHAROS`;

CREATE TABLE `PHAROS`.`CANDIDATE`  (
  `CANDIDATE_ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID DE REGISTRO ',
  `PHAROS_ID` varchar(255) NOT NULL COMMENT 'ID DE PHAROS',
  `NAME` varchar(255) NOT NULL COMMENT 'NOMBRE(S) DEL CANDIDATO',
  `LASTNAME` varchar(255) NOT NULL COMMENT 'APELLIDO(S) DEL CANDIDATO',
  `BIRTHDATE` date NOT NULL COMMENT 'FECHA DE NACIMIENTO DEL CANDIDATO (FORMATO YYYY-MM-DD)',
  `EMAIL` varchar(255) NOT NULL COMMENT 'DATO DE CONTACTO: EMAIL DEL CANDIDATO',
  `PHONE` varchar(255) NOT NULL COMMENT 'DATO DE CONTACTO: TELEFONO DEL CANDIDATO',
  `STATUS` varchar(255) NOT NULL COMMENT 'STATUS DEL CANDIDATO(1. REGISTRADO, 2. ESPERANDO HABILIDAR, 3. HABILIDATO, 4. DESHABILITADO, 5. BLOQUEADO)',
  `ENABLE` varchar(5) NOT NULL COMMENT 'REGISTRO DEL CANDIDATO HABILITADO O DESHABILITADO (TRUE/FALSE)',
  `ACTIVATIONCODE` varchar(255) NULL COMMENT 'CODIGO DE ACTIVACION DEL CANDIDATO, SOLO PARA EL ESTATUS 2.',
  `GENDER_ID` int NULL,
  `NATIONALITY_ID` int NULL,
  `DOCUMENT_ID` int NULL,
  `ADDRESS_ID` int NULL,
  PRIMARY KEY (`CANDIDATE_ID`)
);

CREATE TABLE `PHAROS`.`DOCUMENT`  (
  `DOCUMENT_ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID DE DOCUMENTO DE IDENTIDAD',
  `IDENTITY_DOCUMENT` varchar(255) NOT NULL COMMENT 'VALOR O DESCRIPCION DEL DOCUMENTO DE IDENTIDAD',
  `ENABLE` varchar(5) NOT NULL COMMENT 'REGISTRO DE DOCUMENTO DE IDENTIDAD HABILITADO O DESHABILITADO (TRUE/FALSE)',
  PRIMARY KEY (`DOCUMENT_ID`)
);

CREATE TABLE `PHAROS`.`GENDER`  (
  `GENDER_ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID DE GENERO',
  `GENDERVAL` varchar(255) NOT NULL COMMENT 'VALOR DE GENERO',
  `ENABLE` varchar(5) NOT NULL COMMENT 'REGISTRO DE GENERO HABILITADO O DESHABILITADO (TRUE/FALSE)',
  PRIMARY KEY (`GENDER_ID`)
);

CREATE TABLE `PHAROS`.`NATIONALITY`  (
  `NATIONALITY_ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID DE NACIONALIDAD',
  `NATIONALITYVAL` varchar(255) NOT NULL COMMENT 'VALOR DE NACIONALIDAD',
  `ENABLE` varchar(5) NOT NULL COMMENT 'REGISTRO DE NACIONALIDAD HABILITADO O DESHABILITADO (TRUE/FALSE)',
  PRIMARY KEY (`NATIONALITY_ID`)
);

CREATE TABLE `PHAROS`.`ADDRESS`  (
  `ADDRESS_ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID DE ADDRESS',
  `STREET` text NOT NULL COMMENT 'VALOR CORRESPONDIENTE A LA CALLE Y NUMERO DE VIVIENDA.',
  `CITY` varchar(100) NOT NULL COMMENT 'VALOR CORRESPONDIENTE A LA CIUDAD DONDE SE UBICA LA VIVIENDA.',
  `PROVINCE` varchar(100) NOT NULL COMMENT 'VALOR CORRESPONDIENTE AL ESTADO, REGIÓN O PROVINCIA DONDE SE UBICA LA VIVIENDA.',
  `POSTCODE` varchar(10) NOT NULL COMMENT 'VALOR CORRESPONDIENTE AL CÓDIGO POSTAL DE LA VIVIENDA.',
  `COUNTRY` varchar(100) NOT NULL COMMENT 'VALOR CORRESPONDIENTE AL PAÍS DONDE SE ENCUENTRA LA VIVIENDA.',
  `STATUS` varchar(10) NOT NULL COMMENT 'VALOR QUE IDENTIFICA SI LA DIRECCIÓN DEL REGISTRO ES LA ACTUAL VIVIENDA (CURRENT) O SI ES UNA DIRECCIÓN ANTERIOR (PREVIOUS).',
  PRIMARY KEY (`ADDRESS_ID`)
);

ALTER TABLE `PHAROS`.`CANDIDATE` ADD CONSTRAINT `fk_CANDIDATE_GENDER_1` FOREIGN KEY (`GENDER_ID`) REFERENCES `PHAROS`.`GENDER` (`GENDER_ID`);
ALTER TABLE `PHAROS`.`CANDIDATE` ADD CONSTRAINT `fk_CANDIDATE_NATIONALITY_1` FOREIGN KEY (`NATIONALITY_ID`) REFERENCES `PHAROS`.`NATIONALITY` (`NATIONALITY_ID`);
ALTER TABLE `PHAROS`.`CANDIDATE` ADD CONSTRAINT `fk_CANDIDATE_ID_DOCUMENT_1` FOREIGN KEY (`DOCUMENT_ID`) REFERENCES `PHAROS`.`DOCUMENT` (`DOCUMENT_ID`);
ALTER TABLE `PHAROS`.`CANDIDATE` ADD CONSTRAINT `fk_ADDRESS_CANDIDATE_1` FOREIGN KEY (`ADDRESS_ID`) REFERENCES `PHAROS`.`ADDRESS` (`ADDRESS_ID`);

