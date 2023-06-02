import java.util.*;
class BankAccount
{
String name,type;
int acctno;
double balance;
double wbalance;
static int count=0;
Scanner s = new Scanner(System.in);
public BankAccount()
{
name="abc";
type="saving";
acctno=1234567890;
balance=10000.00;
count++;
}
public BankAccount(String name,String type,int acctno,double balance)
{
this.name=name;
this.type=type;
this.acctno=acctno;
this.balance=balance;

count++;
}
void deposit()
{
double dat;
System.out.println("Enter the amount to deposit: ");
dat=s.nextDouble();
if(dat>0)
{
balance+=dat;
}
else
System.out.println("Enter the valid Amount");
}
void withdraw()
{
System.out.println("Enter the amount to withdraw : ");
wbalance=s.nextDouble();
if(wbalance>0)
{
balance-=wbalance;
}
else
System.out.println("Enter the valid Amount");
}
void display()
{
System.out.println("Account Holder Name: "+name);
System.out.println("Account Number: "+acctno);
System.out.println("Account Number: "+type);
System.out.println("Account Balance: "+balance);
System.out.println();
}
static void totalAccounts()
{
System.out.println("Total No.of Accounts :"+count);
}
}
class ExecuteAccountD
{
public static void main(String args[])
{
BankAccount ba1=new BankAccount();
BankAccount ba2=new BankAccount("Sreenivas","Saving",1234567891,20000);
ba1.display();
ba2.display();
}
}
