import java.util.*;
import java.lang.Math;
public class Squr {

    public static void main(String[] args) {
      Scanner d=new Scanner(System.in);
      int num=d.nextInt();
      int g=0;
     // double h=0.0;
      /*double temp;  
        double sqrtroot=num/2;  
        do   
        {  
            temp=sqrtroot;  
            sqrtroot=(temp+(num/temp))/2;  
        }   
        while((temp-sqrtroot)!= 0); 
        System.out.println(sqrtroot);
    */
     // double t=Math.pow(num, 0.5);
      //int j=(int)Math.round(t);
      //System.out.println(j);
        for(int i=1;i*i<=num;i++)
      {
          g=i;
      }
     
          System.out.println(g);
    }
}
