-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-05-2022 a las 19:47:22
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Base de datos: `walkmypet`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuidadores`
--

CREATE TABLE `cuidadores` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(120) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cuidadores`
--

INSERT INTO `cuidadores` (`id`, `Nombre`, `password`) VALUES
(1, 'Hector', ''),
(2, 'Arianna', ''),
(4, 'Andrés', ''),
(5, 'Mistify', ''),
(6, 'dfsr', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascotas`
--

CREATE TABLE `mascotas` (
  `id` int(11) NOT NULL,
  `propietario` int(11) NOT NULL,
  `Nombre` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mascotas`
--

INSERT INTO `mascotas` (`id`, `propietario`, `Nombre`) VALUES
(2, 1, 'Lana'),
(3, 3, 'Mimi'),
(4, 2, 'Kira'),
(5, 2, 'Ted');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `migration`
--

CREATE TABLE `migration` (
  `version` varchar(180) NOT NULL,
  `apply_time` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `migration`
--

INSERT INTO `migration` (`version`, `apply_time`) VALUES
('m000000_000000_base', 1645121498),
('m130524_201442_init', 1645121500),
('m190124_110200_add_verification_token_column_to_user_table', 1645121500);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paises`
--

CREATE TABLE `paises` (
  `id` int(11) NOT NULL,
  `Codigo` varchar(2) NOT NULL,
  `Nombre` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `paises`
--

INSERT INTO `paises` (`id`, `Codigo`, `Nombre`) VALUES
(1, 'AD', 'Andorra'),
(2, 'AE', 'Emiratos Árabes Unidos'),
(3, 'AF', 'Afganistán'),
(4, 'AG', 'Antigua y Barbuda'),
(5, 'AI', 'Anguila	660	AIA'),
(6, 'AL', 'Albania'),
(7, 'AM', 'Armenia'),
(8, 'AN', 'Antillas Neerlandesas'),
(9, 'AO', 'Angola'),
(10, 'AQ', 'Antártida'),
(11, 'AR', 'Argentina'),
(12, 'AS', 'Samoa Americana'),
(13, 'AT', 'Austria'),
(14, 'AU', 'Australia'),
(15, 'AW', 'Aruba'),
(16, 'AX', 'Islas Áland'),
(17, 'AZ', 'Azerbaiyán'),
(18, 'BA', 'Bosnia y Herzegovina'),
(19, 'BB', 'Barbados'),
(20, 'BD', 'Bangladesh'),
(21, 'BE', 'Bélgica'),
(22, 'BF', 'Burkina Faso'),
(23, 'BG', 'Bulgaria'),
(24, 'BH', 'Bahréin'),
(25, 'BI', 'Burundi'),
(26, 'BJ', 'Benin'),
(27, 'BL', 'San Bartolomé'),
(28, 'BM', 'Bermudas'),
(29, 'BN', 'Brunéi'),
(30, 'BO', 'Bolivia'),
(31, 'BR', 'Brasil'),
(32, 'BS', 'Bahamas'),
(33, 'BT', 'Bhután'),
(34, 'BV', 'Isla Bouvet'),
(35, 'BW', 'Botsuana'),
(36, 'BY', 'Belarús'),
(37, 'BZ', 'Belice'),
(38, 'CA', 'Canadá'),
(39, 'CC', 'Islas Cocos'),
(40, 'CF', 'República Centro-Africana'),
(41, 'CG', 'Congo'),
(42, 'CH', 'Suiza'),
(43, 'CI', 'Costa de Marfil'),
(44, 'CK', 'Islas Cook'),
(45, 'CL', 'Chile'),
(46, 'CM', 'Camerún'),
(47, 'CN', 'China'),
(48, 'CO', 'Colombia'),
(49, 'CR', 'Costa Rica'),
(50, 'CU', 'Cuba'),
(51, 'CV', 'Cabo Verde'),
(52, 'CX', 'Islas Christmas'),
(53, 'CY', 'Chipre'),
(54, 'CZ', 'República Checa'),
(55, 'DE', 'Alemania'),
(56, 'DJ', 'Yibuti'),
(57, 'DK', 'Dinamarca'),
(58, 'DM', 'Domínica'),
(59, 'DO', 'República Dominicana'),
(60, 'DZ', 'Argel'),
(61, 'EC', 'Ecuador'),
(62, 'EE', 'Estonia'),
(63, 'EG', 'Egipto'),
(64, 'EH', 'Sahara Occidental'),
(65, 'ER', 'Eritrea'),
(66, 'ES', 'España'),
(67, 'ET', 'Etiopía'),
(68, 'FI', 'Finlandia'),
(69, 'FJ', 'Fiji'),
(70, 'FK', 'Islas Malvinas'),
(71, 'FM', 'Micronesia'),
(72, 'FO', 'Islas Faroe'),
(73, 'FR', 'Francia'),
(74, 'GA', 'Gabón'),
(75, 'GB', 'Reino Unido'),
(76, 'GD', 'Granada'),
(77, 'GE', 'Georgia'),
(78, 'GF', 'Guayana Francesa'),
(79, 'GG', 'Guernsey'),
(80, 'GH', 'Ghana'),
(81, 'GI', 'Gibraltar'),
(82, 'GL', 'Groenlandia'),
(83, 'GM', 'Gambia'),
(84, 'GN', 'Guinea'),
(85, 'GP', 'Guadalupe'),
(86, 'GQ', 'Guinea Ecuatorial'),
(87, 'GR', 'Grecia'),
(88, 'GS', 'Georgia del Sur e Islas Sandwich del Sur'),
(89, 'GT', 'Guatemala'),
(90, 'GU', 'Guam'),
(91, 'GW', 'Guinea-Bissau'),
(92, 'GY', 'Guayana'),
(93, 'HK', 'Hong Kong'),
(94, 'HM', 'Islas Heard y McDonald'),
(95, 'HN', 'Honduras'),
(96, 'HR', 'Croacia'),
(97, 'HT', 'Haití'),
(98, 'HU', 'Hungría'),
(99, 'ID', 'Indonesia'),
(100, 'IE', 'Irlanda'),
(101, 'IL', 'Israel'),
(102, 'IM', 'Isla de Man'),
(103, 'IN', 'India'),
(104, 'IO', 'Territorio Británico del Océano Índico'),
(105, 'IQ', 'Irak'),
(106, 'IR', 'Irán'),
(107, 'IS', 'Islandia'),
(108, 'IT', 'Italia'),
(109, 'JE', 'Jersey'),
(110, 'JM', 'Jamaica'),
(111, 'JO', 'Jordania'),
(112, 'JP', 'Japón'),
(113, 'KE', 'Kenia'),
(114, 'KG', 'Kirguistán'),
(115, 'KH', 'Camboya'),
(116, 'KI', 'Kiribati'),
(117, 'KM', 'Comoros'),
(118, 'KN', 'San Cristóbal y Nieves'),
(119, 'KP', 'Corea del Norte'),
(120, 'KR', 'Corea del Sur'),
(121, 'KW', 'Kuwait'),
(122, 'KY', 'Islas Caimán'),
(123, 'KZ', 'Kazajstán'),
(124, 'LA', 'Laos'),
(125, 'LB', 'Líbano'),
(126, 'LC', 'Santa Lucía'),
(127, 'LI', 'Liechtenstein'),
(128, 'LK', 'Sri Lanka'),
(129, 'LR', 'Liberia'),
(130, 'LS', 'Lesotho'),
(131, 'LT', 'Lituania'),
(132, 'LU', 'Luxemburgo'),
(133, 'LV', 'Letonia'),
(134, 'LY', 'Libia'),
(135, 'MA', 'Marruecos'),
(136, 'MC', 'Mónaco'),
(137, 'MD', 'Moldova'),
(138, 'ME', 'Montenegro'),
(139, 'MG', 'Madagascar'),
(140, 'MH', 'Islas Marshall'),
(141, 'MK', 'Macedonia'),
(142, 'ML', 'Mali'),
(143, 'MM', 'Myanmar'),
(144, 'MN', 'Mongolia'),
(145, 'MO', 'Macao'),
(146, 'MQ', 'Martinica'),
(147, 'MR', 'Mauritania'),
(148, 'MS', 'Montserrat'),
(149, 'MT', 'Malta'),
(150, 'MU', 'Mauricio'),
(151, 'MV', 'Maldivas'),
(152, 'MW', 'Malawi'),
(153, 'MX', 'México'),
(154, 'MY', 'Malasia'),
(155, 'MZ', 'Mozambique'),
(156, 'NA', 'Namibia'),
(157, 'NC', 'Nueva Caledonia'),
(158, 'NE', 'Níger'),
(159, 'NF', 'Islas Norkfolk'),
(160, 'NG', 'Nigeria'),
(161, 'NI', 'Nicaragua'),
(162, 'NL', 'Países Bajos'),
(163, 'NO', 'Noruega'),
(164, 'NP', 'Nepal'),
(165, 'NR', 'Nauru'),
(166, 'NU', 'Niue'),
(167, 'NZ', 'Nueva Zelanda'),
(168, 'OM', 'Omán'),
(169, 'PA', 'Panamá'),
(170, 'PE', 'Perú'),
(171, 'PF', 'Polinesia Francesa'),
(172, 'PG', 'Papúa Nueva Guinea'),
(173, 'PH', 'Filipinas'),
(174, 'PK', 'Pakistán'),
(175, 'PL', 'Polonia'),
(176, 'PM', 'San Pedro y Miquelón'),
(177, 'PN', 'Islas Pitcairn'),
(178, 'PR', 'Puerto Rico'),
(179, 'PS', 'Palestina'),
(180, 'PT', 'Portugal'),
(181, 'PW', 'Islas Palaos'),
(182, 'PY', 'Paraguay'),
(183, 'QA', 'Qatar'),
(184, 'RE', 'Reunión'),
(185, 'RO', 'Rumanía'),
(186, 'RS', 'Serbia y Montenegro'),
(187, 'RU', 'Rusia'),
(188, 'RW', 'Ruanda'),
(189, 'SA', 'Arabia Saudita'),
(190, 'SB', 'Islas Solomón'),
(191, 'SC', 'Seychelles'),
(192, 'SD', 'Sudán'),
(193, 'SE', 'Suecia'),
(194, 'SG', 'Singapur'),
(195, 'SH', 'Santa Elena'),
(196, 'SI', 'Eslovenia'),
(197, 'SJ', 'Islas Svalbard y Jan Mayen'),
(198, 'SK', 'Eslovaquia'),
(199, 'SL', 'Sierra Leona'),
(200, 'SM', 'San Marino'),
(201, 'SN', 'Senegal'),
(202, 'SO', 'Somalia'),
(203, 'SR', 'Surinam'),
(204, 'ST', 'Santo Tomé y Príncipe'),
(205, 'SV', 'El Salvador'),
(206, 'SY', 'Siria'),
(207, 'SZ', 'Suazilandia'),
(208, 'TC', 'Islas Turcas y Caicos'),
(209, 'TD', 'Chad'),
(210, 'TF', 'Territorios Australes Franceses'),
(211, 'TG', 'Togo'),
(212, 'TH', 'Tailandia'),
(213, 'TH', 'Tanzania'),
(214, 'TJ', 'Tayikistán'),
(215, 'TK', 'Tokelau'),
(216, 'TL', 'Timor-Leste'),
(217, 'TM', 'Turkmenistán'),
(218, 'TN', 'Túnez'),
(219, 'TO', 'Tonga'),
(220, 'TR', 'Turquía'),
(221, 'TT', 'Trinidad y Tobago'),
(222, 'TV', 'Tuvalu'),
(223, 'TW', 'Taiwán'),
(224, 'UA', 'Ucrania'),
(225, 'UG', 'Uganda'),
(226, 'US', 'Estados Unidos de América'),
(227, 'UY', 'Uruguay'),
(228, 'UZ', 'Uzbekistán'),
(229, 'VA', 'Ciudad del Vaticano'),
(230, 'VC', 'San Vicente y las Granadinas'),
(231, 'VE', 'Venezuela'),
(232, 'VG', 'Islas Vírgenes Británicas'),
(233, 'VI', 'Islas Vírgenes de los Estados Unidos de América'),
(234, 'VN', 'Vietnam'),
(235, 'VU', 'Vanuatu'),
(236, 'WF', 'Wallis y Futuna'),
(237, 'WS', 'Samoa'),
(238, 'YE', 'Yemen'),
(239, 'YT', 'Mayotte'),
(240, 'ZA', 'Sudáfrica');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propietarios`
--

CREATE TABLE `propietarios` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(120) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `propietarios`
--

INSERT INTO `propietarios` (`id`, `Nombre`, `password`) VALUES
(1, 'Saul', '123abc'),
(2, 'Anais', '123456'),
(3, 'Pere', 'abc123'),
(7, 'Nata', 'nata123'),
(71, 'saul', 'barcelona');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

CREATE TABLE `servicios` (
  `id` int(11) NOT NULL,
  `cuidador` int(11) NOT NULL,
  `mascota` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `duracion` decimal(2,0) NOT NULL,
  `nombre` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `servicios`
--

INSERT INTO `servicios` (`id`, `cuidador`, `mascota`, `fecha`, `duracion`, `nombre`) VALUES
(1, 1, 2, '2022-02-19', '1', ''),
(2, 2, 3, '2022-01-22', '3', ''),
(3, 2, 3, '2022-01-28', '3', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarifas`
--

CREATE TABLE `tarifas` (
  `id` int(11) NOT NULL,
  `duracion` decimal(2,0) NOT NULL,
  `precio` decimal(2,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `auth_key` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `password_hash` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `password_reset_token` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `status` smallint(6) NOT NULL DEFAULT 10,
  `created_at` int(11) NOT NULL,
  `updated_at` int(11) NOT NULL,
  `verification_token` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`id`, `username`, `auth_key`, `password_hash`, `password_reset_token`, `email`, `status`, `created_at`, `updated_at`, `verification_token`) VALUES
(1, 'admin', 'UYG5WQvhO9lswOke5PPFdf560NQrCWvy', '$2y$13$7AOlSEqKJr/HgMB8kVlG1.7k/aKyWdYIQER.5Wi7JEcNEAm8glgMO', NULL, 'saul_gonzalo_tenesaca_tsapp1oa2021@cev.com', 10, 1645126181, 1645126363, 'KZhbWq8hEEbQw7WRqxvY5lMhTA26Pxup_1645126181');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cuidadores`
--
ALTER TABLE `cuidadores`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `mascotas`
--
ALTER TABLE `mascotas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_propietario_mascotas` (`propietario`);

--
-- Indices de la tabla `migration`
--
ALTER TABLE `migration`
  ADD PRIMARY KEY (`version`);

--
-- Indices de la tabla `paises`
--
ALTER TABLE `paises`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `propietarios`
--
ALTER TABLE `propietarios`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_servicios_cuidador` (`cuidador`),
  ADD KEY `fk_servicios_mascota` (`mascota`);

--
-- Indices de la tabla `tarifas`
--
ALTER TABLE `tarifas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `password_reset_token` (`password_reset_token`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cuidadores`
--
ALTER TABLE `cuidadores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `mascotas`
--
ALTER TABLE `mascotas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `paises`
--
ALTER TABLE `paises`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=241;

--
-- AUTO_INCREMENT de la tabla `propietarios`
--
ALTER TABLE `propietarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=72;

--
-- AUTO_INCREMENT de la tabla `servicios`
--
ALTER TABLE `servicios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `tarifas`
--
ALTER TABLE `tarifas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `mascotas`
--
ALTER TABLE `mascotas`
  ADD CONSTRAINT `fk_propietario_mascotas` FOREIGN KEY (`propietario`) REFERENCES `propietarios` (`id`);

--
-- Filtros para la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD CONSTRAINT `fk_servicios_cuidador` FOREIGN KEY (`cuidador`) REFERENCES `cuidadores` (`id`),
  ADD CONSTRAINT `fk_servicios_mascota` FOREIGN KEY (`mascota`) REFERENCES `mascotas` (`id`);
COMMIT;
