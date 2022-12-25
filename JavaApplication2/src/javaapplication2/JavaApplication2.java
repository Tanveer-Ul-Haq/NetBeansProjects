
package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        
        float a,b,c,d,e;
        Scanner i = new Scanner(System.in);
        
        System.out.println("ENTER NUMBER");
        a = i.nextFloat();
         System.out.println("ENTER NUMBER");
        b = i.nextFloat();
        
        if (a>b)
        {
           System.out.println("DIVISION OF NUMBERS ARE " + a/b);  
        }
        else
        {
            System.out.println("DIVISION OF NUMBERS ARE " + b/a);
        } 
        
        System.out.println("MULTIPLICATION OF NUMBERS ARE " + a*b);
        System.out.println("ADDITION OF NUMBERS ARE " + (a+b));
        
        if (a>b)
        {
            System.out.println("SUBTRACTION OF NUMBERS ARE " + (a-b));
        }    
        else
        {
            System.out.println("SUBTRACTION OF NUMBERS ARE " + (b-a));
        }    
        
    }
    
}
