import java.util.*;
class BankAccount
{
String name,type;
int acctno;
double balance;
double wbalance;
Scanner s = new Scanner(System.in);
public BankAccount()
{
name="abc";
type="saving";
acctno=1234567890;
balance=10000.00;
}
public BankAccount(String n,String t,int an,double bl)
{
name=n;
type=t;
acctno=an;
balance=bl;
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
}
class ExecuteAccountA
{
public static void main(String args[])
{
BankAccount ba1=new BankAccount();
BankAccount ba2=new BankAccount("Sreenivas","Saving",1234567891,20000);
System.out.println("1st Account holder Details : \n");
ba1.display();
ba1.deposit();
ba1.withdraw();
ba1.display();
System.out.println("2nd Account holder Details : \n");
ba2.display();
ba2.deposit();
ba2.withdraw();
ba2.display();
}
}