class even implements Runnable{
    public void run(){
        for(int i=0;i<=10;i+=2){
            synchronized(this);
        System.out.println("Even--"+i);
       
    }
    }
}
class odd implements Runnable{
    public void run(){
        for(int i=1;i<10;i+=2){
            synchronized(this);
        System.out.println("Odd--"+i);
        
        }
    }
}
class main1{
   
    public static void main(String args[])
    {
        even e= new even();
        odd o= new odd();
        Thread t1= new Thread(e,"ONE");
        Thread t2= new Thread(o,"Two");
        t1.start();
        t2.start();
 
    }
}