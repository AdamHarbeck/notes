select * from users;

select * from users where length(username) = 4 -- return all users with a username of 4 char
union
select * from users where id < 5;

select * from users where length(username) = 4 -- return all users with a username of 4 char
union
select * from users where id > 10;

select * from users where length(username) = 4 -- return all users with a username of 4 char
union all
select * from users where id > 10;

select * from users where length(username) = 4 -- return all users with a username of 4 char
intersect 
select * from users where id < 14;

--select * from users where length(username) = 4 and id < 14;
select * from users where length(username) = 4 -- return all users with a username of 4 char
except 
select * from users where id < 14;

-- indexes
create index tasks_status_hashidx on tasks using hash (status);
create index tasks_due_date_btree on tasks(due_date);


-- nested query
select * from (select t.id, t.description, t.due_date, t.status, u.id as user_id, u.username 
from tasks t
join users u
on t.user_assigned_id = u.id) tu where length(tu.username) > 8;


-- view
create view tasks_users_join_view as select t.id, t.description, t.due_date, t.status, u.id as user_id, u.username 
from tasks t
join users u
on t.user_assigned_id = u.id;

select * from tasks_users_join_view tu where length(tu.username) > 8;