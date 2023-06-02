//Call Base Class Method using super
class SuperClass
{
void display() 
{
System.out.println("Base Class method called");
}
}
class SubClass extends SuperClass
{
void display() 
{
super.display();
System.out.println("Sub Class method called");
}
}
class MainClass2 
{
public static void main(String args[]) 
{
SubClass obj = new SubClass();
obj.display();
}
}