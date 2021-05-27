import java.util.*;

public class Arm {

    public static void main(String[] args) {

        Scanner d=new Scanner(System.in);
       int n =d.nextInt();
      int c=0,s=0;
        int  f=n;

        /*while(n!=0){                    //without function
       int r=n%10;
            n=n/10;
        
        c++;
    }
       // System.out.println(c);
           n=f;
            while(n!=0){
             int r=n%10;
               s=(int)(s+Math.pow(r,c));
            n=n/10;
      
            }  */
           // System.out.println(s);
         if(af(n)==f)
              System.out.println("armstrong");
             else
              System.out.println(" not armstrong");
             } 
    
    public static int af(int n)
    {
         int c=0,s=0;
        int  f=n;
        while(n!=0){
       int r=n%10;
            n=n/10;
        c++;
       }

           n=f;
            while(n!=0){
             int r=n%10;
               s=(int)(s+Math.pow(r,c));
            n=n/10;
      
            }
         return s;
    }
}

