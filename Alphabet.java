
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
public class Alphabet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner d=new Scanner(System.in);
       char c =d.next().charAt(0);
       
       if(c>=65&&c<=90||c>=97&&c<=122)
       {
         System.out.println("c");  
       }
       else
            System.out.println("n c");
    }
    
}
