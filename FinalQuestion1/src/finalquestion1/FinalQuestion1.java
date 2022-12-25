
package finalquestion1;
import javax.swing.*;
import java.util.Scanner;
public class FinalQuestion1 {

    public static void main(String[] args) {
        String x;
        x=JOptionPane.showInputDialog(null,"ENTER NUMBER TO DRAW PATTERN");
        int y=Integer.parseInt(x);
        x=JOptionPane.showInputDialog(null,"ENTER NUMBER TO DRAW PATTERN");
        int z=Integer.parseInt(x);
        
        for (int a=1;a<=y;a++)
        {
            for(int b=1;b<=z;b++)
            {
                if(a==1 && b==1 || a==1 && b==2 || a==1 && b==3 || a==1 && b==4 || a==1 && b==5)
                {
                    System.out.println("*");
                }
                else
                {
                    System.out.println(" ");
                }    
            }
            System.out.println("\n");
        }
    }
    
}
