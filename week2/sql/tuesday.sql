-- select 
select * from users; -- * indicates all of the fields/columns
select id, username from users;

select * from tasks where user_assigned_id = 1; -- where can filter by a condition 
select * from tasks where status = 'new';
select * from tasks where due_date != current_date;
select * from tasks where due_date > current_date;

select t.id, t.description, t.due_date, t.status, t.user_assigned_id , u.username 
from tasks t
join users u
on t.user_assigned_id = u.id 
where user_assigned_id = 1;

-- statement to retrieve information for login?
/*
user gives uname = 'kev', pw = 'pass'
*/
select * from users where username = 'jmoorey3';

select * from tasks where due_date = current_date order by id asc;
select * from tasks where due_date = current_date order by id desc limit 5;
select * from tasks where due_date = current_date order by id asc limit 5 offset 5; -- pagination
select * from users where id = 3;

-- Scalar vs Aggregate function
select upper(username) from users; -- record based
select count(*) from tasks;
select user_assigned_id, count(user_assigned_id)
from tasks 
group by user_assigned_id
having count(user_assigned_id) = 2; -- group by allows us to group data by a condition for aggregate functions

select t.id, t.description, t.due_date, t.status, u.id as user_id, u.username 
from tasks t
join users u
on t.user_assigned_id = u.id;


select * from users where id = 1;
select * from users;
select * from users where username  = 'jmoorey3';
insert into users (username, password) values('kev','pass');