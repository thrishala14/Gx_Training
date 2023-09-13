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