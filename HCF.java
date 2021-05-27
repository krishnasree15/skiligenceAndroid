
import java.util.Scanner;
public class HCF {
 public static void main(String[] args) {
       
         Scanner d=new Scanner(System.in);
         int n1=d.nextInt();
        int n2=d.nextInt();
        /*int h=n2%n1;
        while(h!=0){
            n1=h;
            n2=n1;
            h=n2%n1;
        }*/
        int i,g=1;
        for(i=2;i<(n1+n2)/2;i++)
        {
            if(n1%i==0&&n2%i==0)
            {
                g=i;
                break;
            }
        }
        System.out.println(g);
       
    }
    }
