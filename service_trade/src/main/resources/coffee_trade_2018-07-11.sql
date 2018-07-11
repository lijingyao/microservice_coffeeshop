# ************************************************************
# Sequel Pro SQL dump
# Version 4499
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.16)
# Database: coffee_trade
# Generation Time: 2018-07-11 07:09:55 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table trade_order
# ------------------------------------------------------------

DROP TABLE IF EXISTS `trade_order`;

CREATE TABLE `trade_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `utc_create` datetime DEFAULT NULL,
  `utc_modified` datetime DEFAULT NULL,
  `order_id` varchar(64) NOT NULL,
  `payment_price` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=eucjpms;

LOCK TABLES `trade_order` WRITE;
/*!40000 ALTER TABLE `trade_order` DISABLE KEYS */;

INSERT INTO `trade_order` (`id`, `utc_create`, `utc_modified`, `order_id`, `payment_price`, `user_id`)
VALUES
	(1,'2018-07-10 14:13:49','2018-07-10 14:13:49','10106f7c60d4822013d901',102,1),
	(2,'2018-07-10 14:39:50','2018-07-10 14:39:50','10106f7c64cc441c26b601',72,1),
	(3,'2018-07-10 14:52:10','2018-07-10 14:52:10','10106f7c66b8901cba1d01',140,1);

/*!40000 ALTER TABLE `trade_order` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table trade_order_detail
# ------------------------------------------------------------

DROP TABLE IF EXISTS `trade_order_detail`;

CREATE TABLE `trade_order_detail` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `utc_create` datetime DEFAULT NULL,
  `utc_modified` datetime DEFAULT NULL,
  `additional` varchar(64) DEFAULT NULL,
  `item_id` int(11) DEFAULT NULL,
  `item_name` varchar(64) DEFAULT NULL,
  `main_order_id` varchar(64) NOT NULL,
  `order_id` varchar(64) NOT NULL,
  `price` bigint(20) DEFAULT NULL,
  `quantity` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `IDX_USER_ID` (`user_id`),
  KEY `IDX_MAIN_ORDER` (`main_order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=eucjpms;

LOCK TABLES `trade_order_detail` WRITE;
/*!40000 ALTER TABLE `trade_order_detail` DISABLE KEYS */;

INSERT INTO `trade_order_detail` (`id`, `utc_create`, `utc_modified`, `additional`, `item_id`, `item_name`, `main_order_id`, `order_id`, `price`, `quantity`, `user_id`)
VALUES
	(1,'2018-07-10 14:13:49','2018-07-10 14:13:49','1|-|HALF|-',1,'NEW la','10106f7c60d4822013d901','10106f7c60d48414b52002',68,2,1),
	(2,'2018-07-10 14:13:49','2018-07-10 14:13:49','-|0|HALF|-',2,'SugatCM','10106f7c60d4822013d901','10106f7c60d48418c46a02',34,1,1),
	(3,'2018-07-10 14:39:50','2018-07-10 14:39:50','1|-|HALF|-',3,'SOFTCM','10106f7c64cc441c26b601','10106f7c64cc4517242002',38,1,1),
	(4,'2018-07-10 14:39:50','2018-07-10 14:39:50','-|0|HALF|-',2,'SugatCM','10106f7c64cc441c26b601','10106f7c64cc4519e35b02',34,1,1),
	(5,'2018-07-10 14:52:10','2018-07-10 14:52:10','1|-|HALF|-',3,'SOFTCM','10106f7c66b8901cba1d01','10106f7c66b8911e8d6002',38,1,1),
	(6,'2018-07-10 14:52:10','2018-07-10 14:52:10','-|0|HALF|-',2,'SugatCM','10106f7c66b8901cba1d01','10106f7c66b8911a017002',34,1,1),
	(7,'2018-07-10 14:52:10','2018-07-10 14:52:10','1|-|HALF|-',1,'NEW la','10106f7c66b8901cba1d01','10106f7c66b8911a695d02',68,2,1);

/*!40000 ALTER TABLE `trade_order_detail` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
