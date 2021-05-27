import java.util.*;
public class Swap{

    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner d=new Scanner(System.in);
        System.out.println("Enter 2 numbers for swapping");
        a=d.nextInt();
        int f=d.nextInt();
        a=a+f;
        f=a-f;
        a=a-f;
       System.out.println(a+" "+f);

    }
    
}