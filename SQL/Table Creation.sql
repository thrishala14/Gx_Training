use MedPlus_Mart;
 
create table Customer (
	Cust_ID int identity(1,1) not null,
	Cust_Name varchar(100),
	Cust_Address varchar(max),
	Cust_Aadhaar bigint,
	Cust_Mobile varchar(15),
	Cust_email varchar(355),
	Cust_Age int check(Cust_Age>=18)
)


create table Account (
	Acc_No int identity(1001,1) not null,
	Acc_Type varchar(100),
	Acc_Balance float,
	Acc_OpenDate date,
	Cust_ID int
)

select * from Customer;

insert into Customer(Cust_Name, Cust_Address, Cust_Aadhaar, Cust_Mobile, Cust_email, Cust_Age) 
values ('Thrishala', 'Mannagudda, Mangalore', '299451643994', '9740258381','thrishalanp@gmail.com', 21);
 
insert into Customer(Cust_Name, Cust_Address, Cust_Aadhaar, Cust_Mobile, Cust_email, Cust_Age) 
values ('Akshatha', 'Udupi', '300251643994', '9991110001','ashetty@gmail.com', 23);

insert into Customer(Cust_Name, Cust_Address, Cust_Aadhaar, Cust_Mobile, Cust_email, Cust_Age) 
values ('Supriya', 'Udupi', '200111643994', '8899112200','sudyavara@gmail.com', 56);

insert into Customer(Cust_Name, Cust_Address, Cust_Aadhaar, Cust_Mobile, Cust_email, Cust_Age) 
values ('Rachana', 'Mysore', '609451643994', '7891230981','rshanbogue@gmail.com',38);

insert into Customer(Cust_Name, Cust_Address, Cust_Aadhaar, Cust_Mobile, Cust_email, Cust_Age) 
values ('Chaitra', 'Mangalore', '234561643994', '9012312345','cprabhu@gmail.com',18);

insert into Account(Acc_Type, Acc_Balance, Acc_OpenDate, Cust_ID) 
values ('Savings','10000', '2018-03-14', 1);

insert into Account(Acc_Type, Acc_Balance, Acc_OpenDate, Cust_ID) 
values ('Savings','20000', '2020-06-09', 1);

insert into Account(Acc_Type, Acc_Balance, Acc_OpenDate, Cust_ID) 
values ('Loan','30000', '2019-09-14', 2);

insert into Account(Acc_Type, Acc_Balance, Acc_OpenDate, Cust_ID) 
values ('Savings','40000', '2023-03-09', 3);

insert into Account(Acc_Type, Acc_Balance, Acc_OpenDate, Cust_ID) 
values ('Savings','50000', '2009-01-14', 4);

insert into Account(Acc_Type, Acc_Balance, Acc_OpenDate, Cust_ID) 
values ('Savings','50000', '2009-01-14', 9); 
--The INSERT statement conflicted with the FOREIGN KEY constraint "FK__Account__Cust_ID__2D27B809". The conflict occurred in database "MedPlus_Mart", table "dbo.Customer", column 'Cust_ID'.

select * from Account;

alter table Customer
add primary key(Cust_ID);

alter table Account
add primary key(Acc_No);

alter table Account
add foreign key(Cust_ID) references Customer(Cust_ID);

insert into Customer(Cust_Name, Cust_Address, Cust_Aadhaar, Cust_Mobile, Cust_email, Cust_Age) 
values ('Chaitra', 'Mangalore', '234561643994', '9012312345','cprabhu@gmail.com',13);
--The INSERT statement conflicted with the CHECK constraint "CK__Customer__Cust_A__34C8D9D1". The conflict occurred in database "MedPlus_Mart", table "dbo.Customer", column 'Cust_Age'.

select Cust_ID, Cust_Name, Cust_Aadhaar, Cust_Age
into tempCust from Customer where Cust_Age>30;

select * from tempCust;

select * from Customer;

alter table Customer
add Cust_SSN varchar(15);

alter table Customer
alter column Cust_SSN varchar(100);

alter table Customer 
drop column Cust_SSN;

alter table Customer
add Age_2 int;

alter table Customer
add check (Age_2>1);

insert into Customer(Age_2) values (0);--error
insert into Customer(Age_2) values (2);

alter table Customer 
add constraint Cust_UK 
Unique (Cust_email);

update Customer 
set Cust_email =('thrishalanp@gmail.com') where Cust_ID='8';
--Violation of UNIQUE KEY constraint 'Cust_UK'. Cannot insert duplicate key in object 'dbo.Customer'. The duplicate key value is (thrishalanp@gmail.com).

select * from Customer;




drop table Customer;

drop table Account;

drop table tempCust;



-----Assignment 3----09/11/2023----
---1.
alter table Account
add Balance int;

select * from Account;

update Account set Balance=50000 where Acc_No=1001;
update Account set Balance=2000 where Acc_No=1002;
update Account set Balance=100000 where Acc_No=1003;
update Account set Balance=7900 where Acc_No=1004;
update Account set Balance=60 where Acc_No=1005;

---2.
alter table Customer
add Pincode varchar(10);

select * from Customer;

update Customer set Pincode=575003 where Cust_ID=1;
update Customer set Pincode=575004 where Cust_ID=2;
update Customer set Pincode=575005 where Cust_ID=3;
update Customer set Pincode=575006 where Cust_ID=4;
update Customer set Pincode=575007 where Cust_ID=5;
update Customer set Pincode=575008 where Cust_ID=6;

alter table Customer
alter column pincode int;

----3.
BEGIN
	SET IDENTITY_INSERT Customer ON;
	insert into Customer (Cust_Id,cust_name,cust_address, cust_aadhaar, cust_mobile, cust_email, cust_age, Cust_ssn, age_2, pincode) 
		values (50,'AAA', 'XXX', 111, 999, 'aaa@gmail.com', 30, 900, 20, 575001);
	insert into Customer (Cust_Id,cust_name,cust_address, cust_aadhaar, cust_mobile, cust_email, cust_age, Cust_ssn, age_2, pincode) 
		values (51,'BBB', 'YYY', 222, 888, 'bbb@gmail.com', 45, 800, 20, 575002);
	insert into Customer (Cust_Id,cust_name,cust_address, cust_aadhaar, cust_mobile, cust_email, cust_age, Cust_ssn, age_2, pincode) 
		values (52,'CCC', 'ZZZ', 333, 777, 'ccc@gmail.com', 60, 700, 20, 575100);
	SET IDENTITY_INSERT Customer OFF;
END

select * from Customer;

insert into Customer (Cust_Id,cust_name,cust_address, cust_aadhaar, cust_mobile, cust_email, cust_age, Cust_ssn, age_2, pincode) 
		values (58,'AAA', 'XXX', 111, 999, 'aaa@gmail.com', 30, 900, 20, 575001);
		---Msg 544, Level 16, State 1, Line 160
		---Cannot insert explicit value for identity column in table 'Customer' when IDENTITY_INSERT is set to OFF.


BEGIN
	SET IDENTITY_INSERT Account ON;
	insert into Account(Acc_No, Acc_Type, Acc_Balance, Acc_OpenDate, Cust_id, Balance) 
		values (5000,'savings', 2000, '2023-09-08', 50, 5000);
	insert into Account(Acc_No, Acc_Type, Acc_Balance, Acc_OpenDate, Cust_id, Balance) 
		values (5001,'current', 10000, '2023-08-08', 50, 5000);
	insert into Account(Acc_No, Acc_Type, Acc_Balance, Acc_OpenDate, Cust_id, Balance) 
		values (5002,'current', 5000, '2023-07-08', 50, 5000);
	SET IDENTITY_INSERT Account OFF;
END

select * from Account;

insert into Account(Acc_Type, Acc_Balance, Acc_OpenDate, Cust_id, Balance) 
		values ('current', 5000, '2023-07-08', 50, 5000);


--------11/09/2023


SELECT SCOPE_IDENTITY(); --returns the primary key of the latest inserted row --returns 5003

SELECT SCOPE_IDENTITY();

BEGIN
	DECLARE @CustId INT;
	insert into Customer (cust_name, cust_address, cust_aadhaar, cust_mobile, cust_email, cust_age, Cust_ssn, age_2, pincode) 
		values ('MMM', 'XXX', 111, 999, 'mmm@gmail.com', 30, 901, 20, 575001);
	SET @CustId = @@IDENTITY;
	print @CustId;
	set @CustId = SCOPE_IDENTITY();
	print @CustId;
END
--Output = 55 55
-- @@ = System Variable - cannot assign or deleter the variables

select * from Account;

select * from Customer;

update Account set Balance=10000;

update Account set Balance = (Balance*1.05) where Acc_Type = 'Savings';

delete from Customer where Cust_Id=55;

select top(1) * from Customer; --top 1 customer

select top 50 PERCENT * from Customer; --top 50% customer

select * from Customer where Cust_id not in (select Cust_id from Account);

truncate table tempCust; --delete all the rows in the tables , 
						---cannot be reversed, no where clause, no overhead coz no shifting to memory.

select * from sys.tables; --lists all the tables

select * from tempCust;

select Cust_id, Cust_name, Cust_Age
from Customer
order by Cust_age desc;

select Cust_id, Cust_name, Cust_Age
from Customer
order by Cust_name;					--default order by is ascending (ASC| DESC)


---aggregate functions --- on numbers, summary of data
---count() = no of rows
---sum() = sum of values in row
---min(), max(), avg()

---group by clause -- group rows that have same values , one or more column

select Acc_Type, count(*) as count, sum(Balance) as sum, min(Balance) as min, max(Balance) as max, avg(Balance) as avg
from Account
group by Acc_Type;

--having clause - comes along with group by --give condition for aggregate functions

select Acc_Type, count(*) as count, sum(Balance) as sum, min(Balance) as min, max(Balance) as max, avg(Balance) as avg
from Account
group by Acc_Type
having count(*)>2 and sum(Balance)>30000;

--alias names --2 types: column alias and table alias
--column alias

--without alias --(no column name)
select Acc_Type, count(*), sum(Balance), min(Balance), max(Balance), avg(Balance)
from Account
group by Acc_Type;

--with alias --- use as, in double quotes for 2 words or just like that for single word
select Acc_Type, count(*) as Total_Count, sum(Balance) "Total Balance", min(Balance) Min_Balance, max(Balance) Max_Balance, avg(Balance) as Average_Balance
from Account
group by Acc_Type;

--Table alias
select * from Customer C where C.Cust_id not in (select A.Cust_id from Account A);

select c. Cust_id, c.Cust_Name, a.Acc_No 
FROM Customer c, Account a
where c.Cust_id=a.Cust_id;

select C.Cust_id, C.Cust_Name, datediff(year, Acc_OpenDate, getdate()) from account a, Customer c;

alter table Account
alter column Acc_OpenDate datetime;

select Cust_ID, Cust_Name, Cust_Age,
case when (Cust_Age between 18 and 20) then 'teenagers'
	when (Cust_Age between 21 and 30) then 'twenties'
	when (Cust_Age between  31 and 40) then 'thirties'
	when (Cust_Age between 41 and 58) then 'middle age'
	else 'Retired'
End "Age Category"
from Customer;

drop table tempCust
--union and union all -- same datatype and same no.of columns
--if table 1 - a, b, c and table 2 - a,d,e
--union= a,b,c,d,e
--union all= a,b,c,a,d,e

insert into tempCust(Cust_Name, Cust_Aadhaar, Cust_Age) values('ppp', '20000', 40);

select Cust_Id, Cust_Name, Cust_Age from Customer
union
select Cust_Id, Cust_Name, Cust_Age from tempCust;

select Cust_Id, Cust_Name, Cust_Age from Customer
union all
select Cust_Id, Cust_Name, Cust_Age from tempCust;

select Cust_Id, Cust_Name, Cust_Age from Customer
intersect
select Cust_Id, Cust_Name, Cust_Age from tempCust;

select Cust_Id, Cust_Name, Cust_Age from Customer
except
select Cust_Id, Cust_Name, Cust_Age from tempCust;

select Cust_Id, Cust_Name, Cust_Age from tempCust
except
select Cust_Id, Cust_Name, Cust_Age from Customer;

--coalesce -- returns the first non null value
--blank - something is there , null - nothing is there

select * from Account;

select coalesce('orange', 'apples', 'mango', 'grapes')
select coalesce(null, 'apples', 'mango', 'grapes')
select coalesce(null, null, 'mango', 'grapes')
select coalesce(null, null, null, 'grapes')
select coalesce('orange', null, null, 'grapes')

select Cust_id, coalesce(age_2, Cust_age) from Customer;

--datatype conversion --cast and convert --data should be convertible
--convert(datatype, value) --- convert(datetime, value, 111) 
--3rd parameter specifies the format of the date
--cast(value as datatype)


---assignment 4 --- 11/09/2023
---1.
select Cust_Name, Cust_Age, Cust_Address, Cust_email, 'my age is ' +convert(varchar(10), Cust_Age)+ ' and i am a ' + case when (Cust_Age between 18 and 20) then 'teenagers'
	when (Cust_Age between 21 and 57) then 'working'
	when (Cust_Age > 57) then 'senior citizen' end
from Customer

--2. Write a query to list down the account as bad account/Good account/ Average account based on the balance
select Acc_No, Acc_Balance, case when(Acc_Balance<10000) then 'Bad Account'
							when(Acc_Balance between 10000 and 30000) then 'Average Account'
							when(Acc_Balance>30000) then 'Good Account'
						end "Account Category"
from Account;


--3. Write query to Find the total customers between age group 0-20, 20-40, 40-60 and > 60
select Age.Age_Group, count(*) as Total_Customers
from ( select case when(Cust_Age between 0 and 20) then '0 to 20' 
			when(Cust_Age between 20 and 40) then '20 to 40' 
			when(Cust_Age between 40 and 57) then '40 to 57' 
			when(Cust_Age > 57) then '57 and greater' end "Age_Group" from Customer) Age
group by Age.Age_Group;


----09-12-2023
CREATE TABLE Employee
(EmpID INT IDENTITY(1,1) PRIMARY KEY,
EmpName       VARCHAR(100),
BranchId      INT,
SSN           VARCHAR(20),
Managerid     INT,
Email         VARCHAR(100),
City          VARCHAR(100)
)

INSERT into Employee (EmpName, BranchId, SSN, Managerid, Email, City)
VALUES ( 'Jason Telereski', 1, '980-098-9862', NULL, 'Jason@Gmail.com', 'New york')

INSERT into Employee (EmpName, BranchId, SSN, Managerid, Email, City)
VALUES ( 'Narayana Kumar', 1, '530-099-3445', 1, 'Narayana@Gmail.com', 'New york')

INSERT into Employee (EmpName, BranchId, SSN, Managerid, Email, City)
VALUES ( 'Erik darwin', 1, '522-245-8176', 2, 'Erik@Gmail.com', 'Chicago')

INSERT into Employee (EmpName, BranchId, SSN, Managerid, Email, City)
VALUES ( 'Joanna Aiken', 1, '871-901-3286', 2, 'Joanna@Gmail.com', 'Washington')

INSERT into Employee (EmpName, BranchId, SSN, Managerid, Email, City)
VALUES ( 'Laura Cassily', 1, '343-400-8007', 2, 'Laura@Gmail.com', 'Washington')

INSERT into Employee (EmpName, BranchId, SSN, Managerid, Email, City)
VALUES ( 'Jim Carrole', 1, '322-230-6117', 3, 'Jimc@Gmail.com', 'Washington')

INSERT into Employee (EmpName, BranchId, SSN, Managerid, Email, City)
VALUES ( 'Jim Carrole', 1, '343-400-8007', 4, 'Jimc@Gmail.com', 'Washington')


SELECT * FROM Employee;

select * 
from Customer, Account 
where Account.Cust_Id=Customer.Cust_Id;

select *
from Customer c 
inner join Account a on a.Cust_id=c.cust_id;

select c.Cust_id, c.Cust_Name, c.Cust_age, a.acc_type, a.balance
from Customer c 
inner join account a on a.cust_id=c.cust_id;

select c.Cust_id, c.Cust_Name, c.Cust_age, a.acc_type, a.balance
from Customer c 
left join account a on a.cust_id=c.cust_id;

select c.Cust_id, c.Cust_Name, c.Cust_age, a.acc_type, a.balance
from Customer c 
right join account a on a.cust_id=c.cust_id;

create table Acc_Details(
	ID INT IDENTITY(1,1) PRIMARY KEY,
	Acc_No int,
	Amount int, 
	Trans_Ref varchar(20),
	Trans_Type varchar(10)
)

select * from Account;

alter table Acc_Details
add foreign key(Acc_No) references Account(Acc_No);

insert into Acc_Details(Acc_No, Amount, Trans_Ref, Trans_Type) values (1001, 2000, 'aaa','credit')
insert into Acc_Details(Acc_No, Amount, Trans_Ref, Trans_Type) values (1001, 3000, 'bbb','debit')
insert into Acc_Details(Acc_No, Amount, Trans_Ref, Trans_Type) values (1002, 2000, 'ccc','credit')
insert into Acc_Details(Acc_No, Amount, Trans_Ref, Trans_Type) values (1002, 1500, 'ddd','debit')
insert into Acc_Details(Acc_No, Amount, Trans_Ref, Trans_Type) values (1003, 800, 'eee','debit')
insert into Acc_Details(Acc_No, Amount, Trans_Ref, Trans_Type) values (1005, 200, 'fff','credit')
insert into Acc_Details(Acc_No, Amount, Trans_Ref, Trans_Type) values (5001, 200, 'ggg','credit')
insert into Acc_Details(Acc_No, Amount, Trans_Ref, Trans_Type) values (5002, 1000, 'hhh','credit')
insert into Acc_Details(Acc_No, Amount, Trans_Ref, Trans_Type) values (1002, 1250, 'iii','debit')
insert into Acc_Details(Acc_No, Amount, Trans_Ref, Trans_Type) values (1002, 2390, 'jjj','tt')

select * from Acc_Details


alter table Acc_Details
add check (Trans_Type in ('credit','debit')) ;

select e1.EmpID, e1.EmpName,e1.SSN, e2.EmpName as Manager
from employee e1, employee e2
where e1.Managerid=e2.EmpID


select e1.EmpID, e1.EmpName, e1.SSN, e2.EmpName as Manager
from employee e1 left join employee e2
on e1.Managerid=e2.EmpID

--subqueries -- single row and multi column/nested queries
--should use = only in single query

select e.EmpName
from Employee e
where e.EmpID = (select e.Managerid from Employee e where e.EmpID = 2)

select e.EmpName
from Employee e
where e.EmpID in (select e.Managerid from Employee e where e.City = 'washington')

select * FROM employee;

select e1.* from Employee e1 
where exists (select 1 from employee e2
				where e1.Managerid = e2.EmpID
				and e2.city='chicago')

create or alter view ve_EmpData
as
select e1.EmpID, e1.EmpName,e1.SSN, e2.EmpName as Manager
from employee e1, employee e2
where e1.Managerid=e2.EmpID

select * from ve_EmpData;

select * from Account;

select * from Acc_Details;

select a.Balance,  d.Acc_No, d.amount, d.Trans_Type
from account a, Acc_Details d
where a.Acc_No in (select d.acc_no from Acc_Details d) and d.Acc_No = a.acc_no

select * from account;

select * from Acc_Details;

update Account set Balance=0;

update Account set Balance = (Balance*1.05) where Acc_Type = 'Savings';

---assignment 5 - 09-13-2023
update account
set balance += tot_credit -tot_debit
from 
		(select acc_no, sum(case when trans_type='credit' then amount else 0 end) as tot_credit, 
		sum(case when trans_type='debit' then amount else 0 end) as tot_debit
		from acc_details group by acc_no) as trans
where account.acc_no = trans.acc_no

update account
set balance = isnull(
(select sum(case when trans_type = 'credit' then amount when trans_type = 'debit' then (amount *-1) else 0 end)
 from acc_details ad where ad.Acc_No = account.acc_no),0)

 ---09/13/2023

 --while loop
 declare @counter int
 set @counter=1
 while(@counter<=10)
 begin
	print 'the counter value is = ' + convert(varchar, @counter)
	set @counter = @counter + 1
end

--cursor

if CURSOR_STATUS('global', 'curEmp')>=-1
begin
	deallocate curEmp
end

declare @empId int, @city varchar(50)

declare curEmp cursor 
for select EmpID, city FROM employee
open curEmp
fetch next from curEmp into @empId, @city
while @@FETCH_STATUS=0
	begin 
		print 'inside cursor' 
		print @empId 
		print @city
		print '-----------'
		fetch next from curEmp into @empId, @city
	end
close curEmp


---assignment 6 - 09/13/2023
select * from account

begin
	deallocate curAccount
end

declare @accno int, @count int, @bal int

declare curAccount cursor
for select acc_no,acc_balance from account
open curAccount
fetch next from curAccount into @accno, @bal
while @@FETCH_STATUS=0
begin
	select @count = count(acc_no) from Acc_Details where acc_no = @accno
	if @count = 0
	begin
		update account set acc_balance = acc_balance +1000 where acc_no = @accno
	end
	if @bal > 50000
	begin
		update account set acc_balance = acc_balance +2000 where acc_no = @accno
	end
	fetch next from curAccount into @accno, @bal
end
close curAccount

select * from Acc_Details
