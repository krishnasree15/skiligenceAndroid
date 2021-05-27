
import java.util.Scanner;
import java.lang.String;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guru Prasad
 */
public class Spalin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner d=new Scanner(System.in);
       String c =d.nextLine();
       int i,j;
       i=0;
       j=c.length()-1;
       while(i<j){
           if(c.charAt(i)!=c.charAt(j))
             System.out.println("np");
           
             i++;
             j--;
             
           }
        
           System.out.println("p"); 
           //}
       
    }
    
}
