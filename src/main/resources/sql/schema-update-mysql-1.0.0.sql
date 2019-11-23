# alter table account add column `phone` varchar(13) not null default '' comment '电话' after email;
select count(1) from `account`;