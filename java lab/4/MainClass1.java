//Call Base Class Constructor using super
class SuperClass 
{
public SuperClass(String str) 
{
System.out.println("Base Class Constructor " + str);
}
}
class SubClass extends SuperClass
{
public SubClass(String str) 
{
super(str);
System.out.println("Sub Class Constructor " + str);
}
}
class MainClass1
{
public static void main(String args[]) 
{
SubClass obj = new SubClass("called");
}
}
