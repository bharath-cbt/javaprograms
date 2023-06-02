import java.util.Scanner;
interface GeometricShape
{
 void area();
 void perimeter();
}
class Triangle implements GeometricShape
{
 double a=1,b=2,c=1,h=4;
 public void area()
{
 System.out.println("");
 double area1=0.5*b*h;
 System.out.println("Area of a Triangle: "+area1);
 }
 public void perimeter()
{
 double per=a+b+c;
 System.out.println("Perimeter of a Triangle: "+per);
 System.out.println("");
 }
}
class Rectangle implements GeometricShape
{
 int length=15,width=10,per,area1;
 public void area()
{
 area1=length*width;
 System.out.println("Area of Rectangle: "+area1);
 }
 public void perimeter()
{
 per=2*length+2*width;
 System.out.println("Perimeter of Rectangle: "+per);
 System.out.println("");
 }
}
class Circle implements GeometricShape
{
 int r=10;
 double p=3.141,area1=0.0,per=0.0;
 public void area()
{
 area1=p*r*r;
 System.out.println("Area of Circle: "+area1);
 }
 public void perimeter()
{
 per=2*p*r;
 System.out.println("Perimeter of Circle: "+per);
 System.out.println("");
 }
}
class ExecuteMain
{
 public static void main(String args[])
{
 Triangle t=new Triangle();
 t.area();
 t.perimeter();
 Circle c=new Circle();
 c.area();
 c.perimeter();
 Rectangle r=new Rectangle();
 r.area();
 r.perimeter();
 }
}