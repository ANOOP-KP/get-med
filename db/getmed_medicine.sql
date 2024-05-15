-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: getmed
-- ------------------------------------------------------
-- Server version	5.7.11-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `medicine`
--

DROP TABLE IF EXISTS `medicine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicine` (
  `med_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `med_name` varchar(45) NOT NULL,
  `med_description` varchar(200) NOT NULL,
  `med_usage` varchar(200) NOT NULL DEFAULT 'Prescribed by doctor',
  `med_price` varchar(10) NOT NULL DEFAULT '0',
  `image_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`med_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicine`
--

LOCK TABLES `medicine` WRITE;
/*!40000 ALTER TABLE `medicine` DISABLE KEYS */;
INSERT INTO `medicine` VALUES (1,'Dolo 650','Antibiotic','Daily 3 after meals  ','',NULL),(2,'Gelusil 100mg','Reduces acidity ','2 Tab daily before meals','',NULL),(3,'Aspirin 300mg','Treat mild to moderate pain, inflammation or arthritis','1 Each 6 hours with or just after food ','',NULL),(4,'Nexpro Rd40','Used to treat infections caused by bacteria','1 Hour before or 2 hour after meals','',NULL),(5,'Calpol','For Fever and Cold','3 tabs after meals','0',NULL),(6,'Glimy','For Cholestrol control','1 at night after meals','0',NULL),(7,'Gravol','For stopping vomitting','1 before meals morning and night','0',NULL),(8,'Loritax','Prevent diarrhoea','1 in morning before meals','0',NULL),(9,'Migrest','For controlling Migraine','1 when feeling migraine','0',NULL),(10,'Solvin','Quick relief from Cough','Daily 2 after meals','0',NULL);
/*!40000 ALTER TABLE `medicine` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-15 15:39:55
