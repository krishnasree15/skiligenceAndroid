
import java.util.Scanner;


public class LCM {

    public static void main(String[] args) {
     Scanner d=new Scanner(System.in);
         int n1=d.nextInt();
        int n2=d.nextInt();
               int i,g=1;
        for(i=2;i<(n1*n2);i++)
        {
            if(n1%i==0&&n2%i==0)
            {
                g=i;

            }
        }
        System.out.println(g);

    }
    
}
