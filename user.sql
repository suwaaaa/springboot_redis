/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80022
Source Host           : localhost:3306
Source Database       : springboot_redis

Target Server Type    : MYSQL
Target Server Version : 80022
File Encoding         : 65001

Date: 2021-01-15 21:44:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `age` int DEFAULT NULL COMMENT '用户年龄',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户名称',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '' COMMENT '用户地址',
  `passcode` varchar(255) NOT NULL DEFAULT '' COMMENT '用户密码',
  `phone` int NOT NULL COMMENT '用户手机号',
  `mail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '' COMMENT '用户邮箱',
  `vip` tinyint(1) DEFAULT NULL COMMENT '用户vip',
  `creat_time` date DEFAULT NULL COMMENT '用户创建时间',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('11', '20', '康师傅', '北京市', '123456', '400823823', '1@qq.cpm', '1', '2021-01-15');
INSERT INTO `user` VALUES ('12', '21', '福嫂', '广东省', '123456', '400823823', '2@qq.cpm', '0', '2021-01-15');
