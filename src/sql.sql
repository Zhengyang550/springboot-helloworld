show variables like 'char%';
#MySQL客户端输出窗口显示中文乱码问题解决办法             https://www.cnblogs.com/xdp-gacl/p/4008095.html
set character_set_client = 'utf8';
set character_set_connection = 'utf8';

--为了在命令行下正确查看、删除，插入中文
set character_set_results='gb2312';

mysql -h localhost -u root -p
123456aa

--创建数据库
DROP DATABASE IF EXISTS  GLODWIND;

CREATE DATABASE IF NOT EXISTS  GOLDWIND;

--选择数据库
USE  GOLDWIND;

--创建表
CREATE TABLE student(
             ID INT PRIMARY KEY AUTO_INCREMENT ,
             NAME VARCHAR(20),
             AGE SMALLINT,
             SEX BIT,
             CLASS  VARCHAR(50),
             ADDRESS  VARCHAR(100)) default charset=utf8;


--删除表
DROP TABLE IF EXISTS  student;

--查询
select * from student;
select id,name,age,sex,class,address from student where id=50937;

--插入
insert into student(name,age,sex,class,address) values('郑洋','24',1,'计算机(1)班','江苏省无锡市滨湖区');

--删除
delete  from student  where id=1;

--更新
update student set address='安徽省' where id=1;

--事务
begin
insert into student(name,age,sex,class,address) values('郑洋','24',1,'计算机(1)班','江苏省无锡市滨湖区');
update student set age=25 where name = '郑洋';
commit

--查看数据库引擎
show engines;

