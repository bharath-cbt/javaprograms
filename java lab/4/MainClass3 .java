//Access Base Class Variables using super
class SuperClass 
{
int a = 10;
}
class SubClass extends SuperClass
{
int a = 20;
void display()
{
System.out.println("The value is : " + super.a);
}
}
class MainClass3 
{
public static void main(String args[]) 
{
SubClass obj = new SubClass();
obj.display();
}
}
