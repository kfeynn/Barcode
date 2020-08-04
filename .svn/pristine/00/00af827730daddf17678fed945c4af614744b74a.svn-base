/*
SQLyog 企业版 - MySQL GUI v7.14 
MySQL - 5.6.16-log : Database - i_wenyiba_com
*********************************************************************
*/

/*所有的表数据插入*/

/*Data for the table `permission` */

insert  into `permission`(`id`,`url`,`name`) values (4,'/permission/index.do','权限列表'),(6,'/permission/addPermission.do','权限添加'),(7,'/permission/deletePermissionById.do','权限删除'),(8,'/member/list.do','用户列表'),(9,'/member/online.do','在线用户'),(10,'/member/changeSessionStatus.do','用户Session踢出'),(11,'/member/forbidUserById.do','用户激活&禁止'),(12,'/member/deleteUserById.do','用户删除'),(13,'/permission/addPermission2Role.do','权限分配'),(14,'/role/clearRoleByUserIds.do','用户角色分配清空'),(15,'/role/addRole2User.do','角色分配保存'),(16,'/role/deleteRoleById.do','角色列表删除'),(17,'/role/addRole.do','角色列表添加'),(18,'/role/index.do','角色列表'),(19,'/permission/allocation.do','权限分配'),(20,'/role/allocation.do','角色分配');

/*Data for the table `role` */

insert  into `role`(`id`,`name`,`type`) values (1,'系统管理员','888888'),(3,'权限角色','100003'),(4,'用户中心','100002');

/*Data for the table `role_permission` */

insert  into `role_permission`(`rid`,`pid`) values (4,8),(4,9),(4,10),(4,11),(4,12),(3,4),(3,6),(3,7),(3,13),(3,14),(3,15),(3,16),(3,17),(3,18),(3,19),(3,20),(1,4),(1,6),(1,7),(1,8),(1,9),(1,10),(1,11),(1,12),(1,13),(1,14),(1,15),(1,16),(1,17),(1,18),(1,19),(1,20);

/*Data for the table `user` */

insert  into `user`(`id`,`nickname`,`username`,`password`,`create_time`,`last_login_time`,`status`) values (1,'管理员','admin','admin','2016-06-16 11:15:33','2016-06-16 11:24:10',1),(11,'普通用户','user','1234','2016-05-26 20:50:54','2016-06-16 11:24:35',1),(12,'用户管理员','laowang','1234','2016-05-27 22:34:19','2016-06-15 17:03:16',1);

/*Data for the table `user_role` */

insert  into `user_role`(`uid`,`rid`) values (12,4),(11,3),(11,4),(1,1);


