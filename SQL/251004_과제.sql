create table youtube (
id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
title varchar2(100) not null,
ch_name varchar2(100) not null,
upload DATE not null,
views number not null,
likes number not NULL
);

insert into youtube (title, ch_name, upload, views, likes) values ('스타벅스 퇴사자, 퇴사하고 브이로그를 올리다.', '찬미쨩', to_date('2023-03-01', 'yyyy-mm-dd'), 1274, 19);
insert into youtube (title, ch_name, upload, views, likes) values ('만23세, 일본 워홀을 떠나다.', '찬미쨩', to_date('2023-05-30', 'yyyy-mm-dd'), 17010, 207);
insert into youtube (title, ch_name, upload, views, likes) values ('하고는 있는데 잘.. 하고 있는 건가', '찬미쨩', to_date('2023-06-08', 'yyyy-mm-dd'), 2349, 36);

select * from youtube;

commit;

delete from youtube where id = 4;
delete from youtube where id = 5;
delete from youtube where id = 6;

select *FROM youtube;

commit;