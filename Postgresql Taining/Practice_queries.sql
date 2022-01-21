create table EmployeeDetails (
	EmpId INT PRIMARY KEY,
	FullName VARCHAR(100),
	Project VARCHAR(10),
	Manager_id INT,
	City VARCHAR(50)
);

insert into EmployeeDetails(EmpId,FullName,Project,Manager_id,City)
values(501,'Shamik Basu','P1',101,'Bangalore'),
(502,'Shamik Basu','P1',101,'Chennai'),
(503,'Rahul Angedi','P2',103,'Pune'),
(504,'Sujoy Roy','P1',101,'Delhi'),
(505,'Mohit Gupta','P4',104,'Chennai'),
(506,'Shreya Malik','P2',102,'Kolkata'),
(507,'Hassan Akhtar','P1',106,'Hyderabad');

create table EmployeeSalary (
	EmpId INT PRIMARY KEY,
	Salary INT
	);
	
insert into EmployeeSalary(EmpId,Salary)
values(501,15000),
(502,12000),
(503,14000),
(504,13500),
(505,20000),
(506,9000),
(507,8500);

select * from EmployeeDetails;
select * from EmployeeSalary;

/*Question 1*/
select empid,fullname from EmployeeDetails 
where manager_id=101;

/*Question 2*/
select count(empid) from EmployeeDetails 
where project='P1';

/*Question 3*/
select max(Salary),min(Salary),avg(Salary) 
from EmployeeSalary;

/*Question 4*/
select empid from EmployeeSalary
where salary between 10000 and 15000;

/*Question 5*/
UPDATE EmployeeSalary SET salary=salary+1000;
select * from EmployeeSalary;

/*Question 6*/
select empid from EmployeeDetails
INTERSECT
select empid from EmployeeSalary;

/*Question 7*/
select upper(fullname),lower(city) from EmployeeDetails;

/*Question 8*/
select project,count(empid) as emp_count 
from EmployeeDetails 
group by project
order by 2 desc;


/*Question 9*/
select * from EmployeeDetails 
where empid%2=0;


/*Question 10*/
select max(salary) from EmployeeSalary
where salary!=(select max(salary) from EmployeeSalary
where salary not in(select max(salary) from EmployeeSalary))
and salary!=(select max(salary) from EmployeeSalary);
