CREATE SCHEMA `firmadb` DEFAULT CHARACTER SET utf8 COLLATE utf8_turkish_ci ;

CREATE TABLE `firmadb`.`personel` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `adi` VARCHAR(45) NULL,
  `soyadi` VARCHAR(45) NULL,
  `tecrube` VARCHAR(2) NULL,
  PRIMARY KEY (`id`));


INSERT INTO `firmadb`.`personel` (`id`, `adi`, `soyadi`, `tecrube`) VALUES ('1', 'Burak', 'Yılmaz', '4');

UPDATE `firmadb`.`personel` SET `adi`='Hasan', `soyadi`='Bayat' WHERE `id`='3';

DELETE FROM `firmadb`.`personel` WHERE `id`='4';

SELECT * FROM firmadb.personel;