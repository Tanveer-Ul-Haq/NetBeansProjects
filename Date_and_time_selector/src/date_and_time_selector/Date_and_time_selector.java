
package date_and_time_selector;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;

public class Date_and_time_selector extends Frame implements ActionListener{

    
    public static void main(String[] args) {
        
        Date_and_time_selector obj = new Date_and_time_selector();
        
    }
        Date_and_time_selector(){
        JFrame f = new JFrame("Date and time");
        f.setSize(500, 550);
     //   f.setLayout(null);
     
     JPanel panel = new JPanel();
        f.add(panel);
        panel.setLayout(null);

        //f.getContentPane().setBackground(Color.black);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        
    //    JDateChooser DateChooser = new JDateChooser();
    //    DateChooser.setLocale(Locale.US);
    //    DateChooser.setbounds(40,40,40,40);
    //    DateChooser.setVisible(true);
      //  JDateChooser DateChooser = new JDateChooser();
   //     panel.add(DateChooser);
   //     SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
   //     String date = sdf.format(DateChooser.getDate());
        
        //JCalender j = new JCalendar();
    //    panel.add(new JCalendar());
        
        Date now = new Date();
      System.out.println("toString(): " + now);
      
      SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
      System.out.println("Format 1:   " + dateFormatter.format(now));
      JLabel label =new JLabel();
      label.setBounds(150, 40, 400, 40);
      panel.add(label);
      String date = dateFormatter.format(now);
      label.setText(date);
      label.setVisible(true);

      dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
      System.out.println("Format 2:   " + dateFormatter.format(now));
      
      dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
      System.out.println("Format 3:   " + dateFormatter.format(now));
      
    UtilDateModel model = new UtilDateModel();
JDatePanelImpl datePanel = new JDatePanelImpl(model);
JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);

    }    
      
     public void actionPerformed(ActionEvent e) {
         
     }
}
