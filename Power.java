
import java.util.Scanner;


public class Power {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner d=new Scanner(System.in);
         int n1=d.nextInt();
        int n2=d.nextInt();
        int g=1;
        while(n2!=0){
            g=g*n1;
        n2--;
        }
        System.out.println(g);
    }
    
}
