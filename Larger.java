
import java.util.Scanner;


public class Larger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner d=new Scanner(System.in);
         int n1=d.nextInt();
        int n2=d.nextInt();
        int n3=d.nextInt();
         if( n1 >= n2 && n1 >= n3)
          System.out.println(n1+" is the largest Number");

      else if (n2 >= n1 && n2 >= n3)
          System.out.println(n2+" is the largest Number");

      else
          System.out.println(n3+" is the largest Number");
    }
    
}
