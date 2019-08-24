-- create database springbootfalsework DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
-- grant all privileges on `springbootfalsework`.* to `springbootfalsework`@`%` identified by 'qwe!@#123';
-- flush privileges;

-- 账户表
-- create table if not exists `account` (
create table `account` (
  `id`    bigint(20)   not null auto_increment,
  `name`  varchar(255) not null default '' comment '姓名',
  `email` varchar(30)  not null default '' comment '邮箱',
  `ctime` timestamp    not null default current_timestamp comment '创建时间',
  `mtime` timestamp    not null default current_timestamp comment '最后一次修改时间',
  primary key (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;