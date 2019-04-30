-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 19-04-2019 a las 03:22:54
-- Versión del servidor: 5.7.24
-- Versión de PHP: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dbclinica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

DROP TABLE IF EXISTS `administrador`;
CREATE TABLE IF NOT EXISTS `administrador` (
  `id_Personal` int(3) NOT NULL AUTO_INCREMENT,
  `admi` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `clave` int(10) NOT NULL,
  `nombre` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_Personal`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`id_Personal`, `admi`, `clave`, `nombre`) VALUES
(1, 'kaido', 12345, 'bryan');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

DROP TABLE IF EXISTS `citas`;
CREATE TABLE IF NOT EXISTS `citas` (
  `dni` int(10) NOT NULL,
  `nom` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `apell` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `edad` int(3) NOT NULL,
  `seguro` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `especialidad` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `hora` varchar(5) COLLATE utf8_spanish_ci NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `citas`
--

INSERT INTO `citas` (`dni`, `nom`, `apell`, `edad`, `seguro`, `especialidad`, `hora`, `fecha`) VALUES
(33721144, 'celia', 'torres', 50, 'Preferencial', 'Oftalmologia', '16:00', '2019-03-27'),
(70118110, 'maylo', 'torres', 3, 'Seguro Privado', 'Cirujia', '16:40', '2019-03-26'),
(70118117, 'bryan', 'salva', 23, 'SIS', 'Medicina General', '10', '2019-03-20'),
(70118460, 'gerardo', 'rojas', 22, 'Seguro Privado', 'Cirujia', '16:00', '2019-03-25');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `doctores`
--

DROP TABLE IF EXISTS `doctores`;
CREATE TABLE IF NOT EXISTS `doctores` (
  `id_doctor` int(5) NOT NULL,
  `Especid` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `dni_pnt` int(5) NOT NULL,
  `nomb` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `apelli` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `id` int(5) NOT NULL,
  `edad` int(3) NOT NULL,
  `seguro` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `comentario` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_doctor`,`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `doctores`
--

INSERT INTO `doctores` (`id_doctor`, `Especid`, `dni_pnt`, `nomb`, `apelli`, `id`, `edad`, `seguro`, `comentario`) VALUES
(1, 'Denstista', 70118117, 'bryan', 'salva', 100, 23, 'SIS', 'tiene enfermedad cardivascular');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
