/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostel_management_system;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
/**
 *
 * @author tanve
 */

public class Hostel_Booking_Form extends Frame implements ActionListener
{
    JPanel C_panel;
    JTextField tfname,tfmn,tfmail;
    JTextArea tfaddress,tfshow,resadd;
    JRadioButton male,female;
    JLabel title,name,mobile,gender,dob,address,res,condition,mail,password,hostel,room_no;   
    ButtonGroup bgroup;
    JComboBox date,month,year,hostel_box,room_box;
    JCheckBox term;
    JButton submit,reset,log_out;
    JPasswordField tfpass;
  //  int MONTH;

    protected String Hostel_names[] 
		= { "......Select......","MR 01", "MR 03", "ML 03", "ML 02", "ML 06", 
			"ML 05", "FL 06", "FL 07", "FL 02", "FR 06", 
			"FR 03" };
    protected String room[]
            = { "......Select......", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115"   
            };
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

	
     public Hostel_Booking_Form(){
     
    
         JFrame registeration = new JFrame ("Hostel Registration/Booking Form");
         registeration.setSize(1200, 730);

                 
        C_panel = new JPanel();
        //JScrollPane scroll = new JScrollPane(C_panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
       // scroll.setBounds(1200, 730,100, 30);
        //scroll.setSize(1200, 730);
       // scroll.setVisible(true);
     //   JScrollPane scroll = new JScrollPane(C_panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
     //   scroll.getVerticalScrollBar().setUnitIncrement(10);
      //  scroll.getHorizontalScrollBar().setUnitIncrement(10);
        C_panel.setPreferredSize(new Dimension(1200, 800));
      //  registeration.setContentPane(scroll);
        registeration.add(C_panel);
        Placement(C_panel);
        C_panel.setLayout(null);
        registeration.setResizable(false);
        registeration.setVisible(true);
        //JScrollPane scroll = new JScrollPane(C_panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
         registeration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
     
     public void Placement(JPanel C_panel)
     {
              
                title = new JLabel("Hostel Registration/Booking Form"); 
		title.setFont(new Font("Arial", Font.PLAIN, 30)); 
		title.setBounds(380, 30,450, 40); 
		C_panel.add(title); 
                

		name = new JLabel("Name"); 
		name.setFont(new Font("Arial", Font.PLAIN, 25)); 
		name.setBounds(100, 100,100, 30); 
		C_panel.add(name); 

		tfname = new JTextField(); 
		tfname.setFont(new Font("Arial", Font.PLAIN, 20)); 
		tfname.setBounds(250, 100,250, 30); 
		C_panel.add(tfname);

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
                
		gender = new JLabel("Gender"); 
		gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
		gender.setBounds(100, 310,100, 20); 
		C_panel.add(gender); 

		male = new JRadioButton("Male"); 
		male.setFont(new Font("Arial", Font.PLAIN, 15)); 
		male.setSelected(true); 
		male.setBounds(260, 310,75, 20); 
		C_panel.add(male); 

		female = new JRadioButton("Female"); 
		female.setFont(new Font("Arial", Font.PLAIN, 15)); 
		female.setSelected(false); 
		female.setBounds(350, 310,80, 20); 
		C_panel.add(female); 

		bgroup = new ButtonGroup(); 
		bgroup.add(male); 
		bgroup.add(female); 

		dob = new JLabel("DOB"); 
		dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
		dob.setBounds(100, 360,100, 20); 
		C_panel.add(dob); 

                date = new JComboBox(dates); 
		date.setFont(new Font("Arial", Font.PLAIN, 15)); 
		date.setBounds(260, 360,50, 20); 
		C_panel.add(date);  
                
	//	date = new JComboBox(dates); 
	//	date.setFont(new Font("Arial", Font.PLAIN, 15)); 
	//	date.setBounds(200, 250,50, 20); 
	//	C_panel.add(date); 

		month = new JComboBox(months); 
		month.setFont(new Font("Arial", Font.PLAIN, 15)); 
		month.setBounds(330, 360,60, 20); 
		C_panel.add(month); 

		year = new JComboBox(years); 
		year.setFont(new Font("Arial", Font.PLAIN, 15)); 
		year.setBounds(410, 360,60, 20); 
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
		term.setBounds(160,550,74, 20); 
		C_panel.add(term); 
                
                condition =new JLabel("terms and conditions"+".");
                condition.setFont(new Font("Arial", Font.PLAIN, 15));
                condition.setForeground(Color.red);
		condition.setBounds(235, 550,250, 20); 
		C_panel.add(condition);         


		submit = new JButton("Book"); 
		submit.setFont(new Font("Arial", Font.PLAIN, 20)); 
		submit.setBounds(150,600,100, 30); 
		submit.addActionListener(this); 
		C_panel.add(submit); 

		reset = new JButton("Reset"); 
		reset.setFont(new Font("Arial", Font.PLAIN, 20)); 
		reset.setBounds(270, 600,100, 30); 
		reset.addActionListener(this); 
		C_panel.add(reset);
                
                log_out = new JButton("Log Out"); 
		log_out.setFont(new Font("Arial", Font.BOLD, 20)); 
		log_out.setBounds(950, 30,120, 50); 
		log_out.addActionListener(this); 
		C_panel.add(log_out);

		tfshow = new JTextArea(); 
        	tfshow.setFont(new Font("Arial", Font.PLAIN, 20)); 
		tfshow.setBounds(650, 250,450, 400); 
		tfshow.setLineWrap(true); 
		tfshow.setEditable(false); 
		C_panel.add(tfshow); 
               // JScrollPane scroll = new JScrollPane(tfshow, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		res = new JLabel(""); 
		res.setFont(new Font("Arial", Font.PLAIN, 20)); 
		res.setBounds(100, 520,500, 25);  
		C_panel.add(res); 

	//	resadd = new JTextArea(); 
	//	resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
	//	resadd.setBounds(580, 175,200, 75); 
	//	resadd.setLineWrap(true); 
	//	C_panel.add(resadd); 
        
                hostel = new JLabel("Hostel"); 
		hostel.setFont(new Font("Arial", Font.PLAIN, 25)); 
		hostel.setBounds(600, 100,100, 30); 
		C_panel.add(hostel); 
                
                hostel_box = new JComboBox(Hostel_names); 
		hostel_box.setFont(new Font("Arial", Font.PLAIN, 15)); 
		hostel_box.setBounds(700, 105,250, 30); 
		C_panel.add(hostel_box);  
                
                room_no = new JLabel("Room"); 
		room_no.setFont(new Font("Arial", Font.PLAIN, 25)); 
		room_no.setBounds(600, 160,100, 30); 
		C_panel.add(room_no); 
                
                room_box = new JComboBox(room); 
                room_box.setSelectedIndex(0);
		room_box.setFont(new Font("Arial", Font.PLAIN, 15)); 
		room_box.setBounds(700, 165,250, 30); 
	        C_panel.add(room_box); 
                
               
     }
     
     public static void main(String args[]){
       // java.awt.EventQueue.invokeLater(new Runnable() {
       //     public void run() {
                new Hostel_Booking_Form();
        //    }
      //  });
     }

    public void actionPerformed(ActionEvent e) 
    { 
        if (e.getSource() == submit) { 
            if (term.isSelected()) { 
                String data1; 
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
                String data2 
                    = "DOB : "
                      + (String)date.getSelectedItem() 
                      + "/" + (String)month.getSelectedItem() 
                      + "/" + (String)year.getSelectedItem() 
                      + "\n"; 
  
                String data3 = "Address : " + tfaddress.getText() + "\n";
                String data4 = "E.mail  : " + tfmail.getText() + "\n";
                String data5 = "Password : " + tfpass.getName()+ "\n";
                String data6 = "Hostel : " + (String)hostel_box.getSelectedItem()+ "\n";
                String data7 = "Room No : " + (String)room_box.getSelectedItem();
                tfshow.setText(data + data1 + data2 + data3 + data4 + data5 + data6 + data7); 
                tfshow.setEditable(false); 
                
                if (hostel_box.getSelectedItem().equals("MR 01") || hostel_box.getSelectedItem().equals("MR 03") || hostel_box.getSelectedItem().equals("ML 03") || hostel_box.getSelectedItem().equals("ML 02")
                        || hostel_box.getSelectedItem().equals("ML 06") || hostel_box.getSelectedItem().equals("ML 05"))
                {
                    if(room_box.getSelectedItem().equals("102") || room_box.getSelectedItem().equals("104") || room_box.getSelectedItem().equals("106") || room_box.getSelectedItem().equals("108") || room_box.getSelectedItem().equals("110") || room_box.getSelectedItem().equals("112"))
                    {
             JOptionPane.showMessageDialog (null, "Room is Already Booked","Error", JOptionPane.ERROR_MESSAGE);
             System.exit(0);
                    }
                    else if(female.isSelected())
                    {
                        JOptionPane.showMessageDialog (null, "Female student can not book Hostel room in Male hostel","Error", JOptionPane.ERROR_MESSAGE);
                        System.exit(0);
                    }
                }
                else if (hostel_box.getSelectedItem().equals("FL 06") || hostel_box.getSelectedItem().equals("FL 07") || hostel_box.getSelectedItem().equals("FL 02") || hostel_box.getSelectedItem().equals("FR 06")
                        || hostel_box.getSelectedItem().equals("FR 03"))
                {
                    if(room_box.getSelectedItem().equals("101") || room_box.getSelectedItem().equals("104") || room_box.getSelectedItem().equals("105") || room_box.getSelectedItem().equals("107") || room_box.getSelectedItem().equals("111") || room_box.getSelectedItem().equals("114"))
                    {
                        JOptionPane.showMessageDialog (null, "Room is Already Booked","Error", JOptionPane.ERROR_MESSAGE);
                        System.exit(0);
                    }
                    else if(male.isSelected()) 
                    {
                        JOptionPane.showMessageDialog (null, "Male student can not book Hostel room in Female hostel","Error", JOptionPane.ERROR_MESSAGE);
                        System.exit(0);
                    }
                }
                
                
                    {
                       
           int response= JOptionPane.showConfirmDialog(this, "Do you want to know your mesho?", "Confirm",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(response==JOptionPane.YES_OPTION)
            {
                if (male.isSelected())
                {
                    if (room_box.getSelectedItem().equals("101"))  
                            {
                                JOptionPane.showMessageDialog(this, "Your mesho is Peter Betera", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                            }
                    else if (room_box.getSelectedItem().equals("103"))
                        {
                             JOptionPane.showMessageDialog(this, "Your mesho is Wongani Luhanga", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                        }
                         else if (room_box.getSelectedItem().equals("105"))
                        {
                             JOptionPane.showMessageDialog(this, "Your mesho is Wongani Gondwe", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                        }
                        else if (room_box.getSelectedItem().equals("107"))
                        {
                             JOptionPane.showMessageDialog(this, "Your mesho is Ezrone Mkandawire", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                        }
                         else if (room_box.getSelectedItem().equals("109"))
                        {
                             JOptionPane.showMessageDialog(this, "Your mesho is Misheck Nanguwo", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                        }
                         else if (room_box.getSelectedItem().equals("111"))
                        {
                             JOptionPane.showMessageDialog(this, "Your mesho is John Joseph", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                        }
                         else if (room_box.getSelectedItem().equals("113"))
                        {
                            JOptionPane.showMessageDialog(this, "Room is empty,  No mesho", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                        }
                        else if (room_box.getSelectedItem().equals("114"))
                        {
                            JOptionPane.showMessageDialog(this, "Room is empty,  No mesho", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                        }
                         else if (room_box.getSelectedItem().equals("115"))
                        {
                            JOptionPane.showMessageDialog(this, "Room is empty,  No mesho", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                        }
                
                }
                else if (female.isSelected())
                {
                      if (room_box.getSelectedItem().equals("102"))
                            {
                                JOptionPane.showMessageDialog(this, "Your mesho is Ruth Banda", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                            }
                         else if (room_box.getSelectedItem().equals("103"))
                        {
                             JOptionPane.showMessageDialog(this, "Your mesho is Catherine Chakhaza", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                        }
                         else if (room_box.getSelectedItem().equals("106"))
                        {
                             JOptionPane.showMessageDialog(this, "Your mesho is Faith Chizaka", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                        }
                         else if (room_box.getSelectedItem().equals("108"))
                        {
                             JOptionPane.showMessageDialog(this, "Your mesho is Martha Mkandawire", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                        }
                        else if (room_box.getSelectedItem().equals("109"))
                        {
                             JOptionPane.showMessageDialog(this, "Your mesho is Desire Nkhoma", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                        }
                        else if (room_box.getSelectedItem().equals("110"))
                        {
                             JOptionPane.showMessageDialog(this, "Your mesho is Lizzie kasambara", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                        }
                         else if (room_box.getSelectedItem().equals("112"))
                        {
                            JOptionPane.showMessageDialog(this, "Room is empty,  No mesho", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                        }
                         else if (room_box.getSelectedItem().equals("113"))
                        {
                            JOptionPane.showMessageDialog(this, "Room is empty,  No mesho", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                        }
                         else if (room_box.getSelectedItem().equals("115"))
                        {
                            JOptionPane.showMessageDialog(this, "Room is empty,  No mesho", 
                                          "Mesho", 
                                          JOptionPane.INFORMATION_MESSAGE);
                        }
                }    
                }
                    }
                 JOptionPane.showMessageDialog(this, "Registration Successfull", 
                                          "Registration Successfull", 
                                          JOptionPane.INFORMATION_MESSAGE);
                }
               
            else { 
                tfshow.setText(""); 
            //    resadd.setText(""); 
                res.setText("Please accept the"
                            + " terms & conditions.."); 
            } 
            } 
            
        
    
        else if(e.getSource() == reset) { 
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
          //  resadd.setText(empty);
            tfmail.setText(empty);
            tfpass.setText(empty);
            hostel_box.setSelectedIndex(0);
            room_box.setSelectedIndex(0);
        }
    
        
        if (e.getSource()== log_out)
        {
           // this.hide();
          //  this.dispose();
      //   new Hostel_Management_System();
         // this.setVisible(false);
          System.exit(0);
        }
    }
}
    

        
