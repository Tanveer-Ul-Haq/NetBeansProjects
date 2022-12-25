
package javaapplication27;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.SwingConstants;
import java.util.*;
import java.text.*;

public class JavaApplication27 {

   
    public static void main(String[] args) {
        
        ClockLabel D = new ClockLabel("Date!");
        ClockLabel T = new ClockLabel ("Time!");
        ClockLabel DL = new ClockLabel ("Day!");
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame f = new JFrame("FA19-BCS-080");
        f.setSize(1000, 550);
        
        f.setLayout(new GridLayout(3,1));
        
        f.add(D);
        f.add(T);
        f.add(DL);
        
        f.getContentPane().setBackground(Color.green);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
}

class ClockLabel extends JLabel implements ActionListener
{
   String type;
   SimpleDateFormat sdf;
   
   public ClockLabel(String type)
   {
       setForeground(Color.BLACK);
       
       switch (type)
       {
           case "Date!" :
           
               sdf = new SimpleDateFormat("  MMMM dd yyyy");
               setFont(new Font("sans-serif", Font.BOLD,42));
               setHorizontalAlignment(SwingConstants.LEFT);
               break;
           
           case "Time!":
           
               sdf = new SimpleDateFormat("hh:mm:ss a");
               setFont(new Font("georgia", Font.PLAIN,160));
               setHorizontalAlignment(SwingConstants.CENTER);
               break;
           
           case "Day!":
           
            sdf = new SimpleDateFormat("EEEE  ");
            setFont(new Font("sans-serif", Font.BOLD,60));
            setHorizontalAlignment(SwingConstants.RIGHT);
            break;
           
           
          
       }
       Timer t1 = new Timer(1000, this);
           t1.start();
       
   

   }

  
    public void actionPerformed(ActionEvent e) {
        Date d=new Date();
        setText(sdf.format(d));

    }
    
}
