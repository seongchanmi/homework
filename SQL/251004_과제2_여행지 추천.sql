create table trip (
name varchar2(100) not null,
location varchar2(100) not null,
season varchar2(100) not null,
rating number (2,1) CHECK (rating >0.0 and rating <=5.0) not null
);

insert into trip (name, location, season, rating) values ('경주 보문단지', '경상북도 경주', '봄', 4.7);
insert into trip (name, location, season, rating) values ('진해 군항제', '경상남도 창원', '봄', 4.8);
insert into trip (name, location, season, rating) values ('남이섬', '강원도 춘천', '봄', 4.6);
insert into trip (name, location, season, rating) values ('전주 한옥마을', '전라북도 전주', '봄', 4.5);
insert into trip (name, location, season, rating) values ('양평 두물머리', '경기도 양평', '봄', 4.3);

insert into trip (name, location, season, rating) values ('강릉 경포해변', '강원도 강릉', '여름', 4.7);
insert into trip (name, location, season, rating) values ('속초 해수욕장', '강원도 속초', '여름', 4.4);
insert into trip (name, location, season, rating) values ('제주도 협재해변', '제주특별자치도 제주시', '여름', 4.8);
insert into trip (name, location, season, rating) values ('남해 상주은모래비치', '경상남도 남해', '여름', 4.6);
insert into trip (name, location, season, rating) values ('부산 해운대', '부산광역시 해운대구', '여름', 4.5);

insert into trip (name, location, season, rating) values ('내장산 국립공원', '전라북도 정읍', '가을', 4.9);
insert into trip (name, location, season, rating) values ('설악산 국립공원', '강원도 속초', '가을', 4.8);
insert into trip (name, location, season, rating) values ('부여 궁남지', '충청남도 부여', '가을', 4.6);
insert into trip (name, location, season, rating) values ('안동 하회마을', '경상북도 안동', '가을', 4.5);
insert into trip (name, location, season, rating) values ('서울 북한산 둘레길', '서울특별시', '가을', 4.4);

insert into trip (name, location, season, rating) values ('평창 대관령 양떼목장', '강원도 평창', '겨울', 4.9);
insert into trip (name, location, season, rating) values ('강원도 정동진', '강릉시 정동진', '겨울', 4.6);
insert into trip (name, location, season, rating) values ('부주 덕유산 리조트', '전라북도 무주', '겨울', 4.7);
insert into trip (name, location, season, rating) values ('설악산 국립공언', '강원도 속초', '겨울', 4.8);
insert into trip (name, location, season, rating) values ('제천 청풍호', '충청북도 제천', '겨울', 4.4);

select * from trip;

commit;