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
System.out.println("Enter the Name: ");
name=s.nextLine();
System.out.println("Enter the type of Account: ");
type=s.nextLine();
System.out.println("Enter the Account Number: ");
acctno=s.nextInt();
System.out.println("Enter the Balance: ");
balance=s.nextDouble();
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
void deposit(double d)
{
if(d>0)
{
balance+=d;
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
class ExecuteAccountF
{
public static void main(String args[])
{
BankAccount ba1=new BankAccount();
System.out.println("Account Details :");
ba1.display();
ba1.deposit();
System.out.println("Account Details after deposit :");
ba1.display();
ba1.deposit(3500);
System.out.println("Account Details after deposit :");
ba1.display();
}
}