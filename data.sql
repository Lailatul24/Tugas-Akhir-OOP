-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2020 at 08:47 AM
-- Server version: 10.3.15-MariaDB
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data`
--

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `id_dosen` int(10) NOT NULL,
  `nama_dosen` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dosen`
--

INSERT INTO `dosen` (`id_dosen`, `nama_dosen`) VALUES
(1, 'imron'),
(2, 'yusuf');

-- --------------------------------------------------------

--
-- Table structure for table `kelas`
--

CREATE TABLE `kelas` (
  `nama_kelas` varchar(15) NOT NULL,
  `Ketua_Tingkat` varchar(25) NOT NULL,
  `id_Dosen` varchar(15) NOT NULL,
  `Nama_Dosen` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelas`
--

INSERT INTO `kelas` (`nama_kelas`, `Ketua_Tingkat`, `id_Dosen`, `Nama_Dosen`) VALUES
('3A', 'Rifqiyah', '1', 'imron'),
('3B', 'Gak ero', '2', 'yusuf');

-- --------------------------------------------------------

--
-- Stand-in structure for view `kj`
-- (See below for the actual view)
--
CREATE TABLE `kj` (
`ID_Mhs` varchar(15)
,`Nama_Mhs` varchar(30)
,`id_dosen` int(10)
,`nama_dosen` varchar(25)
,`Kd_Matkul` int(15)
,`Matkul` varchar(25)
,`nama_kelas` varchar(15)
,`Ketua_Tingkat` varchar(25)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `kuliah`
-- (See below for the actual view)
--
CREATE TABLE `kuliah` (
`ID_Mhs` varchar(15)
,`Nama_Mhs` varchar(30)
,`id_dosen` int(10)
,`nama_dosen` varchar(25)
,`Kd_Matkul` int(15)
,`Matkul` varchar(25)
,`nama_kelas` varchar(15)
,`Ketua_Tingkat` varchar(25)
);

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `ID_Mhs` varchar(15) NOT NULL,
  `Nama_Mhs` varchar(30) NOT NULL,
  `Alamat` varchar(20) NOT NULL,
  `id_Dosen` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`ID_Mhs`, `Nama_Mhs`, `Alamat`, `id_Dosen`) VALUES
('2000', 'lailatul', 'Pasuruan', '1'),
('2001', 'Yusuf', 'Malang', '1'),
('2018', 'Muhammad', 'Pasuruan', '1'),
('2019', 'Shofiyah', 'Malang', '2'),
('2020', 'Afidah', 'Pandaan', '2');

-- --------------------------------------------------------

--
-- Table structure for table `matkul`
--

CREATE TABLE `matkul` (
  `Kd_Matkul` int(15) NOT NULL,
  `Matkul` varchar(25) NOT NULL,
  `Nama_dosen` varchar(25) NOT NULL,
  `id_Dosen` varchar(15) NOT NULL,
  `SKS` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `matkul`
--

INSERT INTO `matkul` (`Kd_Matkul`, `Matkul`, `Nama_dosen`, `id_Dosen`, `SKS`) VALUES
(1, 'OOP', 'imron', '1', '20 sks'),
(2, 'database', 'sarwani', '2', '18 sks'),
(3, 'www', 'ttt', '888', '9'),
(9, 'Jaringn', 'Faishol', '5', '20 sks');

-- --------------------------------------------------------

--
-- Stand-in structure for view `tugas`
-- (See below for the actual view)
--
CREATE TABLE `tugas` (
`ID_Mhs` varchar(15)
,`Nama_Mhs` varchar(30)
,`id_dosen` int(10)
,`nama_dosen` varchar(25)
,`Kd_Matkul` int(15)
,`Matkul` varchar(25)
,`nama_kelas` varchar(15)
,`Ketua_Tingkat` varchar(25)
);

-- --------------------------------------------------------

--
-- Structure for view `kj`
--
DROP TABLE IF EXISTS `kj`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `kj`  AS  select `mahasiswa`.`ID_Mhs` AS `ID_Mhs`,`mahasiswa`.`Nama_Mhs` AS `Nama_Mhs`,`dosen`.`id_dosen` AS `id_dosen`,`dosen`.`nama_dosen` AS `nama_dosen`,`matkul`.`Kd_Matkul` AS `Kd_Matkul`,`matkul`.`Matkul` AS `Matkul`,`kelas`.`nama_kelas` AS `nama_kelas`,`kelas`.`Ketua_Tingkat` AS `Ketua_Tingkat` from (((`mahasiswa` join `dosen`) join `matkul`) join `kelas`) where `mahasiswa`.`id_Dosen` = `dosen`.`id_dosen` and `matkul`.`id_Dosen` = `dosen`.`id_dosen` and `kelas`.`id_Dosen` = `dosen`.`id_dosen` ;

-- --------------------------------------------------------

--
-- Structure for view `kuliah`
--
DROP TABLE IF EXISTS `kuliah`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `kuliah`  AS  select `mahasiswa`.`ID_Mhs` AS `ID_Mhs`,`mahasiswa`.`Nama_Mhs` AS `Nama_Mhs`,`dosen`.`id_dosen` AS `id_dosen`,`dosen`.`nama_dosen` AS `nama_dosen`,`matkul`.`Kd_Matkul` AS `Kd_Matkul`,`matkul`.`Matkul` AS `Matkul`,`kelas`.`nama_kelas` AS `nama_kelas`,`kelas`.`Ketua_Tingkat` AS `Ketua_Tingkat` from (((`mahasiswa` join `dosen`) join `matkul`) join `kelas`) where `mahasiswa`.`id_Dosen` = 1 and `dosen`.`id_dosen` = 1 and `matkul`.`id_Dosen` = 1 and `kelas`.`id_Dosen` = 1 ;

-- --------------------------------------------------------

--
-- Structure for view `tugas`
--
DROP TABLE IF EXISTS `tugas`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `tugas`  AS  select `mahasiswa`.`ID_Mhs` AS `ID_Mhs`,`mahasiswa`.`Nama_Mhs` AS `Nama_Mhs`,`dosen`.`id_dosen` AS `id_dosen`,`dosen`.`nama_dosen` AS `nama_dosen`,`matkul`.`Kd_Matkul` AS `Kd_Matkul`,`matkul`.`Matkul` AS `Matkul`,`kelas`.`nama_kelas` AS `nama_kelas`,`kelas`.`Ketua_Tingkat` AS `Ketua_Tingkat` from (((`mahasiswa` join `dosen`) join `matkul`) join `kelas`) where `mahasiswa`.`id_Dosen` = 1 and `dosen`.`id_dosen` = 1 and `matkul`.`id_Dosen` = 1 and `kelas`.`id_Dosen` = 1 ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`id_dosen`);

--
-- Indexes for table `kelas`
--
ALTER TABLE `kelas`
  ADD PRIMARY KEY (`nama_kelas`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`ID_Mhs`);

--
-- Indexes for table `matkul`
--
ALTER TABLE `matkul`
  ADD PRIMARY KEY (`Kd_Matkul`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dosen`
--
ALTER TABLE `dosen`
  MODIFY `id_dosen` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
