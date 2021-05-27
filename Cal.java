import java.util.*;
public class Cal {
      public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner d=new Scanner(System.in);
        System.out.println("enter the 2 values");
         int a=d.nextInt();
        int f=d.nextInt();
        System.out.println("Enter the operator");
         char c=d.next().charAt(0);
          if(c=='+')
           System.out.println(a+f);
           else if(c=='-')
           System.out.println(a-f);
           else if(c=='*')
           System.out.println(a*f);
           else if(c=='/')
           System.out.println(a/f);
           else if(c=='%')
           System.out.println(a%f);
           else
           System.out.println("invalid operator");
    }
    
}
