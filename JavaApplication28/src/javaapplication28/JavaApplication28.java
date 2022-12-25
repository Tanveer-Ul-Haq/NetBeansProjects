
package javaapplication28;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class JavaApplication28 {

    
    public static void main(String[] args) {
       
        ClockLabel dateLable = new ClockLabel("date");
        ClockLabel timeLabel = new ClockLabel("time");
        ClockLabel dayLabel = new ClockLabel("day");
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame f = new JFrame("Digital Clock");
        f.setSize(1000, 550);
        f.setLayout(new GridLayout(3, 1));

        f.add(dateLable);
        f.add(timeLabel);
        f.add(dayLabel);
        f.getContentPane().setBackground(Color.black);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

}

class ClockLabel extends JLabel implements ActionListener {

    String Type;
    SimpleDateFormat sdf;

    public ClockLabel(String Type) {
        setForeground(Color.green);
        switch (Type) {
            case "date":
                sdf = new SimpleDateFormat("  MMMM dd yyyy");
                setFont(new Font("sans-serif", Font.ITALIC, 42));
                setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case "time":
                sdf = new SimpleDateFormat("hh:mm:ss a");
                setFont(new Font("georgia", Font.PLAIN, 160));
                setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "day":
                sdf = new SimpleDateFormat("EEEE  ");
                setFont(new Font("arial", Font.BOLD, 60));
                setHorizontalAlignment(SwingConstants.RIGHT);
                break;

        }
        Timer t=new Timer(1000,this);
        t.start();

    }
public void actionPerformed(ActionEvent ae){
Date d=new Date();
setText(sdf.format(d));
    }
    
}
