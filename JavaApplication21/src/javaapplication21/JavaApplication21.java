

package javaapplication21;
import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JFrame;
//import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
//import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.util.Arrays;
//import java.util.Scanner;


public class JavaApplication21 extends Frame implements ActionListener {

     JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonpoint,buttonmean,buttonadd,buttonsub,buttonmul,buttondiv,buttonequals,buttonreset;
     JTextField J_Text;
     JRadioButton buttonon,buttonoff;
     ButtonGroup buttononoff;
     String s1,s2;
     double b,c,sum;
     JPanel C_panel,J_panel;
     //int x;
     
     
     protected final String[] str = "0 1 2 3 4 5 6 7 8 9".split(" ");
     
     protected double curValue;
     protected String oper = "=";
     protected boolean isStart= true;
     
     
     
    public static void main(String[] args) {
        
           
        
        new JavaApplication21();
        
    }
    
    
  /*  public JavaApplication21()
    {
        panel();
        buttonon.setEnabled(false); 
    }
    
    */
	
     public JavaApplication21(){
     
   
    
           JFrame Calculator = new JFrame ("FA19-BCS-080, TANVEER UL HAQ");
         Calculator.setSize(735,480);

                 
         C_panel = new JPanel();
        Calculator.add(C_panel);
        Placement(C_panel);
       
        //Calculator.setLayout(null);
       Calculator.setResizable(false);
        Calculator.setVisible(true);
   
       
        
         Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         buttonon.setEnabled(false); 
        
     }
     
        public void Placement(JPanel C_panel)
        {      
           C_panel.setLayout(null);
          
           //C_panel.setResizable(true);
          // C_panel.setVisible(true);
           
              J_Text = new JTextField(50);
       J_Text.setBounds(10, 20, 710, 60);
       
       C_panel.add(J_Text);
       
        
        button1 = new JButton("1");
        button1.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button1.addActionListener(this);
       button1.setBounds(10,310,170,60);
       C_panel.add(button1);
       
      
        
        button2 = new JButton("2");
        button2.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button2.addActionListener(this);
       button2.setBounds(190,310,170,60);
       C_panel.add(button2);
       
        button3 = new JButton("3");
        button3.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button3.addActionListener(this);
       button3.setBounds(370,310,170,60);
       C_panel.add(button3);
       
        button4 = new JButton("4");
        button4.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button4.addActionListener(this);
       button4.setBounds(10,240,170,60);
       C_panel.add(button4);
       
        button5 = new JButton("5");
        button5.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button5.addActionListener(this);
       button5.setBounds(190,240,170,60);
       C_panel.add(button5);
       
        button6 = new JButton("6");
        button6.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button6.addActionListener(this);
       button6.setBounds(370,240,170,60);
       C_panel.add(button6);
       
        button7 = new JButton("7");
        button7.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button7.addActionListener(this);
       button7.setBounds(10,170,170,60);
       C_panel.add(button7);
       
        button8 = new JButton("8");
        button8.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button8.addActionListener(this);
       button8.setBounds(190,170,170,60);
       C_panel.add(button8);
       
        button9 = new JButton("9");
        button9.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button9.addActionListener(this);
       button9.setBounds(370,170,170,60);
       C_panel.add(button9);
       
        button0 = new JButton("0");
        button0.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button0.addActionListener(this);
       button0.setBounds(190,380,170,60);
       C_panel.add(button0);
       
        buttonpoint = new JButton(".");
        buttonpoint.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonpoint.addActionListener(this);
       buttonpoint.setBounds(10,380,170,60);
       C_panel.add(buttonpoint);
       
    //    buttonmean = new JButton("Mean");
    //    buttonmean.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
   //     buttonmean.addActionListener(this);
   //    buttonmean.setBounds(370,100,170,60);
    //   C_panel.add(buttonmean);
       
        buttonadd = new JButton("+");
        buttonadd.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonadd.addActionListener(this);
       buttonadd.setBounds(550,310,170,60);
       C_panel.add(buttonadd);
       
        buttonsub = new JButton("-");
        buttonsub.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonsub.addActionListener(this);
       buttonsub.setBounds(550,240,170,60);
       C_panel.add(buttonsub);
       
        buttonmul = new JButton("*");
        buttonmul.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonmul.addActionListener(this);
       buttonmul.setBounds(550,170,170,60);
       C_panel.add(buttonmul);
       
        buttondiv = new JButton("/");
        buttondiv.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttondiv.addActionListener(this);
       buttondiv.setBounds(550,100,170,60);
       C_panel.add(buttondiv);
       
        buttonequals = new JButton("=");
        buttonequals.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonequals.addActionListener(this);
       buttonequals.setBounds(370,380,350,60);
       C_panel.add(buttonequals);
       
        buttonreset = new JButton("C");
        buttonreset.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonreset.addActionListener(this);
       buttonreset.setBounds(190,100,170,60);
       C_panel.add(buttonreset);
       
        buttonon = new JRadioButton("ON" , true);
        buttonon.setFont(new Font("Tahoma" ,Font.BOLD, 18 ));
        buttonon.addActionListener(this);
        buttonon.setBounds (10,100,60,30);
       C_panel.add(buttonon);
       
        buttonoff = new JRadioButton("OFF" , false);
        buttonoff.setFont(new Font("Tahoma" ,Font.BOLD, 18 ));
        buttonoff.addActionListener(this);
       buttonoff.setBounds (10,130,60,30);
       C_panel.add(buttonoff);
       
       buttononoff = new ButtonGroup();

     buttononoff.add(buttonon);
      buttononoff.add(buttonoff);
       
      }
                
   /*    
         public void Place(JPanel J_panel)
        {      
           J_panel.setLayout(null);
          
           //C_panel.setResizable(true);
          // C_panel.setVisible(true);
           
              J_Text = new JTextField(50);
       J_Text.setBounds(10, 20, 530, 60);
       
       J_panel.add(J_Text);
       
        
        button1 = new JButton("1");
        button1.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button1.addActionListener(this);
       button1.setBounds(10,310,170,60);
       J_panel.add(button1);
       
      
        
        button2 = new JButton("2");
        button2.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button2.addActionListener(this);
       button2.setBounds(190,310,170,60);
       J_panel.add(button2);
       
        button3 = new JButton("3");
        button3.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button3.addActionListener(this);
       button3.setBounds(370,310,170,60);
       J_panel.add(button3);
       
        button4 = new JButton("4");
        button4.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button4.addActionListener(this);
       button4.setBounds(10,240,170,60);
       J_panel.add(button4);
       
        button5 = new JButton("5");
        button5.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button5.addActionListener(this);
       button5.setBounds(190,240,170,60);
       J_panel.add(button5);
       
        button6 = new JButton("6");
        button6.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button6.addActionListener(this);
       button6.setBounds(370,240,170,60);
       J_panel.add(button6);
       
        button7 = new JButton("7");
        button7.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button7.addActionListener(this);
       button7.setBounds(10,170,170,60);
       J_panel.add(button7);
       
        button8 = new JButton("8");
        button8.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button8.addActionListener(this);
       button8.setBounds(190,170,170,60);
       J_panel.add(button8);
       
        button9 = new JButton("9");
        button9.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button9.addActionListener(this);
       button9.setBounds(370,170,170,60);
       J_panel.add(button9);
       
        button0 = new JButton("0");
        button0.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button0.addActionListener(this);
       button0.setBounds(190,380,170,60);
       J_panel.add(button0);
       
        buttonpoint = new JButton(".");
        buttonpoint.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonpoint.addActionListener(this);
       buttonpoint.setBounds(10,380,170,60);
       J_panel.add(buttonpoint);
       
       
        buttonadd = new JButton("+");
        buttonadd.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonadd.addActionListener(this);
       buttonadd.setBounds(370,100,170,60);
       J_panel.add(buttonadd);
       
   //     buttondiv = new JButton("/");
    //    buttondiv.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
    //    buttondiv.addActionListener(this);
   //    buttondiv.setBounds(550,100,170,60);
    //   J_panel.add(buttondiv);
       
        buttonequals = new JButton("=");
        buttonequals.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonequals.addActionListener(this);
       buttonequals.setBounds(370,380,170,60);
       J_panel.add(buttonequals);
       
        buttonreset = new JButton("C");
        buttonreset.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonreset.addActionListener(this);
       buttonreset.setBounds(190,100,170,60);
       J_panel.add(buttonreset);
       
        buttonon = new JRadioButton("ON" , true);
        buttonon.setFont(new Font("Tahoma" ,Font.BOLD, 18 ));
        buttonon.addActionListener(this);
        buttonon.setBounds (10,100,60,30);
       J_panel.add(buttonon);
       
        buttonoff = new JRadioButton("OFF" , false);
        buttonoff.setFont(new Font("Tahoma" ,Font.BOLD, 18 ));
        buttonoff.addActionListener(this);
       buttonoff.setBounds (10,130,60,30);
       J_panel.add(buttonoff);
       
       buttononoff = new ButtonGroup();

     buttononoff.add(buttonon);
      buttononoff.add(buttonoff);
       
      }
                
       */ 
         
        public void computeOper(double d) {
		if (oper.equals("+"))
			curValue += d;
		else if (oper.equals("-"))
			curValue -= d;
		else if (oper.equals("*"))
			curValue *= d;
		else if (oper.equals("/"))
                      //    curValue /= d;
                {
                 try
                                {
                                     curValue /= d;
                                     if (oper.equals("/") && J_Text.getText().equals("0"))
                                     {
                                    throw new ArithmeticException("");
                                     }     }
                                catch(ArithmeticException g)
                                {
                            
                                    JOptionPane.showMessageDialog(null, "You Entered Zero"); 
                                     
                                }
                }
                
                
                
		else if (oper.equals("="))
			curValue = d;
		
	//	else
	//		System.err.println("Non-existence Operator Error");
		J_Text.setText(String.format("%.5f", curValue));
		
	}

    /*    
        public void meanoper(double a){
           
             for (int x=1;x>=1;x++)
             {
            if (oper.equals("+"))
			curValue += c; 
                       a=c/x;      }
             if (oper.equals("="))
			curValue = a;
            else
			System.err.println("Non-existence Operator Error");
		J_Text.setText(String.format("%.5f", curValue));
        
        }
       
        public void mean (){
            
             JFrame calcu = new JFrame ("MEAN CALCULATOR");
         calcu.setSize(555,480);

                 
         J_panel = new JPanel();
          calcu.add(J_panel);
            Place(J_panel);
            //   if (oper.equals("mean"))
             //       curValue +=b;
               
             calcu.setResizable(false);
        calcu.setVisible(true);
        
        //  calcu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
           buttonon.setEnabled(false); 
        }
                        
        */                
        
    
    public void actionPerformed(ActionEvent e)
    {
        
         
        
        String input = (String) e.getActionCommand();
	 J_Text.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));	
		//when the input is a dot (.)
		if(input.equals(".")){
			if(!J_Text.getText().contains(".")){
				if(isStart){
					J_Text.setText("0.");
					isStart=false;
				}else{
					J_Text.setText(J_Text.getText()+".");
				}
			}
			
		} 
			//when the input is 0~9
		 else if(Arrays.binarySearch(str, input)>=0){
			if(isStart){
				J_Text.setText(input);
			} else{
				J_Text.setText(J_Text.getText()+ input);
			}
			isStart = false;
		
			
		} 
		 
                 
                 
			//when the input is operator
                        else {
			if (isStart){
				if (input.equals("-") && J_Text.equals("")) {
					J_Text.setText(input);
					isStart = false;
				} else
					oper = input;
			}
                       
                        
                     
                        else {
				computeOper(Double.parseDouble(J_Text.getText()));
				oper = input;
				isStart = true;
                               
		
		
                        }
                 }
                 
                
                
       /*         
       
         // When Press Mean Button
               
                        {
                        try
                        {
                             if (input.equals("Mean"))
                             {
                                 
                                 throw new ArithmeticException("");
			            
                                 
	                     } 
                             
                                 
                        }
                        catch (ArithmeticException g)
                                {
                                  JOptionPane.showMessageDialog(null, "Enter Values with Addition Symbols");
                                  
                                     mean();
                                     
                      
                     
                                     
        
            //     if (isStart){
		//		if (input.equals("+") && J_Text.equals("")) {
		//			J_Text.setText(input);
		//			isStart = false;
		//		} else
		//			oper = input;
		//	}
              //    else {
				meanoper(Double.parseDouble(J_Text.getText()));
				oper = input;
				isStart = true;
                              
          
               
                }
                
                                  
          //                      }
        
                        }
                        
                        
                        
                        
        
        /*
                
        if (e.getSource()==button1)
        {
            J_Text.setText(J_Text.getText()+"1");
            J_Text.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        }
        else  if (e.getSource()==button2)
        {
            J_Text.setText(J_Text.getText()+"2");
             J_Text.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        }
        else  if (e.getSource()==button3)
        {
            J_Text.setText(J_Text.getText()+"3");
             J_Text.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        }
        else  if (e.getSource()==button4)
        {
            J_Text.setText(J_Text.getText()+"4");
             J_Text.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        }
        else  if (e.getSource()==button5)
        {
            J_Text.setText(J_Text.getText()+"5");
             J_Text.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        }
        else  if (e.getSource()==button6)
        {
            J_Text.setText(J_Text.getText()+"6");
             J_Text.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        }
        else  if (e.getSource()==button7)
        {
            J_Text.setText(J_Text.getText()+"7");
             J_Text.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        }
        else  if (e.getSource()==button8)
        {
            J_Text.setText(J_Text.getText()+"8");
             J_Text.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        }
        else  if (e.getSource()==button9)
        {
            J_Text.setText(J_Text.getText()+"9");
             J_Text.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        }
        else  if (e.getSource()==button0)
        {
            J_Text.setText(J_Text.getText()+"0");
             J_Text.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        }
        else  if (e.getSource()==buttonpoint)
        {
            J_Text.setText(J_Text.getText()+".");
             J_Text.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        }
       
        else  if (e.getSource()==buttonadd)
        {
            J_Text.setText(J_Text.getText()+"+");
             J_Text.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
              flag = 1;
        }
        else  if (e.getSource()==buttonsub)
        {
            J_Text.setText(J_Text.getText()+"-");
             J_Text.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
             flag = 2;
        }
        else  if (e.getSource()==buttonmul)
        {
            J_Text.setText(J_Text.getText()+"*");
             J_Text.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
             flag = 3;
        }
        else  if (e.getSource()==buttondiv)
        {
            J_Text.setText(J_Text.getText()+"/");
             J_Text.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
             flag = 4;
        }*/
         if (e.getSource()==buttonreset)
        {
            J_Text.setText("");
            
        }
         
         
         
         
         
        
             
        
         
        
        else if (e.getSource()==buttonon)
        {
            
        
            
            J_Text.setEnabled(true);
        
        buttonon.setEnabled(false);
      buttonoff.setEnabled(true);
        
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        button0.setEnabled(true);
        buttonpoint.setEnabled(true);
      //  buttonmean.setEnabled(true);
        buttonadd.setEnabled(true);
        buttonsub.setEnabled(true);
        buttonmul.setEnabled(true);
        buttondiv.setEnabled(true);
        buttonequals.setEnabled(true);
        buttonreset.setEnabled(true);      
        }
        
         else  if (e.getSource()==buttonoff)
         {
             J_Text.setEnabled(false);
      
      buttonon.setEnabled(true);
      buttonoff.setEnabled(false);
      
      button1.setEnabled(false);
      button2.setEnabled(false);
      button3.setEnabled(false);
      button4.setEnabled(false);
      button5.setEnabled(false);
      button6.setEnabled(false);
      button7.setEnabled(false);
      button8.setEnabled(false);
      button9.setEnabled(false);
      button0.setEnabled(false);
      buttondiv.setEnabled(false);
      buttonmul.setEnabled(false);
      buttonadd.setEnabled(false);
      buttonsub.setEnabled(false);
    //  buttonmean.setEnabled(false);
      buttonpoint.setEnabled(false);
      buttonequals.setEnabled(false);
      buttonreset.setEnabled(false);        
             
             
         }
        
    }
    
}   
        
    

    
    
    
