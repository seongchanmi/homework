create table yum
id number GENERATED ALWAYS AS IDENTITY PRIMARY key,
name VARCHAR2(100) NOT NULL,
visitDate date not null,
menu varchar2(100) not null,
rating number (1) not null --check (rating >=1 and rating <=5),
  check(rating BETWEEN 1 and 5),
regDate date DEFAULT sysdate
);

select table_name from user_tables;
desc yum;

insert into yum (name, visitdate, menu, rating) 
values ('로텐토르테', to_date('2025-09-03', 'yyyy-mm-dd'), '진한 우유', 5);

SELECT * FROM yum;

insert into yum (name, visitdate, menu, rating) 
values ('모현각', date '2025-09-20', '해물짬뽕', 1);

SELECT * FROM table;
commit;