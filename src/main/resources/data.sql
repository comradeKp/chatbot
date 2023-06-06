insert into terminology(term_id, name,url) values(1,'medicare','https://en.wikipedia.org/wiki/Medicare_(United_States)');
insert into terminology(term_id, name,url) values(2,'medicaid','https://en.wikipedia.org/wiki/Medicaid');

insert into app_info(id, app_name,environment, url, db_details) 
values(1,'EMAP', 'SIT','http://test1','server:s1, port:8023, DB:EMDDB');
insert into app_info(id, app_name,environment, url, db_details) 
values(2,'EMAP', 'UAT','http://test2','server:s2, port:8033, DB:EMDDB');
insert into app_info(id, app_name,environment, url, db_details) 
values(3,'EMAP', 'PROD','http://emodeler','server:P1, port:8053, DB:EMDDB');

insert into app_info(id, app_name,environment, url, db_details) 
values(4,'ERL', 'SIT','http://sit','server:s1, port:8024, DB:EMDRSPDB');
insert into app_info(id, app_name,environment, url, db_details) 
values(5,'ERL', 'UAT','http://uat','server:s2, port:8034, DB:EMDRSPDB');
insert into app_info(id, app_name,environment, url, db_details) 
values(6,'ERL', 'SIT','http://erl','server:p1, port:8054, DB:EMDRSPDB');

insert into app_info(id, app_name,environment, url, db_details) 
values(7,'PCM', 'SIT','http://pcm-sit','server:s1, port:8025, DB:PCMDB');
insert into app_info(id, app_name,environment, url, db_details) 
values(8,'PCM', 'UAT','http://pcm-uat','server:s2, port:8035, DB:PCMDB');
insert into app_info(id, app_name,environment, url, db_details) 
values(9,'PCM', 'PROD','http://pcm-prod','server:p1, port:8055, DB:PCMDB');
