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
Resistor calculateSeriesResistance(Resistor[] r)
{
 Resistor r3=new Resistor();
 r3.resistance=r[0].resistance+r[1].resistance;
 return r3;
}
}
class ParallelCircuit extends Resistor
{
Resistor calculateParallelResistance(Resistor[] r)
{
 Resistor r4=new Resistor();
 r4.resistance=(r[0].resistance*r[1].resistance)/(r[0].resistance+r[1].resistance);
 return r4;
}
}
class ResistorExecuteA
{
public static void main(String args[])
{
 Resistor r3,r4;
 Resistor[] r=new Resistor[2];
 r[0]=new Resistor();
 r[1]=new Resistor();
 for(int i=0;i<2;i++)
 r[i].giveData();
 SeriesCircuit sc=new SeriesCircuit();
 r3=sc.calculateSeriesResistance(r);
 r3.displayData();
 ParallelCircuit PA=new ParallelCircuit();
 r4=PA.calculateParallelResistance(r);
 r4.displayData();
}
}