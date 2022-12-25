// First Fit, Best Fit, Worst Fit for Memory Management
package javaapplication109;
import java.util.Scanner;

public class JavaApplication109 {

    public static void main(String[] args) {
        
        int a,b;
        Scanner i = new Scanner(System.in);
        
        System.out.println("Enter available memory in bytes:");
        a=i.nextInt();
        System.out.println("Enter memory in bytes to reserve:");
        b=i.nextInt();
        
        if(a<b)
        {
            System.out.println("This is Worst Fit");
        }
        if(a==b)
        {
            System.out.println("This is Best Fit");
        }
        if(a>b)
        {
            System.out.println("This is First Fit");
        }
    }
    
}
