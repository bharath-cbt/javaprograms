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
public BankAccount(String n,String t,int an,double bl)
{
name=n;
type=t;
acctno=an;
balance=bl;
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
class ExecuteAccountC
{
public static void main(String args[])
{
BankAccount[] ba=new BankAccount[5];
ba[0]=new BankAccount("Sreenivas","Saving",1234567891,20000);
ba[1]=new BankAccount("Sreenu","Saving",1234567892,30000);
ba[2]=new BankAccount();
ba[3]=new BankAccount("Srinu","Saving",1234567893,15000);
ba[4]=new BankAccount();
System.out.println("Five Accounts Details: ");
for(int i=0;i<ba.length;i++)
ba[i].display();
}
}