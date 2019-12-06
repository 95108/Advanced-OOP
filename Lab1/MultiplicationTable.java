
package multiplicationtable;

import java.util.Scanner;

public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        
        int a=scan.nextInt();
        
        System.out.println("Enter range: ");
        
        int b = scan.nextInt();
        
        System.out.println("The mulitplication table of: "+a+" is:");
        
        for(int i=1; i<=b; i++){
            
            System.out.println(a+" x "+i+" = "+(a*i));
        }
        
    }
    
}
