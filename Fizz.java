/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guru Prasad
 */
import java.util.*;
public class Fizz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        if(n%3==0&n%5==0)
            System.out.println("FizzBuzz");
        else if (n%3==0)
            System.out.println("Fizz");
        else if(n%5==0)
         System.out.println("Buzz");
            else
            System.out.println(n);
        // TODO code application logic here
    }
    
}
