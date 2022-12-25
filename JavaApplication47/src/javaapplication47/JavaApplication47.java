
package javaapplication47;
import java.io.*;
import javax.swing.*;
import java.util.Scanner;

public class JavaApplication47 {

    public static void main(String[] args) {
        Scanner i=new Scanner(System.in); 
        String a=JOptionPane.showInputDialog("What do you want to do\n*1.Write in the file\n*2.Read in the file");
        int choice=Integer.parseInt(a); 
        switch(choice)
        {
            case 1:
            {
                try
                {
                    FileWriter fw=new FileWriter("E:\\usmn.txt");
                    String pad = JOptionPane.showInputDialog("What Do you want to write");
                    fw.write(pad);
                    fw.close();
                    System.out.println("Success");
                                       
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                break;
            }
            case 2:
            {
                try
                {
                FileReader filereadObj=new FileReader("E:\\usmn.txt");
                int iterator;    
                while((iterator=filereadObj.read())!=-1)    
                System.out.print((char)iterator);    
                filereadObj.close();
                }
                catch(Exception e)
                {
                System.out.println(e);
                }
                break;
            }
        }
    }
    
}
