drop table account;
create table account( no number(20)  primary key,
					  owner varchar2(20),
				      balance number(10),
				      iyul number(6,2));
				      
insert into account values(10000,'������',350000,3.4);
insert into account values(20000,'����ȣ',670000,2.1);
insert into account values(30000,'�����',235000,0.5);
insert into account values(40000,'�ϸ���',110000,1.3);
insert into account values(50000,'���ȣ',900000,1.5);
insert into account values(60000,'��浿',23600,0.8);