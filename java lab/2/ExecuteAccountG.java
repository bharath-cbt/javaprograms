import java.util.Scanner;
class BankAccount{
 String AcctName,Type;
 long AcctNo;
 double balance;
Scanner s=new Scanner(System.in);
 void getAcctNo(){
 System.out.println("Acct Number is :"+AcctNo);
 }
 void setAcctNo(int acctno){
 AcctNo=acctno;
 }
 void getAcctBalance(){
 System.out.println("Acct balance is :"+balance);
 }
 void setAcctBalance(double bal){
 balance=bal;
 }
void setName(String s){
AcctName=s;
}
void getName(){
System.out.println("AcctName is:"+AcctName);
}
void setType(String type){
Type=type;
}
void getType(){
System.out.println("Account type is: "+Type);
}
 public BankAccount(String Name,String T,long AccNo,double bal){
 AcctName=Name;
Type=T;
balance=bal;
AcctNo=AccNo;

 }
 void deposit(){
 getAcctBalance();
 }
 void withdraw(){
double wbal;
System.out.print("Enter with draw amount:");
wbal=s.nextLong();
System.out.println("with draw amount is:"+wbal);
balance=balance-wbal;
System.out.println("balance after with drawing: "+balance);
 }
 void display(){
getAcctNo();
getType();
getName();
 }
}
class ExecuteAccountG{
 public static void main(String args[]){

 BankAccount ba=new BankAccount("abc","saving",1234,20000.00);

ba.display();
ba.getAcctBalance();
ba.withdraw();
ba.deposit();
 }
}
