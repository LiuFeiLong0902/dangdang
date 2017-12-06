
DROP TABLE IF EXISTS d_product;
CREATE TABLE d_product (
  id int(12) NOT NULL auto_increment,
  product_name varchar(100) NOT NULL,
  description varchar(100) default NULL,
  add_time bigint(20) default NULL,
  fixed_price double NOT NULL,
  dang_price double NOT NULL,
  keywords varchar(200) default NULL,
  has_deleted int(1) NOT NULL default '0',
  product_pic varchar(200) default NULL,
  PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO d_product VALUES (1,'乔帮主的故事','乔帮主的故事',123787300021,200,120,'key',0,'16.jpg');
INSERT INTO d_product VALUES (2,'马云的故事','马云的故事',1237873004534,200,180,'key',0,'17.jpg');
INSERT INTO d_product VALUES (3,'李开复的故事','李开复的故事',1237836000234,200,145,'key',0,'18.jpg');
INSERT INTO d_product VALUES (4,'周鸿祎的故事','周鸿祎的故事',1237368000234,200,100,'key',0,'19.jpg');
INSERT INTO d_product VALUES (5,'雷军的故事','雷军的故事',1237873000298,200,180,'key',0,'20.jpg');
INSERT INTO d_product VALUES (6,'李彦宏的故事','李彦宏的故事',1237873034734,200,132,'key',0,'21.jpg');
INSERT INTO d_product VALUES (7,'柳传志的故事','柳传志的故事',1237873850234,200,140,'key',0,'22.jpg');
INSERT INTO d_product VALUES (8,'比尔盖茨的故事','比尔盖茨的故事',123782587234,200,180,'key',0,'23.jpg');
INSERT INTO d_product VALUES (9,'马化腾的故事','马化腾的故事',1237870120234,200,130,'key',0,'24.jpg');
INSERT INTO d_product VALUES (10,'沃兹的故事','沃兹的故事',123787507434,200,178,'key',0,'2.jpg');
INSERT INTO d_product VALUES (11,'高斯林的故事','高斯林的故事',1237743000234,200,179,'key',0,'3.jpg');
INSERT INTO d_product VALUES (12,'杨元庆的故事','杨元庆的故事',1237873012365,200,121,'key',0,'4.jpg');
INSERT INTO d_product VALUES (13,'曹国伟的故事','曹国伟的故事',1237885240234,200,122,'key',0,'5.jpg');
INSERT INTO d_product VALUES (14,'丁磊的故事','丁磊的故事',1237102000234,200,135,'key',0,'6.jpg');
INSERT INTO d_product VALUES (15,'陈天桥的故事','陈天桥的故事',123700000234,200,147,'key',0,'7.jpg');
INSERT INTO d_product VALUES (16,'拉里佩奇的故事','拉里佩奇的故事',123702580234,200,101,'key',0,'8.jpg');
INSERT INTO d_product VALUES (17,'崔志成的故事','崔志成的故事',1237873047234,200,103,'key',0,'9.jpg');
INSERT INTO d_product VALUES (18,'奥巴马的故事','奥巴马的故事',1237873000844,200,104,'key',0,'10.jpg');
INSERT INTO d_product VALUES (19,'普京的故事','普京的故事',1237873000254,200,107,'key',0,'11.jpg');
INSERT INTO d_product VALUES (20,'布朗的故事','布朗的故事',123787307834,200,108,'key',0,'12.jpg');
INSERT INTO d_product VALUES (21,'梅西的故事','梅西的故事',1237874568234,200,188,'key',0,'13.jpg');
INSERT INTO d_product VALUES (22,'詹姆斯的故事','詹姆斯的故事',1237836400234,200,189,'key',0,'14.jpg');
INSERT INTO d_product VALUES (23,'韦德的故事','韦德的故事',1237873001234,200,198,'key',0,'15.jpg');
INSERT INTO d_product VALUES (24,'巴蒂尔的故事','巴蒂尔的故事',1237878700234,200,171,'key',0,'1.jpg');



DROP TABLE IF EXISTS d_book;
CREATE TABLE d_book (
  id int(12) NOT NULL,
  author varchar(200) NOT NULL,
  publishing varchar(200) NOT NULL,
  publish_time bigint(20) NOT NULL,
  word_number varchar(15) default NULL,
  which_edtion varchar(15) default NULL,
  total_page varchar(15) default NULL,
  print_time int(20) default NULL,
  print_number varchar(15) default NULL,
  isbn varchar(25) default NULL,
  author_summary text NOT NULL,
  catalogue text NOT NULL,
  PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO d_book VALUES (1,'刘备','蜀国出版社',1999-03-02,'1万','1','100',1,NULL,'12345678','作者是英雄',
'好书，值得一看');
INSERT INTO d_book VALUES (2,'刘苍松','苍老师出版社',2002-02-03,'1万','1','100',1,NULL,'12345678','作者是好汉','这真是一本好书啊');
INSERT INTO d_book VALUES (3,'刘大哥','讲话理太偏出版社',2005-12-25,'1万','1','100',1,NULL,'12345678','作者很幽默','这真是一本好书啊');
INSERT INTO d_book VALUES (4,'武大郎','烧饼出版社',2005-03-13,'1万','1','100',1,NULL,'12345678','作者很悲剧','这真是一本好书啊');
INSERT INTO d_book VALUES (5,'张无忌','明教出版社',2013-03-13,'1万','1','100',1,NULL,'12345678','作者是教主','这真是一本好书啊');
INSERT INTO d_book VALUES (6,'孙悟空','花果山出版社',2004-06-13,'1万','1','100',1,NULL,'12345678','作者是齐天大圣','这真是一本好书啊');
INSERT INTO d_book VALUES (7,'孙权','东吴大学出版社',2004-08-13,'1万','1','100',1,NULL,'12345678','作者是霸主','这真是一本好书啊');
INSERT INTO d_book VALUES (8,'赵子龙','常山出版社',2004-09-13,'1万','1','100',1,NULL,'12345678','作者是蜀国虎将','这真是一本好书啊');
INSERT INTO d_book VALUES (9,'杨过','清华大学出版社',2004-04-13,'1万','1','100',1,NULL,'12345678','作者是好情郎','这真是一本好书啊');
INSERT INTO d_book VALUES (10,'郭靖','清华大学出版社',2004-03-17,'1万','1','100',1,NULL,'12345678','作者是好人','这真是一本好书啊');
INSERT INTO d_book VALUES (11,'刘备','清华大学出版社',2004-03-18,'1万','1','100',1,NULL,'12345678','作者是好人','这真是一本好书啊');
INSERT INTO d_book VALUES (12,'刘备','清华大学出版社',2004-03-19,'1万','1','100',1,NULL,'12345678','作者是好人','这真是一本好书啊');
INSERT INTO d_book VALUES (13,'刘备','清华大学出版社',2004-03-13,'1万','1','100',1,NULL,'12345678','作者是好人','这真是一本好书啊');
INSERT INTO d_book VALUES (14,'刘备','清华大学出版社',2005-03-13,'1万','1','100',1,NULL,'12345678','作者是好人','这真是一本好书啊');
INSERT INTO d_book VALUES (15,'刘备','清华大学出版社',2006-07-13,'1万','1','100',1,NULL,'12345678','作者是好人','这真是一本好书啊');
INSERT INTO d_book VALUES (16,'刘备','清华大学出版社',2004-07-17,'1万','1','100',1,NULL,'12345678','作者是好人','这真是一本好书啊');
INSERT INTO d_book VALUES (17,'刘备','清华大学出版社',2002-03-17,'1万','1','100',1,NULL,'12345678','作者是好人','这真是一本好书啊');
INSERT INTO d_book VALUES (18,'刘备','清华大学出版社',2004-03-13,'1万','1','100',1,NULL,'12345678','作者是好人','这真是一本好书啊');
INSERT INTO d_book VALUES (19,'刘备','清华大学出版社',2000-03-13,'1万','1','100',1,NULL,'12345678','作者是好人','这真是一本好书啊');
INSERT INTO d_book VALUES (20,'刘备','清华大学出版社',2001-03-13,'1万','1','100',1,NULL,'12345678','作者是好人','这真是一本好书啊');
INSERT INTO d_book VALUES (21,'刘备','清华大学出版社',2004-01-13,'1万','1','100',1,NULL,'12345678','作者是好人','这真是一本好书啊');
INSERT INTO d_book VALUES (22,'刘备','清华大学出版社',2007-12-13,'1万','1','100',1,NULL,'12345678','作者是好人','这真是一本好书啊');
INSERT INTO d_book VALUES (23,'刘备','清华大学出版社',2004-09-13,'1万','1','100',1,NULL,'12345678','作者是好人','这真是一本好书啊');
INSERT INTO d_book VALUES (24,'刘备','清华大学出版社',2007-08-13,'1万','1','100',1,NULL,'12345678','作者是好人','这真是一本好书啊');


DROP TABLE IF EXISTS d_category;
CREATE TABLE d_category (
  id int(12) NOT NULL auto_increment,
  turn int(10) NOT NULL,
  en_name varchar(200) NOT NULL,
  name varchar(200) NOT NULL,
  description varchar(200),
  parent_id int(10),
  PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO d_category VALUES (1,1,'Book','图书',NULL,0);
INSERT INTO d_category VALUES (2,1,'Novel','小说',NULL,1);
INSERT INTO d_category VALUES (3,2,'Youth','青春',NULL,1);
INSERT INTO d_category VALUES (4,3,'Humanity And Social Science','人文社科',NULL,1);
INSERT INTO d_category VALUES (5,4,'Management','管理',NULL,1);
INSERT INTO d_category VALUES (6,5,'Children','少儿',NULL,1);
INSERT INTO d_category VALUES (7,6,'Foreign Language','外语',NULL,1);
INSERT INTO d_category VALUES (8,7,'Computer','计算机',NULL,1);
INSERT INTO d_category VALUES (9,1,'Chinese Contemporary Novel','当代小说',NULL,2);
INSERT INTO d_category VALUES (10,2,'Chinese Modern Novel','近现代小说',NULL,2);
INSERT INTO d_category VALUES (11,3,'Chinese Classical  Novel','古典小说',NULL,2);
INSERT INTO d_category VALUES (12,4,'Four Classic Novels','四大名著',NULL,2);
INSERT INTO d_category VALUES (13,5,'Translated Works','世界名著',NULL,2);
INSERT INTO d_category VALUES (14,1,'School','校园',NULL,3);
INSERT INTO d_category VALUES (15,2,'Love','爱情/情感',NULL,3);
INSERT INTO d_category VALUES (16,3,'Grow Up','叛逆/成长',NULL,3);
INSERT INTO d_category VALUES (17,4,'Fantasy','玄幻',NULL,3);
INSERT INTO d_category VALUES (18,5,'Original','原创',NULL,3);
INSERT INTO d_category VALUES (19,1,'Political','政治',NULL,4);
INSERT INTO d_category VALUES (20,2,'Economic','经济',NULL,4);
INSERT INTO d_category VALUES (21,3,'Law','法律',NULL,4);
INSERT INTO d_category VALUES (22,4,'Philosophy','哲学',NULL,4);
INSERT INTO d_category VALUES (23,5,'History','历史',NULL,4);
INSERT INTO d_category VALUES (24,1,'Commen Management','管理学',NULL,5);
INSERT INTO d_category VALUES (25,2,'Strategic Management','战略管理',NULL,5);
INSERT INTO d_category VALUES (26,3,'Marketing','市场营销',NULL,5);
INSERT INTO d_category VALUES (27,4,'Business History','商业史传',NULL,5);
INSERT INTO d_category VALUES (28,5,'E-Business','电子商务',NULL,5);
INSERT INTO d_category VALUES (29,1,'0-2','0-2岁',NULL,6);
INSERT INTO d_category VALUES (30,2,'3-6','3-6岁',NULL,6);
INSERT INTO d_category VALUES (31,3,'7-10','7-10岁',NULL,6);
INSERT INTO d_category VALUES (32,4,'11-14','11-14岁',NULL,6);
INSERT INTO d_category VALUES (33,5,'Child Literature','儿童文学',NULL,6);
INSERT INTO d_category VALUES (34,1,'English','英语',NULL,7);
INSERT INTO d_category VALUES (35,2,'Japanese','日语',NULL,7);
INSERT INTO d_category VALUES (36,3,'Korean','韩语',NULL,7);
INSERT INTO d_category VALUES (37,4,'Russian','俄语',NULL,7);
INSERT INTO d_category VALUES (38,5,'German','德语',NULL,7);
INSERT INTO d_category VALUES (39,1,'Computer Theory','计算机理论',NULL,8);
INSERT INTO d_category VALUES (40,2,'Database','数据库',NULL,8);
INSERT INTO d_category VALUES (41,3,'Programming','程序设计',NULL,8);
INSERT INTO d_category VALUES (42,4,'Artificial Intelligence','人工智能',NULL,8);
INSERT INTO d_category VALUES (43,5,'Computer Examination','计算机考试',NULL,8);

DROP TABLE IF EXISTS d_category_product;
CREATE TABLE d_category_product (
  id int(12) NOT NULL auto_increment,
  product_id int(10) NOT NULL,
  cat_id int(10) NOT NULL,
  PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO d_category_product VALUES (1,1,9);
INSERT INTO d_category_product VALUES (2,2,9);
INSERT INTO d_category_product VALUES (3,3,9);
INSERT INTO d_category_product VALUES (4,4,9);
INSERT INTO d_category_product VALUES (5,5,9);
INSERT INTO d_category_product VALUES (6,6,9);
INSERT INTO d_category_product VALUES (7,7,9);
INSERT INTO d_category_product VALUES (8,8,9);
INSERT INTO d_category_product VALUES (9,9,9);
INSERT INTO d_category_product VALUES (10,10,9);
INSERT INTO d_category_product VALUES (11,11,10);
INSERT INTO d_category_product VALUES (12,12,10);
INSERT INTO d_category_product VALUES (13,13,10);
INSERT INTO d_category_product VALUES (14,14,10);
INSERT INTO d_category_product VALUES (15,15,10);
INSERT INTO d_category_product VALUES (16,16,10);
INSERT INTO d_category_product VALUES (17,17,10);
INSERT INTO d_category_product VALUES (18,18,10);
INSERT INTO d_category_product VALUES (19,19,6);
INSERT INTO d_category_product VALUES (20,20,6);
INSERT INTO d_category_product VALUES (21,21,6);
INSERT INTO d_category_product VALUES (22,22,6);
INSERT INTO d_category_product VALUES (23,23,6);
INSERT INTO d_category_product VALUES (24,24,6);

INSERT INTO d_category_product VALUES (25,1,2);
INSERT INTO d_category_product VALUES (26,2,2);
INSERT INTO d_category_product VALUES (27,3,2);
INSERT INTO d_category_product VALUES (28,4,2);
INSERT INTO d_category_product VALUES (29,5,2);
INSERT INTO d_category_product VALUES (30,6,2);
INSERT INTO d_category_product VALUES (31,7,2);
INSERT INTO d_category_product VALUES (32,8,2);
INSERT INTO d_category_product VALUES (33,9,2);
INSERT INTO d_category_product VALUES (34,10,3);
INSERT INTO d_category_product VALUES (35,11,3);
INSERT INTO d_category_product VALUES (36,12,3);
INSERT INTO d_category_product VALUES (37,13,3);
INSERT INTO d_category_product VALUES (38,14,3);
INSERT INTO d_category_product VALUES (39,15,3);
INSERT INTO d_category_product VALUES (40,16,3);
INSERT INTO d_category_product VALUES (41,17,3);
INSERT INTO d_category_product VALUES (42,18,3);
INSERT INTO d_category_product VALUES (43,19,3);
INSERT INTO d_category_product VALUES (44,20,3);
INSERT INTO d_category_product VALUES (45,21,3);
INSERT INTO d_category_product VALUES (46,22,3);
INSERT INTO d_category_product VALUES (47,23,3);
INSERT INTO d_category_product VALUES (48,24,3);

INSERT INTO d_category_product VALUES (49,1,1);
INSERT INTO d_category_product VALUES (50,2,1);
INSERT INTO d_category_product VALUES (51,3,1);
INSERT INTO d_category_product VALUES (52,4,1);
INSERT INTO d_category_product VALUES (53,5,1);
INSERT INTO d_category_product VALUES (54,6,1);
INSERT INTO d_category_product VALUES (55,7,1);
INSERT INTO d_category_product VALUES (56,8,1);
INSERT INTO d_category_product VALUES (57,9,1);
INSERT INTO d_category_product VALUES (58,10,1);
INSERT INTO d_category_product VALUES (59,11,1);
INSERT INTO d_category_product VALUES (60,12,4);
INSERT INTO d_category_product VALUES (61,13,4);
INSERT INTO d_category_product VALUES (62,14,4);
INSERT INTO d_category_product VALUES (63,15,4);
INSERT INTO d_category_product VALUES (64,16,4);
INSERT INTO d_category_product VALUES (65,17,4);
INSERT INTO d_category_product VALUES (66,18,4);
INSERT INTO d_category_product VALUES (67,19,4);
INSERT INTO d_category_product VALUES (68,20,4);
INSERT INTO d_category_product VALUES (69,21,4);
INSERT INTO d_category_product VALUES (70,22,4);
INSERT INTO d_category_product VALUES (71,23,4);
INSERT INTO d_category_product VALUES (72,24,4);

INSERT INTO d_category_product VALUES (73,5,5);
INSERT INTO d_category_product VALUES (74,6,5);
INSERT INTO d_category_product VALUES (75,7,5);
INSERT INTO d_category_product VALUES (76,8,5);
INSERT INTO d_category_product VALUES (77,9,5);
INSERT INTO d_category_product VALUES (78,10,5);
INSERT INTO d_category_product VALUES (79,11,5);
INSERT INTO d_category_product VALUES (80,12,5);
INSERT INTO d_category_product VALUES (81,13,5);
INSERT INTO d_category_product VALUES (82,14,8);
INSERT INTO d_category_product VALUES (83,15,8);
INSERT INTO d_category_product VALUES (84,16,8);
INSERT INTO d_category_product VALUES (85,17,8);
INSERT INTO d_category_product VALUES (86,18,8);
INSERT INTO d_category_product VALUES (87,19,8);
INSERT INTO d_category_product VALUES (88,20,8);
INSERT INTO d_category_product VALUES (89,21,8);
INSERT INTO d_category_product VALUES (90,22,8);

DROP TABLE IF EXISTS d_item;
CREATE TABLE d_item (
  id int(12) NOT NULL auto_increment,
  order_id int(10) NOT NULL,
  product_id int(10) NOT NULL,
  product_name varchar(100) NOT NULL,
  dang_price double NOT NULL,
  product_num int(10) NOT NULL,
  amount double NOT NULL,
  PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO d_item VALUES(1,1,3,'李开复的故事',145,2,290);
INSERT INTO d_item VALUES(2,2,4,'周鸿祎的故事',100,8,800);
INSERT INTO d_item VALUES(3,3,5,'雷军的故事',180,7,1260);
INSERT INTO d_item VALUES(4,4,6,'李彦宏的故事',132,6,792);
INSERT INTO d_item VALUES(5,5,7,'柳传志的故事',140,9,1260);
INSERT INTO d_item VALUES(6,6,8,'比尔盖茨的故事',180,3,540);
INSERT INTO d_item VALUES(7,7,9,'马化腾的故事',130,1,130);
INSERT INTO d_item VALUES(8,8,10,'沃兹的故事',178,10,1780);
INSERT INTO d_item VALUES(9,9,11,'高斯林的故事',179,14,1790);
INSERT INTO d_item VALUES(10,2,4,'周鸿祎的故事',100,6,600);
INSERT INTO d_item VALUES(11,4,6,'李彦宏的故事',132,2,264);
INSERT INTO d_item VALUES(12,8,10,'沃兹的故事',178,5,890);

	  
	  
DROP TABLE IF EXISTS d_order;
CREATE TABLE d_order (
  id int(10) NOT NULL auto_increment,
  user_id int(10) NOT NULL,
  status int(10) NOT NULL,
  order_time bigint(20) NOT NULL,
  order_desc varchar(100) default NULL,
  total_price double NOT NULL,
 
  receive_name varchar(100) default NULL,
  full_address varchar(200) default NULL,
  postal_code varchar(8) default NULL,
  mobile varchar(20) default NULL,
  phone varchar(20) default NULL,
  
  PRIMARY KEY  (id)
) ENGINE=InnoDB;


DROP TABLE IF EXISTS d_receive_address;
CREATE TABLE d_receive_address (
  id int(12) NOT NULL auto_increment,
  user_id int(11) NOT NULL,
  receive_name varchar(20) NOT NULL,
  full_address varchar(200) NOT NULL,
  postal_code varchar(8) NOT NULL,
  mobile varchar(15) default NULL,
  phone varchar(20) default NULL,
  PRIMARY KEY  (id)
) ENGINE=InnoDB;

insert into d_receive_address values(1, 6,'Java','sun.cn','10000800','12345','67890');
insert into d_receive_address values(2, 6,'JavaJava','ibm.cn','10000600','12345','67890');



DROP TABLE IF EXISTS d_user;
CREATE TABLE d_user (
  id int(12) NOT NULL auto_increment,
  email varchar(50) NOT NULL,
  nickname varchar(50) default NULL,
  password varchar(50) NOT NULL,
  user_integral int(12) NOT NULL default '0',
  is_email_verify char(3),
  email_verify_code varchar(50) default NULL,
  last_login_time bigint default NULL,
  last_login_ip varchar(15) default NULL,
  PRIMARY KEY  (id),
  UNIQUE KEY email (email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

