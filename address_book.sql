-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 03, 2018 at 06:45 PM
-- Server version: 5.7.22-0ubuntu0.16.04.1
-- PHP Version: 7.0.30-0ubuntu0.16.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `address_book`
--

-- --------------------------------------------------------

--
-- Table structure for table `contact`
--

CREATE TABLE `contact` (
  `Name` varchar(255) NOT NULL,
  `job` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(500) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contact`
--

INSERT INTO `contact` (`Name`, `job`, `phone`, `email`, `image`) VALUES
('Shashwat \nShukla', 'MNNIT \n', '+91-8205021252-Main\n', 'shashwat.07@gmail.com-Main\n', NULL),
('Shivam \nMaan', 'BSRC \nStudent', '+91-9413521252-Mobile\n', 'smaan@gmail.com-Main\n', NULL),
('Shruti \nPandey', ' \n', '+91-961069039-Work\n+91-9079261430-Mobile\n', 'pandeybookandstationers@gmail.com-Work\nshrutipandey@gmail.com-Personal\n', NULL),
('Yash \nSrivastav', 'MNNIT\n', '+91-7355241680-Main\n', 'yash@gmail.com-Main\nyash@outlook.com-Main\nyash@hotmail.com-Main\n', NULL),
('aman \n', ' \n', '+91-9647896475-Main\n', 'aman@gmail.com-Main\naman@apple.com-Main\n', NULL),
('Archit \n', 'MNNIT \n', '+91-9648792158-Main\n', '-Main\n', '/shrey/Downloads/images.png'),
('aman \n', 'MNNIT \n', '+91-8506889039-Mobile\n', 'aman@hotmail.com-Main\n', '/home/shrey/NetBeansProjects/Address%20Book/build/classes/main/Webp.net-resizeimage.png'),
('Akash \nGupta', ' \n', '+91-9694202909-Mobile\n+91-7014245787-Main\n', '-Main\n', '/home/shrey/NetBeansProjects/Address%20Book/build/classes/main/Webp.net-resizeimage.png'),
('Ambulance \n', 'GOI \n', '+91-102-Main\n', '-Main\n', '/home/shrey/NetBeansProjects/Address%20Book/build/classes/main/Webp.net-resizeimage.png'),
('Anurag \nGarg', ' \n', '+91-9314064800-Main\n', '-Main\n', '/home/shrey/NetBeansProjects/Address%20Book/build/classes/main/Webp.net-resizeimage.png');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
