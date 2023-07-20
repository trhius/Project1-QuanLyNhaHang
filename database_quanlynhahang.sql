-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 20, 2023 at 03:42 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `database_quanlynhahang`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart_items`
--

CREATE TABLE `cart_items` (
  `id` bigint(20) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  `monan_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `cart_items`
--

INSERT INTO `cart_items` (`id`, `quantity`, `monan_id`, `user_id`) VALUES
(3, 5, 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `monans`
--

CREATE TABLE `monans` (
  `id` bigint(20) NOT NULL,
  `danh_muc` varchar(255) DEFAULT NULL,
  `diem_danh_gia` double DEFAULT NULL,
  `don_gia` double DEFAULT NULL,
  `mo_ta` varchar(255) DEFAULT NULL,
  `nguyen_lieu` varchar(255) DEFAULT NULL,
  `ten_mon_an` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `monans`
--

INSERT INTO `monans` (`id`, `danh_muc`, `diem_danh_gia`, `don_gia`, `mo_ta`, `nguyen_lieu`, `ten_mon_an`, `note`) VALUES
(1, 'Starter&Snacks', 0, 130000, 'Corn chips with queso, black bean, pico de galo, pickled chillies, sour cream, pickled onions, and green onion', '', 'Nachos Large', 'Popular'),
(2, 'Starter&Snacks', 0, 150000, 'Large flour tortilla, filled with melted cheese, pico de gallo, and green onion', '', 'Quesadilla', NULL),
(3, 'Starter&Snacks', 0, 110000, '5 crispy cream cheese and chilli fritters. Served with a cream dill sauce', '', 'Chilli Poppers', NULL),
(4, 'Starter&Snacks', 0, 125000, 'Melted cheese dip with stewed tomato and green chilli, served with a side of corn chips for dipping', '', 'Chips And Queso', NULL),
(5, 'Starter&Snacks', 0, 110000, 'Grilled sweetcorn salad with chipotle, aioli, parmesan cheese, and lime. Served with handmade corn chips for dipping', '', 'Esquites', 'Hot!\r\n'),
(6, 'Starter&Snacks', 0, 110000, 'Dip made from avocado, tomato, onion, and cilantro. Served with a side of corn chips for dipping', '', 'Chips And Guacamole', 'New'),
(8, 'Tacos', 0, 60000, 'Chicken cooked in a smoky chipotle and garlic sauce', '', 'Chipotle Chicken', NULL),
(9, 'Tacos', 0, 60000, 'Pork slow cooked with cumin, oregano, and citrus. Served with cilantro and onions', '', 'Carnitas', NULL),
(10, 'Tacos', 0, 50000, 'Refried beans, cheese, and crispy onions', '', 'Bean And Cheese', 'Vegan'),
(11, 'Tacos', 0, 50000, 'Garlicky caramelized pumpkin, refried beans, crispy onions, pickled red onion, and cilantro', '', 'Pumpkin And Black Bean', 'Vegan\r\n'),
(12, 'Burritos&Bowl', 0, 90000, 'Ask the waiter', '', 'Today\'s Soup', 'Seasonal'),
(13, 'Burritos&Bowl', 0, 200000, 'Your choice of filling wrapped in a large handmae flour tortilla with rice, pico de gallo, lettuce, sour cream, crispy onions, and cilantro', '', 'Burrito', 'Popular'),
(14, 'Burritos&Bowl', 0, 170000, 'Mexican rice bowl topped with your choice of filling, pico de gallo, lettuce, sour cream, crispy onions, and cilantro', '', 'Naked Burrito Bowl', NULL),
(15, 'Burritos&Bowl', 0, 180000, 'Deep fried burrito stuffed with your choice of filling, refried beans, cheese, and rice. Served with tomato salsa and sour cream', '', 'Chimichanga', NULL),
(16, 'Burritos&Bowl', 0, 130000, 'Mixed salad green topped with your choice of filling, pico de gallo, sour cream, crispy onions, and cilantro', '', 'Salad Bowl', NULL),
(17, 'Burritos&Bowl', 0, 210000, '3 stuffed corn tortillas smothered in red South Texas style enchilada sauce. Served with rice, refried black beans, and salad', '', 'Enchiladas', 'Family Size'),
(21, 'Tacos', 0, 60000, 'Braised beef served with cilantro and onions', '', 'Beef', 'Popular');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `ho_ten` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `sdt` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `email`, `ho_ten`, `password`, `sdt`, `user_name`, `role`) VALUES
(1, 'hieu21801@gmail.com', 'Đỗ Trung Hiếu', '$2a$10$mj9vXkrkmHgGivzhUC4gq.hn6k31U/waeMMoZGE/0Ij726/NKX5YO', '0988436048', 'trhieu', NULL),
(2, 'phong.nh@gmail.com', 'Nguyễn Hải Phong', '$2a$10$fFsRpy8oNhrGaq.7O8q9Iu5b45gaOW6Okq0j1aKcF679gevxxZAYS', '0983622802', 'phongnh', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cart_items`
--
ALTER TABLE `cart_items`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKkgpw1wvxk4ddmdcmgt6ucnvto` (`monan_id`),
  ADD KEY `FK709eickf3kc0dujx3ub9i7btf` (`user_id`);

--
-- Indexes for table `monans`
--
ALTER TABLE `monans`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cart_items`
--
ALTER TABLE `cart_items`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `monans`
--
ALTER TABLE `monans`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cart_items`
--
ALTER TABLE `cart_items`
  ADD CONSTRAINT `FK709eickf3kc0dujx3ub9i7btf` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `FKkgpw1wvxk4ddmdcmgt6ucnvto` FOREIGN KEY (`monan_id`) REFERENCES `monans` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
