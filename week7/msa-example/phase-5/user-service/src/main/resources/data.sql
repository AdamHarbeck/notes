insert into roles(name, starting_salary) values ('admin', 75000);
insert into roles(name, starting_salary) values ('basic_user', 45000);

insert into users(name, role_id) values ('kev', 1);
insert into users(name, role_id) values ('Thomas', 2);
insert into users(name, role_id) values ('Jonathan', 2);


insert into tasks(id) values (1);
insert into tasks(id) values (2);
insert into tasks(id) values (3);
insert into tasks(id) values (4);
insert into tasks(id) values (5);
insert into tasks(id) values (6);


insert into users_tasks(user_id, tasks_id) values (1, 2);
insert into users_tasks(user_id, tasks_id) values (2, 1);
insert into users_tasks(user_id, tasks_id) values (2, 2);
insert into users_tasks(user_id, tasks_id) values (2, 3);
insert into users_tasks(user_id, tasks_id) values (3, 1);
insert into users_tasks(user_id, tasks_id) values (3, 2);
insert into users_tasks(user_id, tasks_id) values (3, 3);
insert into users_tasks(user_id, tasks_id) values (3, 4);

