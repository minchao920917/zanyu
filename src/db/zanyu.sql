-- Database export via SQLPro (https://www.sqlprostudio.com/allapps.html)
-- Exported by minchao at 01-12-2022 19:25.
-- WARNING: This file may contain descructive statements such as DROPs.
-- Please ensure that you are running the script at the proper location.


-- BEGIN TABLE user_info
DROP TABLE IF EXISTS user_info;
CREATE TABLE `user_info` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '全局唯一标识符',
  `username` varchar(150) CHARACTER SET utf8mb3 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(2000) CHARACTER SET utf8mb3 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '逻辑删除标识。仅且仅有0和1两个值，1表示已经被逻辑删除，0表示正常可用。',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=COMPRESSED COMMENT='用户信息主体表';

-- Inserting 1 row into user_info
-- Insert batch #1
INSERT INTO user_info (id, username, password, create_time, update_time, is_deleted) VALUES
(1, 'minchao', '$2a$10$I2lsgkcrV0WNfkvxcVE4ae..9yNRjfels9ovx0L7GUh0uUivEeude', '2022-10-12 08:37:50', '2022-10-12 08:38:27', 0);

-- END TABLE user_info

