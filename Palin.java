
import java.util.*;
public class Palin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner d=new Scanner(System.in);
        int n=d.nextInt();
        int f=n,s=0;
        while(n!=0){
            int r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(f==s)
            System.out.println("palindrome");
        else
             System.out.println("not a palindrome");
    }
    
}
