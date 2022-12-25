
package javafirstlabtask2;

import javax.swing.*;

public class JavaFirstLabTask2 {

    public static void main(String[] args) {
       
        String a;
        a= JOptionPane.showInputDialog(" Enter 1 to compare strings  \n Enter 2 to perform Arithmetic operators \n Enter 3 to use compound operator and  \n Enter 4 to find prefix and postfix \n Enter 5 to Enter name");
        int x = Integer.parseInt(a);
        
        switch(x)
            
        {
            case 1:
            if(x==1)
        {
            String s1,s2;
            s1=JOptionPane.showInputDialog("Enter First name");
            s2=JOptionPane.showInputDialog("Enter Second name");
            
            if(s1.equals(s2))
        {
            JOptionPane.showMessageDialog(null,"STRINGS ARE EQUAL");  
        }    
            else
        {
            JOptionPane.showMessageDialog(null,"STRINGS ARE NOT EQUAL");    
        }        
        }
    }
    }
}
