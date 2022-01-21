create table worker(
worker_id bigserial not null primary key,
first_name varchar(20),
last_name varchar(20),
salary int,
joining_date timestamp,
department varchar(20));

create table bonus(
worker_ref_id int,
bonus_amount int,
	bonus_date timestamp,
foreign key(worker_ref_id) references worker(worker_id));

create table title(
worker_ref_id int,
worker_title varchar(20),
affected_from timestamp,
foreign key(worker_ref_id) references worker(worker_id));

INSERT INTO Worker 
	(WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
		(001, 'Monika', 'Arora', 100000, '2014-02-20 09:00:00', 'HR'),
		(002, 'Niharika', 'Verma', 80000, '2014-06-11 09:00:00', 'Admin'),
		(003, 'Vishal', 'Singhal', 300000, '2014-02-20 09:00:00', 'HR'),
		(004, 'Amitabh', 'Singh', 500000, '2014-02-20 09:00:00', 'Admin'),
		(005, 'Vivek', 'Bhati', 500000, '2014-06-11 09:00:00', 'Admin'),
		(006, 'Vipul', 'Diwan', 200000, '2014-06-11 09:00:00', 'Account'),
		(007, 'Satish', 'Kumar', 75000, '2014-01-20 09:00:00', 'Account'),
		(008, 'Geetika', 'Chauhan', 90000, '2014-04-11 09:00:00', 'Admin');
		
insert into bonus(worker_ref_id,bonus_amount,bonus_date) values
(001, 5000, '2016-02-20 00:00:00'),
		(002, 3000, '2016-06-11 00:00:00'),
		(003, 4000, '2016-02-20 00:00:00'),
		(001, 4500, '2016-02-20 00:00:00'),
		(002, 3500, '2016-06-11 00:00:00');
		
insert into title(worker_ref_id,worker_title,affected_from) values
(001, 'Manager', '2016-02-20 00:00:00'),
 (002, 'Executive', '2016-06-11 00:00:00'),
 (008, 'Executive', '2016-06-11 00:00:00'),
 (005, 'Manager', '2016-06-11 00:00:00'),
 (004, 'Asst. Manager', '2016-06-11 00:00:00'),
 (007, 'Executive', '2016-06-11 00:00:00'),
 (006, 'Lead', '2016-06-11 00:00:00'),
 (003, 'Lead', '2016-06-11 00:00:00');
 
 --finding index
Select POSITION('a' IN FIRST_NAME) from Worker where FIRST_NAME = 'Amitabh';
Select REPLACE(FIRST_NAME,'a','A') from Worker;
Select concat(first_name,' ',last_name) as full_name from worker;
Select * from worker where first_name like '%a%';
Select * from worker where salary between 100000 and 500000;
select department,count(department) from worker group by department order by department desc;
Select count(department) from worker where department='Admin';
--workers who are managers
select * from worker where worker_id in (select worker_ref_id from title where worker_title='Manager');
select * from worker w inner join title t on w.worker_id=t.worker_ref_id and worker_title='Manager';
--even rows
select * from worker where mod(worker_id,2)=0;
--limitting to number of rows
select * from worker limit 3;
select distinct salary from worker order by salary desc limit 3;
select * from worker where worker_id in(select worker_id from worker limit 3) order by first_name desc;
select * from worker where worker_id>3 limit 3;
select * from worker order by first_name desc limit 3; --first order then limit
select * from worker limit 2 offset 4; --limits to 2 data starting from 5th one
select * from worker offset 4 -- starting from 5th till end
--5th highest salary
select salary from worker order by salary desc limit 1 offset 4;
--2nd highest salary
select max(salary) from worker where salary <>(select max(salary) from worker);
--list of employees with same salary
select w.worker_id,w.first_name,w.salary from worker w,worker w1
where w.salary=w1.salary and w.worker_id<>w1.worker_id;
select w.worker_id,w.first_name,w.salary from worker w inner join worker w1
on w.salary=w1.salary and w.worker_id<>w1.worker_id;
--giving 50% data
select * from worker limit (select (count(worker_id)/2) from worker);
--each dept highest salary
select department,max(salary) from worker group by department;
select department,sum(salary) from worker group by department;
