import java.util.*;
class Test{
    public static void main(String args[]){
        int T,N,S;
        Scanner sc= new Scanner(System.in);
        //System.out.println("Enter T");
        T=sc.nextInt();
        while(T!=0)
        {
             // System.out.println("Enter N");
             N=sc.nextInt();
            //System.out.println("Enter S");
             S=sc.nextInt();
            int diff=0;
            for(int i=0;i<=N/2;i++){
                for(int j=0;j<=N/2;j++){
                    if(S==i+j){
                    if(diff<Math.abs(i-j))
                    diff=Math.abs(i-j);
                    }
                }
            }
            System.out.println(diff);
            T--;
        }

    }
}