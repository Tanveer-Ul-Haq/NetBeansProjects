
package javaapplication45;
import javax.swing.*;
import java.util.Random;

public class JavaApplication45 {

    public static void main(String[] args) {
        
        // create instance of Random class 
        Random rand = new Random();
        String a,b,c;
        JFrame f = new JFrame("");
        
        a = JOptionPane.showInputDialog("Press 1 \n To show Random numbers in Integer \n Press 2 \n To show Random numbers in Float");
       int choice = Integer.parseInt(a);
       
        b = JOptionPane.showInputDialog("How much values you want to show?");
       int range = Integer.parseInt(b);
       
       if (choice == 1)
       {
            c = JOptionPane.showInputDialog("Enter the range for Integer values");
           int limit = Integer.parseInt(c);
           
           System.out.println("Random Integer Numbers :");
       
            for(int x=1;x<=range;x++)
           {
               int rand_int = rand.nextInt(limit);
               System.out.println(rand_int);
           }
       }
       
       else if (choice == 2)
       {
           System.out.println("Random Float Numbers : ");
           
           for(int y=1;y<=range;y++)
           {
               float rand_float = rand.nextFloat();
               System.out.println(rand_float);
           }
       }
       
       else
       {
           JOptionPane.showMessageDialog(f, "INVALID CHOICE", "MESSAGE",JOptionPane.ERROR_MESSAGE);
       }
       
    }
    
}
