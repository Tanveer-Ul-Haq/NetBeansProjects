
package javaapplication50;

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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.Border;
import oracle.net.aso.n;

public class JavaApplication50 extends Frame implements ActionListener
{
    JPanel C_panel;
    JTextField tfname,tfmn,tfmail;
    JTextArea tfaddress,tfshow,resadd;
    JRadioButton male,female,warden,student;
    JLabel title,name,mobile,gender,dob,address,res,condition,mail,password,sign_up,sign_in,onlabel,Sample_label,sign_in_state,ws_label;   
    ButtonGroup gen_group,ws_group;
    JComboBox date,month,year;
    JCheckBox term;
    JButton submit,reset;
    JPasswordField tfpass;
  //  int MONTH;

 //   protected String date30[] 
//		= { "1", "2", "3", "4", "5", 
//			"6", "7", "8", "9", "10", 
//			"11", "12", "13", "14", "15", 
//			"16", "17", "18", "19", "20", 
//			"21", "22", "23", "24", "25", 
//			"26", "27", "28", "29", "30" }; 
    protected String dates[] 
		= { "1", "2", "3", "4", "5", 
			"6", "7", "8", "9", "10", 
			"11", "12", "13", "14", "15", 
			"16", "17", "18", "19", "20", 
			"21", "22", "23", "24", "25", 
			"26", "27", "28", "29", "30", 
			"31" }; 
	protected String months[] 
		= { "Jan", "Feb", "Mar", "Apr", 
			"May", "Jun", "July", "Aug", 
			"Sup", "Oct", "Nov", "Dec" }; 
	protected String years[] 
		= { "1995", "1996", "1997", "1998", 
			"1999", "2000", "2001", "2002", 
			"2003", "2004", "2005", "2006", 
			"2007", "2008", "2009", "2010", 
			"2011", "2012", "2013", "2014", 
			"2015", "2016", "2017", "2018", 
			"2019", "2020", "2021", "2022",
                        "2023", "2024", "2025", "2026",
                        "2027", "2028", "2029", "2030"}; 

	
     public JavaApplication50(){
     
    
         JFrame registration = new JFrame ("Hostel Management System");
         registration.setSize(1200, 730);
         
         
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
                
                
                
                 
        C_panel = new JPanel();
        registration.add(C_panel);
        Placement(C_panel);
        C_panel.setLayout(null);
        registration.setResizable(true);
        registration.setVisible(true);
        
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
		title.setFont(new Font("Arial", Font.PLAIN, 30)); 
		title.setBounds(350, 30,550, 40); 
		C_panel.add(title); 
                
                sign_up = new JLabel("  Sign Up"); 
		sign_up.setFont(new Font("Times new roman", Font.PLAIN, 30));
                sign_up.setForeground(Color.red);
		sign_up.setBounds(230, 40,130, 40);
             //   Border sign_up_Border = BorderFactory.createMatteBorder(0,1,1,1,Color.yellow);
            //    sign_up.setBorder(sign_up_Border);
		C_panel.add(sign_up); 

		name = new JLabel("Name"); 
		name.setFont(new Font("Arial", Font.PLAIN, 25)); 
		name.setBounds(100, 100,100, 30); 
		C_panel.add(name); 

		tfname = new JTextField(); 
		tfname.setFont(new Font("Arial", Font.PLAIN, 20)); 
		tfname.setBounds(250, 100,250, 30); 
		C_panel.add(tfname);
                
          //      Sample_label = new JLabel("Name");
           //     Sample_label.setFont(new Font("Arial", Font.PLAIN, 20)); 
	//	Sample_label.setBounds(220, 100,250, 30);
              //  Sample_label.setEditable(false);
	//	tfname.add(Sample_label);

		mobile = new JLabel("Mobile"); 
		mobile.setFont(new Font("Arial", Font.PLAIN, 25)); 
		mobile.setBounds(100, 150,100, 30);  
		C_panel.add(mobile); 

		tfmn = new JTextField(); 
		tfmn.setFont(new Font("Arial", Font.PLAIN, 20)); 
		tfmn.setBounds(250, 150,250, 30); 
		C_panel.add(tfmn); 
                
                mail = new JLabel("E.mail"); 
		mail.setFont(new Font("Arial", Font.PLAIN, 25)); 
		mail.setBounds(100, 200,100, 30);  
		C_panel.add(mail); 

		tfmail = new JTextField(); 
		tfmail.setFont(new Font("Arial", Font.PLAIN, 20)); 
		tfmail.setBounds(250, 200,250, 30); 
		C_panel.add(tfmail);
                
                password = new JLabel("Password"); 
		password.setFont(new Font("Arial", Font.PLAIN, 25)); 
		password.setBounds(100, 250,150, 30);  
		C_panel.add(password); 

		tfpass = new JPasswordField(); 
		tfpass.setFont(new Font("Arial", Font.PLAIN, 20)); 
		tfpass.setBounds(250, 250,250, 30); 
		C_panel.add(tfpass); 
                
                ws_label = new JLabel("Register As"); 
		ws_label.setFont(new Font("Arial", Font.PLAIN, 20)); 
		ws_label.setBounds(100, 300,120, 25); 
		C_panel.add(ws_label); 

		warden = new JRadioButton("Warden"); 
		warden.setFont(new Font("Arial", Font.PLAIN, 15)); 
		warden.setSelected(true); 
		warden.setBounds(260, 300,90, 20); 
		C_panel.add(warden); 

		student = new JRadioButton("Student"); 
		student.setFont(new Font("Arial", Font.PLAIN, 15)); 
		student.setSelected(false); 
		student.setBounds(350, 300,80, 20); 
		C_panel.add(student); 

		ws_group = new ButtonGroup(); 
		ws_group.add(warden); 
		ws_group.add(student); 
                
		gender = new JLabel("Gender"); 
		gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
		gender.setBounds(100, 335,100, 20); 
		C_panel.add(gender); 

		male = new JRadioButton("Male"); 
		male.setFont(new Font("Arial", Font.PLAIN, 15)); 
		male.setSelected(true); 
		male.setBounds(260, 335,75, 20); 
		C_panel.add(male); 

		female = new JRadioButton("Female"); 
		female.setFont(new Font("Arial", Font.PLAIN, 15)); 
		female.setSelected(false); 
		female.setBounds(350, 335,80, 20); 
		C_panel.add(female); 

		gen_group = new ButtonGroup(); 
		gen_group.add(male); 
		gen_group.add(female); 

		dob = new JLabel("DOB"); 
		dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
		dob.setBounds(100, 380,100, 20); 
		C_panel.add(dob); 

                date = new JComboBox(dates); 
		date.setFont(new Font("Arial", Font.PLAIN, 15)); 
		date.setBounds(260, 380,50, 20); 
		C_panel.add(date);  
                
	//	date = new JComboBox(dates); 
	//	date.setFont(new Font("Arial", Font.PLAIN, 15)); 
	//	date.setBounds(200, 250,50, 20); 
	//	C_panel.add(date); 

		month = new JComboBox(months); 
		month.setFont(new Font("Arial", Font.PLAIN, 15)); 
		month.setBounds(330, 380,60, 20); 
		C_panel.add(month); 

		year = new JComboBox(years); 
		year.setFont(new Font("Arial", Font.PLAIN, 15)); 
		year.setBounds(410, 380,60, 20); 
		C_panel.add(year); 

		address = new JLabel("Address"); 
		address.setFont(new Font("Arial", Font.PLAIN, 20)); 
		address.setBounds(100, 420,100, 20); 
		C_panel.add(address); 

		tfaddress = new JTextArea(); 
		tfaddress.setFont(new Font("Arial", Font.PLAIN, 20)); 
		tfaddress.setBounds(250, 420,250, 100); 
		tfaddress.setLineWrap(true); 
		C_panel.add(tfaddress);
                
		term = new JCheckBox(" Accept"); 
		term.setFont(new Font("Arial", Font.PLAIN, 15)); 
		term.setBounds(160,530,74, 20); 
		C_panel.add(term); 
                
                condition =new JLabel("terms and conditions"+".");
                condition.setFont(new Font("Arial", Font.PLAIN, 15));
                condition.setForeground(Color.red);
		condition.setBounds(235, 530,250, 20); 
		C_panel.add(condition);         


		submit = new JButton("Sign Up"); 
		submit.setFont(new Font("Arial", Font.PLAIN, 20)); 
		submit.setBounds(150,580,120, 25); 
		submit.addActionListener(this); 
		C_panel.add(submit); 

		reset = new JButton("Reset"); 
		reset.setFont(new Font("Arial", Font.PLAIN, 20)); 
		reset.setBounds(290, 580,100, 25); 
		reset.addActionListener(this); 
		C_panel.add(reset); 

		tfshow = new JTextArea(); 
		tfshow.setFont(new Font("Arial", Font.PLAIN, 20)); 
		tfshow.setBounds(700, 100,450, 550); 
		tfshow.setLineWrap(true); 
		tfshow.setEditable(false); 
		C_panel.add(tfshow); 

		res = new JLabel(""); 
		res.setFont(new Font("Arial", Font.PLAIN, 20)); 
		res.setBounds(420, 540,500, 25);  
		C_panel.add(res); 

	//	resadd = new JTextArea(); 
	//	resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
	//	resadd.setBounds(580, 175,200, 75); 
	//	resadd.setLineWrap(true); 
	//	C_panel.add(resadd); 
                
                sign_in_state = new JLabel("Already a member"); 
		sign_in_state.setFont(new Font("times new roman", Font.PLAIN, 20)); 
		sign_in_state.setBounds(150, 620,200, 30); 
		C_panel.add(sign_in_state); 
                
                sign_in = new JLabel("Sign In"); 
		sign_in.setFont(new Font("Arial", Font.PLAIN, 20)); 
                sign_in.setForeground(Color.red);
		sign_in.setBounds(305, 620,100, 30); 
		C_panel.add(sign_in); 
		
     }
     
 /*    private void only_number(java.awt.event.KeyEvent evt)
     {
               char c = evt.getKeyChar();
               if(Character.isLetter(c))
               {
                   tfmn.setEditable(false);
                   onlabel.setText("Please Enter Numbers Only");
               }
               else
               {
                   tfmn.setEditable(true);
               }

     }
      */          

    public void actionPerformed(ActionEvent e) 
    { 
        if (e.getSource() == submit) { 
            if (term.isSelected()) { 
                String data1,data6; 
                String data 
                    = "Name : "
                      + tfname.getText() + "\n"
                      + "Mobile : "
                      + tfmn.getText() + "\n"; 
                if (male.isSelected()) 
                    data1 = "Gender : Male"
                            + "\n"; 
                else
                    data1 = "Gender : Female"
                            + "\n"; 
                
                if (warden.isSelected()) 
                    data6 = "Register as : Warden"
                            + "\n"; 
                else
                    data6 = "Register as : student"
                            + "\n"; 
                
                String data2 
                    = "DOB : "
                      + (String)date.getSelectedItem() 
                      + "/" + (String)month.getSelectedItem() 
                      + "/" + (String)year.getSelectedItem() 
                      + "\n"; 
  
                String data3 = "Address : " + tfaddress.getText() + "\n";
                String data4 = "E.mail  : " + tfmail.getText() + "\n";
                String data5 = "Password : " + tfpass.getName() + "\n";
                tfshow.setText(data + data1 + data2 + data3 + data4 + data5 + data6); 
                tfshow.setEditable(false); 
                res.setText("Registration Successfully.."); 
            } 
            else { 
                tfshow.setText(""); 
                resadd.setText(""); 
                res.setText("Please accept the"
                            + " terms & conditions.."); 
            } 
        } 
  
         if (e.getSource() == reset) { 
            String empty = ""; 
            tfname.setText(empty); 
            tfaddress.setText(empty); 
            tfmn.setText(empty); 
            res.setText(empty); 
            tfshow.setText(empty); 
            term.setSelected(false); 
            date.setSelectedIndex(0); 
            month.setSelectedIndex(0); 
            year.setSelectedIndex(0); 
            resadd.setText(empty);
            tfmail.setText(empty); 
            tfpass.setText(empty); 
        }
         
         if(e.getSource() == sign_in)
         {
           //  J_Panel;
         }
        
    } 
    

    public static void main(String[] args) {
        
         new JavaApplication50(); 
        Connection conn=null;
        try{
            
            String DriverName="oracle.jdbc.driver.OracleDriver";
            Class.forName(DriverName);
            String serverName="DESKTOP-BH3719K";
            String serverPort="1521";
            String url="jdbc:oracle:thin:@"+serverName+ ":" +serverPort+":";
            String username="system";
            String password="123";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established"); 
        }
        catch(Exception e)
        {
            System.out.println("Error occurs");
        }
        
        ////////////////////////////
        
          try{
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("Select * from abc");
            while(rs.next())
            {
                int no =rs.getInt(1);
                String name =rs.getString(2);
                
                System.out.println(""+no+ "  "+name);
                
            }}
            catch(Exception e)
                    {
                    System.out.println("   Error");
                    }
            
          try
          {
              
          }
          catch(Exception e)
                  {
                      
                  }
    }
    
    
}
