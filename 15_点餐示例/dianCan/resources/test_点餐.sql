/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2016-08-18 18:56:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `price` double(10,0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_menu
-- ----------------------------
INSERT INTO `t_menu` VALUES ('1', '盖饭', '10');
INSERT INTO `t_menu` VALUES ('2', '盖面', '12');
INSERT INTO `t_menu` VALUES ('3', '炒菜', '20');
INSERT INTO `t_menu` VALUES ('4', '拼盘', '15');
INSERT INTO `t_menu` VALUES ('5', '可乐', '3');
INSERT INTO `t_menu` VALUES ('6', '馒头', '1');

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `deskId` int(11) DEFAULT NULL,
  `totalPrice` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES ('1', '1', '13');
INSERT INTO `t_order` VALUES ('2', '2', '33');

-- ----------------------------
-- Table structure for t_orderdetail
-- ----------------------------
DROP TABLE IF EXISTS `t_orderdetail`;
CREATE TABLE `t_orderdetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orderId` int(11) DEFAULT NULL,
  `menuId` int(11) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_orderdetail
-- ----------------------------
INSERT INTO `t_orderdetail` VALUES ('1', '1', '1', '1');
INSERT INTO `t_orderdetail` VALUES ('2', '1', '5', '1');
INSERT INTO `t_orderdetail` VALUES ('3', '2', '2', '1');
INSERT INTO `t_orderdetail` VALUES ('4', '2', '4', '1');
INSERT INTO `t_orderdetail` VALUES ('5', '2', '5', '2');
