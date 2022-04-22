-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 17-11-2021 a las 07:21:06
-- Versión del servidor: 8.0.27
-- Versión de PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sowad`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id_cat` int UNSIGNED NOT NULL,
  `nomb_cat` varchar(30) DEFAULT NULL,
  `desc_cat` varchar(50) DEFAULT NULL,
  `fecha_cat` date DEFAULT NULL,
  `est_cat` varchar(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`id_cat`, `nomb_cat`, `desc_cat`, `fecha_cat`, `est_cat`) VALUES
(1, 'valor', 'des', NULL, '1'),
(2, 'va2', 'des2', NULL, '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cli` int UNSIGNED NOT NULL,
  `dni_cli` varchar(11) DEFAULT NULL,
  `nombres_cli` varchar(40) DEFAULT NULL,
  `direc_cli` varchar(40) DEFAULT NULL,
  `celul_cli` varchar(9) DEFAULT NULL,
  `correo_cli` varchar(40) DEFAULT NULL,
  `fecha_cli` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `id_compra` int UNSIGNED NOT NULL,
  `comprobante_compra` varchar(20) NOT NULL DEFAULT 'FACTURA',
  `ncomp_compra` varchar(20) DEFAULT NULL,
  `total_compra` decimal(10,0) DEFAULT NULL,
  `id_user` int UNSIGNED NOT NULL,
  `id_pro` int UNSIGNED NOT NULL,
  `fecha_compra` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detcompra`
--

CREATE TABLE `detcompra` (
  `id_detcompra` int UNSIGNED NOT NULL,
  `cantidad` int DEFAULT NULL,
  `id_pro` int UNSIGNED NOT NULL,
  `id_compra` int UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detventa`
--

CREATE TABLE `detventa` (
  `id_detventa` int UNSIGNED NOT NULL,
  `cantidad` int DEFAULT NULL,
  `id_pro` int UNSIGNED NOT NULL,
  `id_venta` int UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_pro` int UNSIGNED NOT NULL,
  `codigo_pro` varchar(20) DEFAULT NULL,
  `nombre_pro` varchar(40) DEFAULT NULL,
  `id_cat` int UNSIGNED NOT NULL,
  `pcompra_pro` decimal(10,0) DEFAULT NULL,
  `pventa_pro` decimal(10,0) DEFAULT NULL,
  `stock_pro` int UNSIGNED DEFAULT NULL,
  `fecha_pro` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_pro`, `codigo_pro`, `nombre_pro`, `id_cat`, `pcompra_pro`, `pventa_pro`, `stock_pro`, `fecha_pro`) VALUES
(1, '00001', 'desds', 1, '12', '13', 10, '2021-11-17'),
(2, '000002', 'dddddd', 1, '15', '16', 10, '2021-11-17');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `id_pro` int UNSIGNED NOT NULL,
  `ruc_pro` varchar(11) DEFAULT NULL,
  `razon_pro` varchar(40) DEFAULT NULL,
  `tel_pro` varchar(9) DEFAULT NULL,
  `dir_pro` varchar(40) DEFAULT NULL,
  `correo_pro` varchar(40) DEFAULT NULL,
  `fecha_pro` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `puesto`
--

CREATE TABLE `puesto` (
  `id_puesto` int UNSIGNED NOT NULL,
  `nombre_puesto` varchar(20) NOT NULL,
  `descripcion_puesto` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_user` int UNSIGNED NOT NULL,
  `dni_user` varchar(8) DEFAULT NULL,
  `nombres_user` varchar(40) DEFAULT NULL,
  `celul_user` varchar(9) DEFAULT NULL,
  `correo_user` varchar(40) DEFAULT NULL,
  `contra_user` varchar(40) DEFAULT NULL,
  `acceso_user` varchar(40) DEFAULT NULL,
  `fecha_user` date DEFAULT NULL,
  `id_puesto` int UNSIGNED NOT NULL,
  `estado_user` varchar(1) DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `id_venta` int UNSIGNED NOT NULL,
  `id_user` int UNSIGNED NOT NULL,
  `id_cli` int UNSIGNED NOT NULL,
  `comprobante_venta` varchar(20) NOT NULL DEFAULT 'BOLETA',
  `ncompr_venta` varchar(20) DEFAULT NULL,
  `total_venta` decimal(10,0) DEFAULT NULL,
  `fecha_venta` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_cat`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cli`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`id_compra`),
  ADD KEY `FK_ID_USER` (`id_user`),
  ADD KEY `FK_ID_PRO` (`id_pro`);

--
-- Indices de la tabla `detcompra`
--
ALTER TABLE `detcompra`
  ADD PRIMARY KEY (`id_detcompra`),
  ADD KEY `fk_id_pro` (`id_pro`),
  ADD KEY `fk_id_compra` (`id_compra`);

--
-- Indices de la tabla `detventa`
--
ALTER TABLE `detventa`
  ADD PRIMARY KEY (`id_detventa`),
  ADD KEY `fk_id_pro` (`id_pro`),
  ADD KEY `fk_id_venta` (`id_venta`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_pro`),
  ADD KEY `fk_id_cat` (`id_cat`) USING BTREE;

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`id_pro`);

--
-- Indices de la tabla `puesto`
--
ALTER TABLE `puesto`
  ADD PRIMARY KEY (`id_puesto`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_user`),
  ADD KEY `fk_id_puesto` (`id_puesto`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`id_venta`),
  ADD KEY `fk_id_user` (`id_user`),
  ADD KEY `fk_id_cli` (`id_cli`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_cat` int UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cli` int UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `id_compra` int UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detcompra`
--
ALTER TABLE `detcompra`
  MODIFY `id_detcompra` int UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detventa`
--
ALTER TABLE `detventa`
  MODIFY `id_detventa` int UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_pro` int UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `id_pro` int UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `puesto`
--
ALTER TABLE `puesto`
  MODIFY `id_puesto` int UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_user` int UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `id_venta` int UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `compra_ibfk_2` FOREIGN KEY (`id_pro`) REFERENCES `proveedor` (`id_pro`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `compra_ibfk_3` FOREIGN KEY (`id_user`) REFERENCES `usuario` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detcompra`
--
ALTER TABLE `detcompra`
  ADD CONSTRAINT `detcompra_ibfk_1` FOREIGN KEY (`id_pro`) REFERENCES `proveedor` (`id_pro`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detcompra_ibfk_2` FOREIGN KEY (`id_compra`) REFERENCES `compra` (`id_compra`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detventa`
--
ALTER TABLE `detventa`
  ADD CONSTRAINT `detventa_ibfk_1` FOREIGN KEY (`id_venta`) REFERENCES `venta` (`id_venta`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detventa_ibfk_2` FOREIGN KEY (`id_pro`) REFERENCES `producto` (`id_pro`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`id_cat`) REFERENCES `categoria` (`id_cat`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_puesto`) REFERENCES `puesto` (`id_puesto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `usuario` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `venta_ibfk_2` FOREIGN KEY (`id_cli`) REFERENCES `cliente` (`id_cli`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
