-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: ספטמבר 30, 2020 בזמן 07:03 PM
-- גרסת שרת: 10.4.11-MariaDB
-- PHP Version: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hsts`
--

-- --------------------------------------------------------

--
-- מבנה טבלה עבור טבלה `questions`
--

CREATE TABLE `questions` (
  `Topic_code` int(2) NOT NULL,
  `Question_code` int(3) NOT NULL,
  `Question` text NOT NULL,
  `Question_Remarks` text NOT NULL,
  `Answer_1` text DEFAULT NULL,
  `Answer_2` text NOT NULL,
  `Answer_3` text NOT NULL,
  `Answer_4` text NOT NULL,
  `Open_answer` text NOT NULL,
  `Correct_Answer` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- הוצאת מידע עבור טבלה `questions`
--

INSERT INTO `questions` (`Topic_code`, `Question_code`, `Question`, `Question_Remarks`, `Answer_1`, `Answer_2`, `Answer_3`, `Answer_4`, `Open_answer`, `Correct_Answer`) VALUES
(1, 1, 'what you get if you mix all colors of light?', 'no remarks', 'Black', 'Blue', 'White', 'Green', '', 'White'),
(1, 2, 'what you get if you mix all colors of paint?', '', '', '', '', '', 'ok', 'Black'),
(1, 3, 'test test!!!', 'test', 'yes', 'no', 'maybe', 'all the above', '', 'none'),
(1, 4, 'what you get if you mix all colors of paint?', '', '1', '2', '3', '4', '', 'Black'),
(1, 5, 'what you get if you mix all colors of paint?', '', '', '', '', '', 'ok', 'Black');

-- --------------------------------------------------------

--
-- מבנה טבלה עבור טבלה `students`
--

CREATE TABLE `students` (
  `Student_ID` int(9) NOT NULL,
  `Student_Name` varchar(54) NOT NULL,
  `Student_Email` varchar(54) NOT NULL,
  `Student_Classroom` varchar(20) NOT NULL,
  `Student_Password` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- הוצאת מידע עבור טבלה `students`
--

INSERT INTO `students` (`Student_ID`, `Student_Name`, `Student_Email`, `Student_Classroom`, `Student_Password`) VALUES
(316151232, 'Nido AS', 'nido@choco.com', '11 A', '316151232');

-- --------------------------------------------------------

--
-- מבנה טבלה עבור טבלה `teachers`
--

CREATE TABLE `teachers` (
  `Teacher_ID` int(9) NOT NULL,
  `Teacher_Name` varchar(54) NOT NULL,
  `Teacher_Email` varchar(54) NOT NULL,
  `Topic` varchar(30) NOT NULL,
  `Teacher_Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- הוצאת מידע עבור טבלה `teachers`
--

INSERT INTO `teachers` (`Teacher_ID`, `Teacher_Name`, `Teacher_Email`, `Topic`, `Teacher_Password`) VALUES
(38163630, 'Jo', '11.kanj@gmail.com', 'Calculus2', '038163630'),
(316151232, 'Nido', 'nido@golan.com', 'Russian Language', '316151232');

--
-- Indexes for dumped tables
--

--
-- אינדקסים לטבלה `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`Question_code`);

--
-- אינדקסים לטבלה `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`Student_ID`);

--
-- אינדקסים לטבלה `teachers`
--
ALTER TABLE `teachers`
  ADD PRIMARY KEY (`Teacher_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
