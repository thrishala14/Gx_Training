declare @name varchar(10)='thrishala';
declare @salary int = 35000;
declare @dob date = '2001-03-14';

print 'my name is '+@name+' and salary is '+cast(@salary as varchar)+' and date of birth is '+cast(@dob as varchar)