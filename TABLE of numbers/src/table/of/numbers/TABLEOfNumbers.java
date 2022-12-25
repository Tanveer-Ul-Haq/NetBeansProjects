
package table.of.numbers;
import java.util.Scanner;
import javax.swing.*;

public class TABLEOfNumbers {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String b;
        b=JOptionPane.showInputDialog(null,"ENTER NUMBER TO WRITE TABLE");
         int x=Integer.parseInt(b);
        b=JOptionPane.showInputDialog(null,"ENTER RANGE OF TABLE");
         int y=Integer.parseInt(b);
         for(int a=1;a<=y;a++)
         {
             System.out.println(x+" * "+a+" = "+(x*a));
         }    
    }
    
}
