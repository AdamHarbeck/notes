insert into roles(name, starting_salary) values ('admin', 75000);
insert into roles(name, starting_salary) values ('basic_user', 45000);

insert into users(name, role_id) values ('kev', 1);
insert into users(name, role_id) values ('Thomas', 2);
insert into users(name, role_id) values ('Jonathan', 2);

insert into tasks(description, status) values ('Study for QC', 'ASSIGNED');
insert into tasks(description, status) values ('Sleep', 'CANCELED');
insert into tasks(description, status) values ('Work on p0', 'COMPLETED');
insert into tasks(description, status) values ('Work on p1', 'COMPLETED');
insert into tasks(description, status) values ('Work on p2', 'ASSIGNED');
insert into tasks(description, status) values ('Work on p3', 'NEW');

insert into users_tasks(user_id, tasks_id) values (1, 2);
insert into users_tasks(user_id, tasks_id) values (2, 1);
insert into users_tasks(user_id, tasks_id) values (2, 2);
insert into users_tasks(user_id, tasks_id) values (2, 3);
insert into users_tasks(user_id, tasks_id) values (3, 1);
insert into users_tasks(user_id, tasks_id) values (3, 2);
insert into users_tasks(user_id, tasks_id) values (3, 3);
insert into users_tasks(user_id, tasks_id) values (3, 4);



