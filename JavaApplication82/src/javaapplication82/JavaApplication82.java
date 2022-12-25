
package javaapplication82;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaApplication82 {

    public static void main(String[] args) {
        
        JTextField stname,stmarks;
        JLabel name,marks;
        JPanel C_panel;
        
        JFrame Spring2021;
        Spring2021 = new JFrame("Spring2021");
         Spring2021.setSize(1200, 730);
         
         C_panel = new JPanel();
        Spring2021.add(C_panel);
        C_panel.setLayout(null);
         Spring2021.setResizable(true);
        Spring2021.setVisible(true);
        
        Spring2021.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
                name = new JLabel("Student Name"); 
		name.setFont(new Font("Arial", Font.PLAIN, 25)); 
		name.setBounds(100, 100,250, 30); 
		C_panel.add(name); 

		stname = new JTextField(); 
		stname.setFont(new Font("Arial", Font.PLAIN, 20)); 
		stname.setBounds(300, 100,250, 30); 
		C_panel.add(stname);

		marks = new JLabel("Marks"); 
		marks.setFont(new Font("Arial", Font.PLAIN, 25)); 
		marks.setBounds(100, 150,250, 30);  
		C_panel.add(marks); 

		stmarks = new JTextField(); 
		stmarks.setFont(new Font("Arial", Font.PLAIN, 20)); 
		stmarks.setBounds(300, 150,250, 30); 
		C_panel.add(stmarks); 
    }
    
}
