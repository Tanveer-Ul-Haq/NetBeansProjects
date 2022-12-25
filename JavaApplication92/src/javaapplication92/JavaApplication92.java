
package javaapplication92;
import java.util.Scanner;

public class JavaApplication92 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner i = new Scanner(System.in);
        int pid;
       
        System.out.println("Enter a Value:");
        pid= i.nextInt();
        
        if(pid==1)
        {
            System.out.println("Child created");
          
        }
        else if(pid == 0)
        {
            System.out.println("Null");
            System.exit(0);
        }
        else
        {
           
        }
    }

   
}
