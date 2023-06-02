public class GarbageCollector{
protected void finalize()throws Throwable
{
System.out.println("Garbage Collection started explicitly.");
} 
public static void main(String[] args) {
int SIZE = 10;
//StringBuffer s=new StringBuffer();
GarbageCollector g=new GarbageCollector();
//g=null;
for (int i = 0; i < SIZE; i++) {
System.out.println("Garbage Collection started implicitly.");
}
try{
g.finalize();
}
catch(Throwable e)
{
e.printStackTrace();
}
System.gc();
}
}
