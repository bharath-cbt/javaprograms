import java.util.*;
class Test 
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       int n,i;
       while(t-->0)
       {
            n=sc.nextInt();
            int c=0;
            int a[]=new int[n];
            for (i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(i=0;i<n;i++)
            {
                if (a[i]==0)
                {
                    c=c+1;
                }
            }
            System.out.println(c);
       } 

    }
}