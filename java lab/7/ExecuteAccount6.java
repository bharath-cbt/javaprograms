import java.util.Scanner;
class InsufficientException extends Exception{
 double balance;
 double wbalance;
 public InsufficientException(String msg){
 super(msg);
 }
 void withdraw(){
double balance=25000.00;
System.out.println("Current Balance: "+balance);
try{
System.out.print("Enter withdraw amount: ");
 Scanner in=new Scanner(System.in);
double wamount=in.nextDouble();
if(wamount>balance){
 throw new InsufficientException("Insufficient balance in account.....");
}
else
 System.out.println("Transaction Successfully Completed...............");
double rembal=balance-wamount;
System.out.println("Withdrawal Amount :"+wamount);
System.out.println("After transaction current balance :"+rembal);
}
catch(InsufficientException e){
System.out.println("Caught:"+e.getMessage());
}
 }
}
class ExecuteAccount6{
 public static void main(String args[]) {
 InsufficientException ie=new InsufficientException("Insufficient balance in account");
 ie.withdraw();
 }
}