public class TestPriority extends Thread
{
 public static void main(String args[])
 {
 TestPriority tp1 = new TestPriority();
 TestPriority tp2 = new TestPriority();
 tp1.setPriority(Thread.MAX_PRIORITY-1);
 tp2.setPriority(Thread.MIN_PRIORITY+1);
 tp1.setName("High");
 tp2.setName("Less");
 System.out.println("High Priority is " + tp1.getPriority());
 System.out.println("Less Priority is " + tp2.getPriority());
 tp2.start();
 tp1.start();
 }
 public void run()
 {
 for(int i=0; i<10; i++)
 {
 System.out.println(this.getName() + ": " + i);
 }
 }
} 