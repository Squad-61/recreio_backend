-- -----------------------------------------------------
-- Schema recreio
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `recreio`;

CREATE SCHEMA IF NOT EXISTS `recreio` DEFAULT CHARACTER SET utf8;
USE `recreio`;

-- -----------------------------------------------------
-- Table `Client`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Client`;

CREATE TABLE IF NOT EXISTS `Client` (
  `idClient` VARCHAR(256) NOT NULL UNIQUE,
  `name` VARCHAR(60) NULL,
  `cpf` VARCHAR(11) NULL UNIQUE,
  `birthday` DATE NULL,
  `email` VARCHAR(45) NULL,
  `passwd` VARCHAR(256) NULL,
  PRIMARY KEY (`idClient`)
) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `Student`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Student` ;

CREATE TABLE IF NOT EXISTS `Student` (
  `idStudent` VARCHAR(256) NOT NULL UNIQUE,
  `RM` INT NOT NULL UNIQUE,
  PRIMARY KEY (`idStudent`),
  CONSTRAINT `fk_Student_Profile`
    FOREIGN KEY (`idStudent`)
    REFERENCES `Client` (`idClient`)
) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `Parent`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Parent` ;

CREATE TABLE IF NOT EXISTS `Parent` (
  `idParent` VARCHAR(256) NOT NULL UNIQUE,
  PRIMARY KEY (`idParent`),
  CONSTRAINT `fk_Parent_Profile1`
    FOREIGN KEY (`idParent`)
    REFERENCES `Client` (`idClient`)
) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `Teacher`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Teacher` ;

CREATE TABLE IF NOT EXISTS `Teacher` (
  `idTeacher` VARCHAR(256) NOT NULL UNIQUE,
  `isVluntary` TINYINT NULL DEFAULT 0,
  PRIMARY KEY (`idTeacher`),
  CONSTRAINT `fk_Teacher_Profile1`
    FOREIGN KEY (`idTeacher`)
    REFERENCES `Client` (`idClient`)
) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `Contract`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Contract` ;

CREATE TABLE IF NOT EXISTS `Contract` (
  `idContract` INT NOT NULL UNIQUE,
  `contractName` VARCHAR(45) NOT NULL UNIQUE,
  `contractURL` VARCHAR(256) NOT NULL UNIQUE,
  PRIMARY KEY (`idContract`)
) ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Teacher_has_Contract`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Teacher_has_Contract` ;

CREATE TABLE IF NOT EXISTS `Teacher_has_Contract` (
  `idTeacher` VARCHAR(256) NOT NULL UNIQUE,
  `idContract` INT NOT NULL UNIQUE,
  PRIMARY KEY (`idTeacher`, `idContract`),
  CONSTRAINT `fk_Teacher_has_Contract`
    FOREIGN KEY (`idTeacher`)
    REFERENCES `Teacher` (`idTeacher`),
  CONSTRAINT `fk_Contract_has_Teacher`
    FOREIGN KEY (`idContract`)
    REFERENCES `Contract` (`idContract`)
) ENGINE = InnoDB;
