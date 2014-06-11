CREATE TABLE `mf_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` varchar(30) CHARACTER SET utf8 NOT NULL COMMENT '用户英文id',
  `nickname` varchar(20) CHARACTER SET utf8 NOT NULL COMMENT '用户姓名',
  `password` char(32) NOT NULL COMMENT '密码hash值',
  `intro` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '用户简介',
  `sex` tinyint(1) DEFAULT '0' COMMENT '性别(0-男，1-女)',
  `adress` varchar(30) CHARACTER SET utf8 DEFAULT NULL COMMENT '地址',
  `phone` bigint(20) NOT NULL COMMENT '手机号码',
  `email` varchar(150) NOT NULL COMMENT '电子邮箱',
  `forbidden` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否禁止登录',
  `opus_count` smallint(6) NOT NULL DEFAULT '0' COMMENT '上传作品数',
  `msg_unread` mediumint(9) NOT NULL DEFAULT '0' COMMENT '未读消息数',
  `avatar` int(11) NOT NULL COMMENT '头像对应的附件表ID',
  `avatar_large` int(11) NOT NULL COMMENT '大头像所属的附件ID',
  `popularity` int(11) NOT NULL DEFAULT '0' COMMENT '选手热度',
  PRIMARY KEY (`id`),
  UNIQUE KEY `userid` (`uid`),
  KEY `forbidden` (`forbidden`),
  KEY `popularity` (`popularity`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

CREATE TABLE `mf_opus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` varchar(30) CHARACTER SET utf8 NOT NULL COMMENT '作者英文id',
  `subject` varchar(30) NOT NULL COMMENT '所属科目,如html5',
  `module` varchar(30) NOT NULL COMMENT '所属模块,如前端',
  `theme` varchar(30) NOT NULL COMMENT '所属主题,如学习',
  `title` varchar(30) NOT NULL COMMENT '题目',
  `content` varchar(1000) NOT NULL COMMENT '内容',
  `time` int(11) NOT NULL COMMENT '发布时间',
  `last_time` int(11) NOT NULL COMMENT '最新修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

CREATE TABLE `mf_theme` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `belong` varchar(30) CHARACTER SET utf8 NOT NULL COMMENT '所属主题,如study',
  `title` varchar(30) CHARACTER SET utf8 NOT NULL COMMENT '主题名,如WebIndex',
  `link` varchar(20) CHARACTER SET utf8 NOT NULL COMMENT '链接名,如Web前端',
  `intro` varchar(60) CHARACTER SET utf8 DEFAULT NULL COMMENT '简介',
  PRIMARY KEY (`id`),
  UNIQUE KEY `title` (`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='主题表';

