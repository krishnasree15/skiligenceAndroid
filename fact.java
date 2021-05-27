
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guru Prasad
 */
public class fact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner d=new Scanner(System.in);
       int n =d.nextInt();
       int n1 =d.nextInt();
       int h=n-n1;
       int g=factorial(n);
       int k=factorial(n1);
       int k2=factorial(h);
       System.out.println(g/(k*k2));
    }
    static int factorial(int m){    
  if (m == 0)    
    return 1;    
  else    
    return(m * factorial(m-1));    
 }    
    
}
