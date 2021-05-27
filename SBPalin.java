
import java.util.Scanner;

public class SBPalin {

    public static void main(String[] args) {
	
	           Scanner d=new Scanner(System.in);
       String c =d.nextLine();

       StringBuilder sb=new StringBuilder(c);  
         sb.reverse();  
       String rev=sb.toString();  
    if(c.equals(rev))
      
    {
         System.out.println("p");
        }
    else
        System.out.println("n p");
    

	}
}

