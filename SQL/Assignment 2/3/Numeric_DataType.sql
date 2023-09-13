--numeric datatype;

--bit 
print 'Bit Datatype'
DECLARE @Var1 bit;
 DECLARE @Var2 bit;
 DECLARE @Var3 bit;
 DECLARE @Var4 bit;
 DECLARE @Var5 bit;
 SET @Var1 = null;
 SET @Var2 = 0;
 SET @Var3 = 1;
 SET @Var4 = -3;
 SET @Var5 = 'True';
 PRINT @Var1;
 PRINT @Var2;
 PRINT @Var3;
 PRINT @Var4;
 PRINT @Var5;

 --float
 print 'float Datatype'
 declare @var6 float;
 declare @var7 float;
 declare @var8 float;
 declare @var9 float;
 declare @var10 float;
 --set @var6 = 'thrishala'; error
 set @var7 = 315;
 set @var8 = 315.1111;
 set @var9 = -0.1;
 set @var10 = 100000000;
 print @var6;
 print @var7;
 print @var8;
 print @var9;
 print @var10;
 

 --real
 print 'Real Datatype'
 declare @var11 real;
 declare @var12 real;
 declare @var13 real;
 declare @var14 real;
 declare @var15 real;
 --set @var11 = 'thrishala'; error
 set @var12 = 123456.7890123;
 set @var13 = 32.00001001;
 set @var14 = 0;
 set @var15 = 0.111111111111;
 print @var11;
 print @var12;
 print @var13;
 print @var14;
 print @var15;

--bigint
print 'Bigint Datatype'
declare @var16 bigint;
declare @var17 bigint;
declare @var18 bigint;
declare @var19 bigint;
declare @var20 bigint;
set @var16 = 11;
set @var17 = 12.5;
set @var18 = -12.5;
set @var19 = 9223372036854775900;
set @var20 = -9223372036854775900;
print @var16;
print @var17;
print @var18;
print @var19;
print @var20;


--int
print 'int Datatype'
declare @var21 int;
declare @var22 int;
declare @var23 int;
declare @var24 int;
declare @var25 int;
set @var21 = 0;
set @var22= -15;
set @var23= 15;
set @var24= 12.00034;
set @var25 = -112.3334;
print @var21;
print @var22;
print @var23;
print @var24;
print @var25;

--smallint
print 'smallInt Datatype'
declare @var26 smallint;
declare @var27 smallint;
declare @var28 smallint;
declare @var29 smallint;
declare @var30 smallint;
set @var26 = 0.1111;
set @var27 = 33000;
set @var28 = -33000;
set @var29 = 23;
set @var30 = -23;
print @var26;
print @var27;
print @var28;
print @var29;
print @var30;

--tinyint
print 'tinyInt Datatype'
declare @var31 tinyint;
declare @var32 tinyint;
declare @var33 tinyint;
declare @var34 tinyint;
declare @var35 tinyint;
set @var31 = 0;
set @var32= -1;
set @var33= 255;
set @var34= 256;
set @var35 = -200;
print @var31;
print @var32;
print @var33;
print @var34;
print @var35;

--decimal
print 'decimal Datatype'
declare @var36 decimal;
declare @var37 decimal;
declare @var38 decimal;
declare @var39 decimal;
declare @var40 decimal;
set @var36 = 0;
set @var37 = 1.11111111;
set @var38 = -9899888899888;
set @var39 = -25.4;
set @var40 = 23445789201;
print @var36;
print @var37;
print @var38;
print @var39;
print @var40;

--numeric
print 'numeric Datatype'
declare @var41 numeric;
declare @var42 numeric;
declare @var43 numeric;
declare @var44 numeric;
declare @var45 numeric;
--set @var41 = 'thrishala'; Error converting data type varchar to numeric.
set @var42 = 234;
set @var43 = -2333;
set @var44 = 20;
set @var45 = -0.1;
print @var41;
print @var42;
print @var43;
print @var44;
print @var45;



--CHARACTER DATATYPE
--char
print 'char datatype';
declare @chr1 char(2) = 'thrishala';
declare @chr2 char = 6;
declare @chr3 char = 'T';
declare @chr4 char(10) = 'thrishala';
declare @chr5 char(2) = 'T';
print @chr1;
print @chr2;
print @chr3;
print @chr4;
print @chr5;

--varchar
print 'varchar datatype';
declare @chr6 varchar(1)= 'thrishala';
declare @chr7 varchar(5)= 'thrishala';
declare @chr8 varchar(max)= 'thrishalafdgdkjlyut254798ogfxcvbnmjhgfdxsdfrgthyjuiuytre';
declare @chr9 varchar(20)= 'thrishala';
declare @chr10 varchar(7)= 't344512eert';
print @chr6;
print @chr7;
print @chr8;
print @chr9;
print @chr10;


--nvarchar/nchar
declare @nchr1 nvarchar(4) = N'こんにちは';
declare @nchr2 nvarchar(2) = N'한국어';
declare @nchr3 nchar(7) = 'thrishala';
declare @nchr4 nchar(10) = 'radhakrishna';
print @nchr1;
print @nchr2;
print @nchr3;
print @nchr4;

--DATE DATATYPE

declare @dte1 datetime = '2023-09-06 12:30:45.111';
print @dte1;
declare @dte2 date = '2023-09-06';
declare @dte3 time = '12:30:45';
declare @dte4 smalldatetime = '2023-09-06 12:30:45';
declare @dte5 datetime2 = '2023-09-06 12:30:45.111111';
declare @dte6 datetimeoffset = '2023-09-06 12:30:45+10:23';
print @dte2;
print @dte3;
print @dte4;
print @dte5;
print @dte6;

--binary
DECLARE @myVar BINARY(2);
SET @myVar = 12345678;
DECLARE @myVar1 VARBINARY(2);
SET @myVar1 = 123456789;
print @myVar;
print @myVar1;







