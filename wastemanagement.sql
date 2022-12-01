-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2022 at 03:12 PM
-- Server version: 5.5.39
-- PHP Version: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `wastemanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `addvehicle`
--

CREATE TABLE IF NOT EXISTS `addvehicle` (
`ID` int(20) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `ContactNo` varchar(20) NOT NULL,
  `Vehicle_No` int(20) NOT NULL,
  `Latitude` double NOT NULL,
  `Longitude` double NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `addvehicle`
--

INSERT INTO `addvehicle` (`ID`, `Name`, `ContactNo`, `Vehicle_No`, `Latitude`, `Longitude`) VALUES
(10, 'jayesh', '151616161', 123, 1000, 1000),
(11, 'Golu', '741741', 741741, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `adminlogindb`
--

CREATE TABLE IF NOT EXISTS `adminlogindb` (
`AID` int(20) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `adminlogindb`
--

INSERT INTO `adminlogindb` (`AID`, `Name`, `email`, `password`) VALUES
(1, 'Admin', 'admin@gmail.com', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `cndrequest`
--

CREATE TABLE IF NOT EXISTS `cndrequest` (
`cndid` int(40) NOT NULL,
  `title` varchar(40) NOT NULL,
  `description` varchar(40) NOT NULL,
  `address` varchar(40) NOT NULL,
  `status` varchar(40) NOT NULL DEFAULT 'Pending',
  `email` varchar(40) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Dumping data for table `cndrequest`
--

INSERT INTO `cndrequest` (`cndid`, `title`, `description`, `address`, `status`, `email`) VALUES
(1, 'zz', 'xsxs', 'zzz', 'Approved', '123'),
(2, 'dd', 'hgi', 'khg', 'Approved', '123'),
(3, 'fg', 'rt', 'rseth', 'Completed', '123'),
(4, 'rh', 'rh', 'rh', 'Disapproved', 'abc@'),
(5, 'hyy', 'ry', 'rte', 'Approved', 'abc@'),
(6, 'qwer', 'qwer', 'qwer', 'Approved', 'yash@'),
(7, 'asdfghjkl', 'asdfghjkl', 'asdfghjkl', 'Completed', 'abc@'),
(8, 'wertyu', 'wertyu', 'wertyu', 'Disapproved', 'abc@'),
(9, 'vdv', 'vdz', 'dsv', 'Completed', 'abc@'),
(10, 'ghrt', 'thioj', 'thoij', 'Disapproved', 'abc@'),
(11, 'dthrth', 'dtthd', 'dtrhhr', 'Completed', 'abc@'),
(12, 'jayesh', 'jayesh', 'jayesh', 'Completed', 'jayesh@gmail.com'),
(13, 'waste near Home', 'too much of dust near home', 'Nandurbar', 'Completed', 'shailesh@gmail.com'),
(14, 'waste', 'management', 'here', 'Completed', 'jayeshh@gamil.com'),
(15, 'watre', 'water', 'problem', 'Completed', 'jaykumar@gmail.com'),
(16, 'cnd waste', 'cnd waste', 'cnd waste', 'Completed', 'sh@gmail.com'),
(17, 'Waste near Dhule Home', 'Waste near Dhule home', 'Dhule', 'Pending', 'Golu@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `userlogin`
--

CREATE TABLE IF NOT EXISTS `userlogin` (
  `name` varchar(40) NOT NULL,
  `contactno` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `profession` varchar(40) NOT NULL,
  `address` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userlogin`
--

INSERT INTO `userlogin` (`name`, `contactno`, `email`, `password`, `profession`, `address`) VALUES
('abc', '789', 'abc@', '123', 'aa', 'aaad'),
('abc', '789', 'abc@', '123', 'aa', 'aaad'),
('shailesh', '12', 'shailesh@gmail.com', 'shailesh', 'shailesh', 'shailesh'),
('shailesh', '12', 'shailesh@gmail.com', 'cat', 'dfhs', 'dfsh'),
('yash', '7788', 'yash@', '778899', 'assdd', 'ndb'),
('Shailesh', '7768854039', 'shailesh@gamil.com', 'pass', 'student', 'nandurbar'),
('jayesh', '7788', 'jayesh@gmail.com', '123', 'student', 'shahada'),
('jayeshh', '123123', 'jayeshh@gamil.com', '123', 'student', 'nandurbar'),
('jaykumar', '789456123', 'jaykumar@gmail.com', '147', 'student', 'shirpur'),
('sh', '5555', 'sh@gmail.com', '456', 'student', 'nandurbar'),
('Golu', '147', 'Golu@gmail.com', '147', 'Student', 'Dhule'),
('Jayesh', '9921', 'jtc@gmail.com', '123', 'student', 'shahada');

-- --------------------------------------------------------

--
-- Table structure for table `viewcndreq`
--

CREATE TABLE IF NOT EXISTS `viewcndreq` (
`cid` int(40) NOT NULL,
  `title` varchar(40) NOT NULL,
  `desc` varchar(40) NOT NULL,
  `add` varchar(40) NOT NULL,
  `status` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `complition` varchar(40) NOT NULL DEFAULT 'Pending'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addvehicle`
--
ALTER TABLE `addvehicle`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `adminlogindb`
--
ALTER TABLE `adminlogindb`
 ADD PRIMARY KEY (`AID`);

--
-- Indexes for table `cndrequest`
--
ALTER TABLE `cndrequest`
 ADD PRIMARY KEY (`cndid`);

--
-- Indexes for table `viewcndreq`
--
ALTER TABLE `viewcndreq`
 ADD PRIMARY KEY (`cid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `addvehicle`
--
ALTER TABLE `addvehicle`
MODIFY `ID` int(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `adminlogindb`
--
ALTER TABLE `adminlogindb`
MODIFY `AID` int(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `cndrequest`
--
ALTER TABLE `cndrequest`
MODIFY `cndid` int(40) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT for table `viewcndreq`
--
ALTER TABLE `viewcndreq`
MODIFY `cid` int(40) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
