
package javaapplication26;


import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JavaApplication26 extends Frame implements ActionListener{

    JTextField userText,passwordText;
    
    public static void main(String[] args) {
        
       new JavaApplication26();
    }


    public JavaApplication26(){
        JFrame login = new JFrame("LOGIN PAGE");
       
        login.setSize(350, 200);
        
        JPanel panel = new JPanel();    
        login.add(panel);
        placements(panel);
        login.setVisible(true);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setResizable(false);
    }

   public void Welcome ()
    {
         JFrame Welcome = new JFrame("Welcome Page");
       
        Welcome.setSize(800, 800);
        
        JPanel C_panel = new JPanel();    
        Welcome.add(C_panel);
      //  JLabel WelcomeLabel = new JLabel("Welcome");
      //  WelcomeLabel.setFont(new Font("Arial" ,Font.BOLD, 72 ));
     //   WelcomeLabel.setBounds(10,20,80,25);
     //   C_panel.add(WelcomeLabel);
        C_panel.setLayout(null);
        Welcome.setVisible(true);
        Welcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Welcome.setResizable(false);
    }
    
   
     public void placements(JPanel panel) {

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JButton loginButton = new JButton("login");
         loginButton.setFont(new Font("Arial" ,Font.BOLD, 16 ));
         loginButton.addActionListener(this);
        loginButton.setBounds(120, 100, 80, 25);
        panel.add(loginButton);
        
    }

  public void actionPerformed(ActionEvent e)
  {
       String input = (String) e.getActionCommand();
       
        String username=userText.getText();  
        String password=passwordText.getText(); 
        
    //    if(username.equals(username) && password.equals(password))
    //    {
    
    
     try
                        {
                             if (input.equals("login"))
                             {
                                 
                                 throw new ArithmeticException("");
			            
                                 
	                     } 
                             
                                 
                        }
                        catch (ArithmeticException g)
                                {
                                  JOptionPane.showMessageDialog(null, "Enter Values with Addition Symbols");
                                  
                                     Welcome();
                                     
    
    
   //   if (input.equals("login"))
   //   {
          Welcome();
      }
  }
//  }
}