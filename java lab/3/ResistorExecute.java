import java.util.Scanner;
class Resistor
{
float resistance;
void giveData()
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter value of resistance");
 resistance=sc.nextFloat();
 }
 void displayData()
 {
 System.out.println("resultant value of series is :"+resistance);
 }
}
class SeriesCircuit extends Resistor
{
Resistor calculateSeriesResistance(Resistor r1,Resistor r2)
{
 Resistor r3=new Resistor();
 r3.resistance=r1.resistance+r2.resistance;
 return r3;
}
}
class ParallelCircuit extends Resistor
{
Resistor calculateParallelResistance(Resistor r1,Resistor r2)
{
 Resistor r4=new Resistor();
 r4.resistance=(r1.resistance*r2.resistance)/(r1.resistance+r2.resistance);
 return r4;
}
}
class ResistorExecute
{
public static void main(String args[])
{
 Resistor r3,r4;
 Resistor r1=new Resistor();
 r1.giveData();
 Resistor r2=new Resistor();
 r2.giveData();
 SeriesCircuit sc=new SeriesCircuit();
 r3=sc.calculateSeriesResistance(r1,r2);
 r3.displayData();
 ParallelCircuit PA=new ParallelCircuit();
 r4=PA.calculateParallelResistance(r1,r2);
 r4.displayData();
}
}