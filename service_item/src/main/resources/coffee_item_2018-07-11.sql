# ************************************************************
# Sequel Pro SQL dump
# Version 4499
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.16)
# Database: coffee_item
# Generation Time: 2018-07-11 07:09:02 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table category
# ------------------------------------------------------------

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `utc_create` datetime DEFAULT NULL,
  `utc_modified` datetime DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `simple_name` varchar(64) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=eucjpms;

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;

INSERT INTO `category` (`id`, `utc_create`, `utc_modified`, `name`, `simple_name`)
VALUES
	(1,'2018-07-08 15:25:40','2018-07-08 15:25:40','Latte','L'),
	(2,'2018-07-08 15:26:23','2018-07-08 15:26:23','Caramel Macchiato','CM');

/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table item_info
# ------------------------------------------------------------

DROP TABLE IF EXISTS `item_info`;

CREATE TABLE `item_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `utc_create` datetime DEFAULT NULL,
  `utc_modified` datetime DEFAULT NULL,
  `cat_id` int(11) NOT NULL,
  `description` varchar(256) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `price` bigint(20) NOT NULL,
  `opt_lock` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=eucjpms;

LOCK TABLES `item_info` WRITE;
/*!40000 ALTER TABLE `item_info` DISABLE KEYS */;

INSERT INTO `item_info` (`id`, `utc_create`, `utc_modified`, `cat_id`, `description`, `name`, `price`, `opt_lock`)
VALUES
	(1,'2018-07-10 11:35:04','2018-07-10 11:35:04',1,'La','NEW la',30,0),
	(2,'2018-07-10 11:38:26','2018-07-10 11:38:26',2,'CM','SugatCM',34,0),
	(3,'2018-07-10 11:50:06','2018-07-10 11:50:06',2,'CM','SOFTCM',34,0),
	(4,'2018-07-10 11:53:06','2018-07-10 11:53:06',1,'LA','Special HangzhouLA',32,0);

/*!40000 ALTER TABLE `item_info` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
