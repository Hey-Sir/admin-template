/*
 Navicat Premium Data Transfer

 Source Server         : admin
 Source Server Type    : MySQL
 Source Server Version : 50616
 Source Host           : localhost
 Source Schema         : admin

 Target Server Type    : MySQL
 Target Server Version : 50616
 File Encoding         : 65001

 Date: 30/11/2021 09:48:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sec_permission
-- ----------------------------
DROP TABLE IF EXISTS `sec_permission`;
CREATE TABLE `sec_permission`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限名',
  `url` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型为页面时，代表前端路由地址，类型为按钮时，代表后端接口地址',
  `type` int(2) NOT NULL COMMENT '权限类型，页面-1，按钮-2',
  `permission` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限表达式',
  `method` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '后端接口访问方式',
  `sort` int(11) NOT NULL COMMENT '排序',
  `parent_id` bigint(64) NOT NULL COMMENT '父级id',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `create_user` int(11) NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `update_user` int(11) NOT NULL COMMENT '更新人',
  `is_delete` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否删除.0否，1是',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '权限表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sec_permission
-- ----------------------------
INSERT INTO `sec_permission` VALUES (1, '测试页面', '/test', 1, 'page:test', NULL, 1, 0, NULL, '2021-11-30 08:47:30', 0, '2021-11-30 09:43:10', 0, 0);
INSERT INTO `sec_permission` VALUES (2, '测试页面-查询', '/**/test', 2, 'btn:test:query', 'GET', 1, 1072806379288399872, NULL, '2021-11-30 08:47:30', 0, '2021-11-30 09:43:37', 0, 0);
INSERT INTO `sec_permission` VALUES (3, '测试页面-添加', '/**/test', 2, 'btn:test:insert', 'POST', 2, 1072806379288399872, NULL, '2021-11-30 08:47:30', 0, '2021-11-30 09:43:48', 0, 0);
INSERT INTO `sec_permission` VALUES (4, '监控在线用户页面', '/monitor', 1, 'page:monitor:online', NULL, 2, 0, NULL, '2021-11-30 08:47:30', 0, '2021-11-30 09:44:00', 0, 0);
INSERT INTO `sec_permission` VALUES (5, '在线用户页面-查询', '/**/api/monitor/online/user', 2, 'btn:monitor:online:query', 'GET', 1, 1072806379342925824, NULL, '2021-11-30 08:47:30', 0, '2021-11-30 09:44:14', 0, 0);
INSERT INTO `sec_permission` VALUES (6, '在线用户页面-踢出', '/**/api/monitor/online/user/kickout', 2, 'btn:monitor:online:kickout', 'DELETE', 2, 1072806379342925824, NULL, '2021-11-30 08:47:30', 0, '2021-11-30 09:44:41', 0, 0);

-- ----------------------------
-- Table structure for sec_role
-- ----------------------------
DROP TABLE IF EXISTS `sec_role`;
CREATE TABLE `sec_role`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名',
  `description` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `create_user` int(11) NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `update_user` int(11) NOT NULL COMMENT '更新人',
  `is_delete` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否删除.0否，1是',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `name`(`name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sec_role
-- ----------------------------
INSERT INTO `sec_role` VALUES (1, '管理员', '超级管理员', NULL, '2021-11-30 08:47:15', 0, '2021-11-30 09:40:37', 0, 0);
INSERT INTO `sec_role` VALUES (2, '普通用户', '普通用户', NULL, '2021-11-30 08:47:15', 0, '2021-11-30 09:42:17', 0, 0);

-- ----------------------------
-- Table structure for sec_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sec_role_permission`;
CREATE TABLE `sec_role_permission`  (
  `role_id` bigint(20) NOT NULL COMMENT '角色主键',
  `permission_id` bigint(20) NOT NULL COMMENT '权限主键',
  PRIMARY KEY (`role_id`, `permission_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色权限关系表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sec_role_permission
-- ----------------------------
INSERT INTO `sec_role_permission` VALUES (1, 1);
INSERT INTO `sec_role_permission` VALUES (1, 2);
INSERT INTO `sec_role_permission` VALUES (1, 3);
INSERT INTO `sec_role_permission` VALUES (1, 4);
INSERT INTO `sec_role_permission` VALUES (1, 5);
INSERT INTO `sec_role_permission` VALUES (1, 6);
INSERT INTO `sec_role_permission` VALUES (2, 1);
INSERT INTO `sec_role_permission` VALUES (2, 2);

-- ----------------------------
-- Table structure for sec_user
-- ----------------------------
DROP TABLE IF EXISTS `sec_user`;
CREATE TABLE `sec_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `birthday` date NULL DEFAULT NULL COMMENT '生日',
  `sex` int(2) NULL DEFAULT NULL COMMENT '性别，男-1，女-2',
  `status` int(2) NOT NULL DEFAULT 1 COMMENT '状态，启用-1，禁用-0',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `create_user` int(11) NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `update_user` int(11) NOT NULL COMMENT '更新人',
  `is_delete` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否删除.0否，1是',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE,
  UNIQUE INDEX `phone`(`phone`) USING BTREE,
  UNIQUE INDEX `email`(`email`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sec_user
-- ----------------------------
INSERT INTO `sec_user` VALUES (1, 'admin', '$2a$10$64iuSLkKNhpTN19jGHs7xePvFsub7ZCcCmBqEYw8fbACGTE3XetYq', '管理员', '17300000000', 'admin@xkcoding.com', '2021-11-30', 1, 1, NULL, '2021-11-30 08:46:43', 0, '2021-11-30 09:39:24', 0, 0);
INSERT INTO `sec_user` VALUES (2, 'user', '$2a$10$OUDl4thpcHfs7WZ1kMUOb.ZO5eD4QANW5E.cexBLiKDIzDNt87QbO', '普通用户', '17300001111', 'user@xkcoding.com', '2021-11-30', 1, 1, NULL, '2021-11-30 08:46:43', 0, '2021-11-30 09:40:11', 0, 0);

-- ----------------------------
-- Table structure for sec_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sec_user_role`;
CREATE TABLE `sec_user_role`  (
  `user_id` bigint(20) NOT NULL COMMENT '用户主键',
  `role_id` bigint(20) NOT NULL COMMENT '角色主键',
  PRIMARY KEY (`user_id`, `role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户角色关系表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sec_user_role
-- ----------------------------
INSERT INTO `sec_user_role` VALUES (1, 1);
INSERT INTO `sec_user_role` VALUES (2, 2);

SET FOREIGN_KEY_CHECKS = 1;
