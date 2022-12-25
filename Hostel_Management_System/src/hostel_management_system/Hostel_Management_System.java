
package hostel_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.awt.Font;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.Border;


public class Hostel_Management_System extends Frame implements ActionListener
{
    JPanel C_panel;
    JTextField tfname,tfmail;
    JLabel title,name,mail,password,sign_up,sign_in,ws_label,not_have_account;   
    JButton sign;
    JPasswordField tfpass;
  
     public Hostel_Management_System(){
     
    
         JFrame registration = new JFrame ("Hostel Management System");
         registration.setSize(385, 390);
     /*    
          JMenuBar mb = new JMenuBar();
                JMenu mhm = new JMenu("Home");
                mb.add(mhm);
                JMenu mu = new JMenu("User");
                mb.add(mu);
                JMenu mh = new JMenu("Hostel");
                mb.add(mh);
                JMenu mr = new JMenu("Room");
                mb.add(mr);
                JMenu wn = new JMenu("Warden");
                mb.add(wn);
                JMenu ar = new JMenu("Alloted Room");
                mb.add(ar);
                JMenu pl = new JMenu("Payment List");
                mb.add(pl);
                JMenu view = new JMenu("view");
                mb.add(view);
                
                JMenu sbmu = new JMenu("Sub Menu");
                JMenuItem i1 = new JMenuItem("A");
                JMenuItem i2 = new JMenuItem("B");
                JMenuItem i3 = new JMenuItem("C");
                mu.add(i1);
                mu.add(i2);
                mu.add(sbmu);
                sbmu.add(i3);
                registration.setJMenuBar(mb);
            */    
              
        C_panel = new JPanel();
        registration.add(C_panel);
        Placement(C_panel);
        C_panel.setLayout(null);
        registration.setResizable(true);
        registration.setVisible(true);
        registration.setLocationRelativeTo(null);
        
       JPanel J_panel = new JPanel();
        registration.add(J_panel);
     //   Placement(C_panel);
        J_panel.setLayout(null);
        
     //   JScrollPane sp = new JScrollPane(registration, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
     //   sp.setBounds(100,100, 50,100); 
     //   registration.add(sp);
        
        
         registration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         
     }
     
     public void Placement(JPanel C_panel)
     {
              
                title = new JLabel("Welcome to Hostel Managment System"); 
		title.setFont(new Font("Arial", Font.PLAIN, 14)); 
		title.setBounds(60, 10,300, 30); 
		C_panel.add(title); 
                
                sign_in = new JLabel("  Sign in"); 
		sign_in.setFont(new Font("Times new roman", Font.BOLD, 20));
                sign_in.setForeground(Color.black);
		sign_in.setBounds(150, 30,120, 35);
           //     Border sign_up_Border = BorderFactory.createMatteBorder(0,1,1,1,Color.yellow);
            //    sign_up.setBorder(sign_up_Border);
		C_panel.add(sign_in); 

/*		name = new JLabel("Name"); 
		name.setFont(new Font("Arial", Font.PLAIN, 25)); 
		name.setBounds(100, 100,100, 30); 
		C_panel.add(name); 

		tfname = new JTextField(); 
		tfname.setFont(new Font("Arial", Font.PLAIN, 20)); 
		tfname.setBounds(50, 100,250, 30); 
		C_panel.add(tfname);
    */            
         
                mail = new JLabel("E.mail"); 
		mail.setFont(new Font("Arial", Font.PLAIN, 25)); 
		mail.setBounds(150, 70,150, 30);  
		C_panel.add(mail); 

		tfmail = new JTextField(); 
		tfmail.setFont(new Font("Arial", Font.PLAIN, 22));
               // tfmail.setForeground(new Color(153,153,153));
               // tfmail.setFocusable(true);
            //    tfmail.setRadius=22;
               // tfmail.setFocusable(true);
              //  tfmail.setRequestFocusEnabled(true);
                //tfmail.addFocusListener(this);
                
		tfmail.setBounds(60, 100,250, 40); 
		C_panel.add(tfmail);
                
                password = new JLabel("Password"); 
		password.setFont(new Font("Arial", Font.PLAIN, 25)); 
		password.setBounds(130, 150,150, 30);  
		C_panel.add(password); 

		tfpass = new JPasswordField(); 
		tfpass.setFont(new Font("Arial", Font.PLAIN, 22)); 
		tfpass.setBounds(60, 190,250, 40); 
		C_panel.add(tfpass); 
                
    /*            ws_label = new JLabel("Register As"); 
		ws_label.setFont(new Font("Arial", Font.PLAIN, 20)); 
		ws_label.setBounds(100, 300,120, 25); 
		C_panel.add(ws_label); 
*/
                sign = new JButton("Sign In"); 
		sign.setFont(new Font("Arial", Font.PLAIN, 20)); 
                sign.setForeground(Color.red);
		sign.setBounds(130, 250,100, 40);
                sign.addActionListener(this);
		C_panel.add(sign); 
		
                not_have_account = new JLabel("Do not have an account"); 
		not_have_account.setFont(new Font("times new roman", Font.PLAIN, 18)); 
		not_have_account.setBounds(70, 290,210, 40); 
		C_panel.add(not_have_account); 
                
                sign_up = new JLabel("Sign Up"); 
		sign_up.setFont(new Font("Times new roman", Font.PLAIN, 18));
                sign_up.setForeground(Color.black);
		sign_up.setBounds(245, 290,100, 35);
		C_panel.add(sign_up); 
                
               
     }
     
    
    public void actionPerformed(ActionEvent e) 
    { 
      //   while (e.getSource(tfmail.addFocusListener()))
       //  if(tfmail.getText().equals("Enter E-mail"))
      //   {
       //     tfmail.setText("");
       //     tfmail.setForeground(Color.BLACK);
       //     tfmail.setFocusable(false);
       //     tfmail.addFocusListener(focusGained);
       //  }
        if (e.getSource() == sign)
        {
             if (tfmail.getText().equals("Ezrone") && tfpass.getText().equals("123") || tfmail.getText().equals("Martha") && tfpass.getText().equals("1234"))
        {
             this.setVisible(false);
          //  this.hide();
          //  this.dispose();
                    new Hostel_Booking_Form();
        }
         else
         {
             tfmail.setText("");
             tfpass.setText("");
             JOptionPane.showMessageDialog (null, "Invalid Email or Password","Invalid Entry", JOptionPane.ERROR_MESSAGE);
         }
        }    
        
    } 


    public static void main(String[] args) {
        
         new Hostel_Management_System(); 
        
    }

    
}


