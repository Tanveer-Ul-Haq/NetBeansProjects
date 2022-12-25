

package javaapplication22;
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



public class JavaApplication22 extends Frame implements ActionListener {

     JButton bCR,bfact,buttonpower,buttondoublezero,button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonpoint,buttoncos,buttonsin,buttontan,buttonsqrt,buttonadd,buttonsub,buttonmul,buttondiv,buttonequals,buttonreset;
     JTextField J_Text;
     JRadioButton buttonon,buttonoff;
     ButtonGroup buttononoff;
     String s1,s2;
     double b,c,sum;
     JPanel C_panel,J_panel;
     //int x;
     
     
     protected final String[] str = "0 1 2 3 4 5 6 7 8 9".split(" ");
     protected final String[] functions = "sin cos tan sqrt ".split(" ");
     
     protected double answer = 0;
     protected String oper = "=";
     protected boolean isStart = true;
     
     
    public static void main(String[] args) {
        
           
        
        new JavaApplication22();
        
        
    }
    
     public JavaApplication22(){
     
    
           JFrame Calculator = new JFrame ("FA19-BCS-080, TANVEER UL HAQ");
           Calculator.setSize(700,480);
           Calculator.setLocation(250, 150);
                 
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
       J_Text.setBounds(10, 20, 670, 60);
       C_panel.add(J_Text);
       
        
        button1 = new JButton("1");
        button1.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button1.addActionListener(this);
       button1.setBounds(10,310,100,50);
       C_panel.add(button1);
       
      
        
        button2 = new JButton("2");
        button2.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button2.addActionListener(this);
       button2.setBounds(120,310,100,50);
       C_panel.add(button2);
       
        button3 = new JButton("3");
        button3.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button3.addActionListener(this);
       button3.setBounds(230,310,100,50);
       C_panel.add(button3);
       
        button4 = new JButton("4");
        button4.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button4.addActionListener(this);
       button4.setBounds(10,240,100,50);
       C_panel.add(button4);
       
        button5 = new JButton("5");
        button5.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button5.addActionListener(this);
       button5.setBounds(120,240,100,50);
       C_panel.add(button5);
       
        button6 = new JButton("6");
        button6.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button6.addActionListener(this);
       button6.setBounds(230,240,100,50);
       C_panel.add(button6);
       
        button7 = new JButton("7");
        button7.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button7.addActionListener(this);
       button7.setBounds(10,170,100,50);
       C_panel.add(button7);
       
        button8 = new JButton("8");
        button8.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button8.addActionListener(this);
       button8.setBounds(120,170,100,50);
       C_panel.add(button8);
       
        button9 = new JButton("9");
        button9.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button9.addActionListener(this);
       button9.setBounds(230,170,100,50);
       C_panel.add(button9);
       
        button0 = new JButton("0");
        button0.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        button0.addActionListener(this);
       button0.setBounds(120,380,100,50);
       C_panel.add(button0);
       
       buttondoublezero = new JButton("00");
        buttondoublezero.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttondoublezero.addActionListener(this);
       buttondoublezero.setBounds(230,380,100,50);
       C_panel.add(buttondoublezero);
       
        buttonpoint = new JButton(".");
        buttonpoint.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonpoint.addActionListener(this);
       buttonpoint.setBounds(10,380,100,50);
       C_panel.add(buttonpoint);
       
        buttonsin = new JButton("sin");
        buttonsin.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonsin.addActionListener(this);
       buttonsin.setBounds(450,170,100,50);
       C_panel.add(buttonsin);
       
        buttoncos = new JButton("cos");
        buttoncos.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttoncos.addActionListener(this);
       buttoncos.setBounds(450,240,100,50);
       C_panel.add(buttoncos);
       
        buttontan = new JButton("tan");
        buttontan.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttontan.addActionListener(this);
       buttontan.setBounds(450,310,100,50);
       C_panel.add(buttontan);
       
        buttonsqrt = new JButton("sqrt");
        buttonsqrt.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonsqrt.addActionListener(this);
       buttonsqrt.setBounds(450,380,100,50);
       C_panel.add(buttonsqrt);
       
        buttonadd = new JButton("+");
        buttonadd.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonadd.addActionListener(this);
       buttonadd.setBounds(340,380,100,50);
       C_panel.add(buttonadd);
       
       buttonpower = new JButton("^");
        buttonpower.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonpower.addActionListener(this);
       buttonpower.setBounds(560,200,120,60);
       C_panel.add(buttonpower);
       
        buttonsub = new JButton("-");
        buttonsub.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonsub.addActionListener(this);
       buttonsub.setBounds(340,310,100,50);
       C_panel.add(buttonsub);
       
        buttonmul = new JButton("*");
        buttonmul.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonmul.addActionListener(this);
       buttonmul.setBounds(340,240,100,50);
       C_panel.add(buttonmul);
       
        buttondiv = new JButton("/");
        buttondiv.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttondiv.addActionListener(this);
       buttondiv.setBounds(340,170,100,50);
       C_panel.add(buttondiv);
       
        buttonequals = new JButton("=");
        buttonequals.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonequals.addActionListener(this);
       buttonequals.setBounds(560,350,120,60);
       C_panel.add(buttonequals);
       
        buttonreset = new JButton("C");
        buttonreset.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        buttonreset.addActionListener(this);
       buttonreset.setBounds(190,100,100,50);
       C_panel.add(buttonreset);
       
        bCR = new JButton("CR");
        bCR.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        bCR.addActionListener(this);
       bCR.setBounds(300,100,100,50);
       C_panel.add(bCR);
       
       bfact = new JButton("!");
        bfact.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
        bfact.addActionListener(this);
       bfact.setBounds(560,270,120,60);
       C_panel.add(bfact);
       
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
                
   
         // for factorial 
     public double factorial(double n){    
              if (n == 0)    
              return 1;    
              else    
              return(n * factorial(n-1));  
    
     }
     
        
         
        public void computeOper(double d) {
		if (oper.equals("+"))
			answer += d;
		else if (oper.equals("-"))
			answer -= d;
		else if (oper.equals("*"))
			answer *= d;
		else if (oper.equals("/"))
                          answer /= d;
                else if (oper.equals("^"))
			answer = Math.pow(answer, d);
                
                
		else if (oper.equals("="))
			answer = d;
		
		else
			System.err.println("Non-existence Operator Error");
		J_Text.setText(String.format("%.5f", answer));
		
	}

        private void computeFunc(String input) {
	
		answer = Double.parseDouble(J_Text.getText());
		if(input.equals("sin")){
			answer = Math.sin(Math.toRadians(answer));
		}else if(input.equals("cos")){
			answer = Math.cos(Math.toRadians(answer));
		}else if(input.equals("tan")){
			answer = Math.tan(Math.toRadians(answer));
		}else if(input.equals("sqrt")){
			answer = Math.sqrt(answer);
		} 
           //     else if(input.equals("!"))
          //      {
           //              answer = factorial(answer);         
           //     }
         
                else{
			System.err.println("Non-existence Function Error");
		}
		
		J_Text.setText(String.format("%.9f", answer));
	}

         static int x = 0;

    void display() {
        x = x + 1;
    }
          
   
    
    public void actionPerformed(ActionEvent e)
    {
        
        String input = (String) e.getActionCommand();
	 J_Text.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
         
            display();
           System.out.println(x + " Buton clicked");
           
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
		 
                 	//when the input is clear
		 else if(input.equals("C")){
			answer = 0;
			J_Text.setText("");
			oper = "=";
			isStart = true;
                 }
                 	//when the input is function
		       else if(Arrays.binarySearch(functions, input)>=0){
			computeFunc(input);
			isStart = true;
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
                 
                
                 if(e.getSource() == buttondoublezero)
        {
        J_Text.setText(J_Text.getText()+ "00");
        }
                 
         else if(e.getSource() == bCR)// Code From net for deleting numbers
        {
        int length=J_Text.getText().length(); 
        int number=J_Text.getText().length()- 1;
        String store;
        if(length>0)
        {
            StringBuilder back=new StringBuilder(J_Text.getText());
            back.deleteCharAt(number);
            store=back.toString();
            J_Text.setText(store);
        }
                
        }
      
                 if(e.getSource()== bfact)
                {
                         answer = factorial(answer);         
                }
    //     if (e.getSource()==buttonreset)
   //     {
   //         J_Text.setText("");
            
    //    }
         
         
         
        
         if (e.getSource()==buttonon)
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
        buttonsin.setEnabled(true);
        buttoncos.setEnabled(true);
        buttontan.setEnabled(true);
        buttonsqrt.setEnabled(true);
        buttonpower.setEnabled(true);
        buttondoublezero.setEnabled(true);
        buttonadd.setEnabled(true);
        buttonsub.setEnabled(true);
        buttonmul.setEnabled(true);
        buttondiv.setEnabled(true);
        buttonequals.setEnabled(true);
        buttonreset.setEnabled(true); 
        bCR.setEnabled(true);
        bfact.setEnabled(true); 
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
      buttonsin.setEnabled(false);
      buttoncos.setEnabled(false);
      buttontan.setEnabled(false);
      buttonsqrt.setEnabled(false);
      buttonpoint.setEnabled(false);
      buttonequals.setEnabled(false);
      buttonreset.setEnabled(false);        
      buttondoublezero.setEnabled(false); 
      buttonpower.setEnabled(false);
      bCR.setEnabled(false);
      bfact.setEnabled(false); 
             
         }
        
    }
    
}   
        
    

    
    
    
