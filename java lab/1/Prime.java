import java.util.Scanner;
class Test {
void check(int num) {
System.out.println ("Prime numbers up to "+num+" are:");
for (int i=1;i<=num;i++)
for (int j=2;j<i;j++) {
if(i%j==0)
break;
else if((i%j!=0)&&(j==i-1))
System.out.print(""+i);
}
}
} //end of class Test
class Prime {
public static void main(String args[ ]) {
Test obj1=new Test();
Scanner input=new Scanner(System.in);
System.out.println("Enter the value of n:");
int n=input.nextInt();
obj1.check(n);
}
}