
package javaapplication17;
import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.util.Arrays;

public class JavaApplication17 {

    
    public static void main(String[] args) {
           JFrame Calculator = new JFrame ("FA19-BCS-080, TANVEER UL HAQ");
         Calculator.setSize(630,410);
         
        JPanel C_panel = new JPanel();
        Calculator.add(C_panel);
        Placement(C_panel);
        
       // Calculator.setLayout(null);
       //Calculator.setResizable(true);
        Calculator.setVisible(true);
    }
    
        
    
      public static void Placement(JPanel C_panel)
      {
           C_panel.setLayout(null);
           
           //C_panel.setResizable(true);
          // C_panel.setVisible(true);
           
             JTextField J_Text = new JTextField(50);
       J_Text.setBounds(10, 10, 590, 50);
       
       C_panel.add(J_Text);
       
        JButton button1 = new JButton("1");
        button1.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       button1.setBounds(10,250,140,50);
       C_panel.add(button1);
       //button1.addActionListener(a);
        
       JButton button2 = new JButton("2");
        button2.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       button2.setBounds(160,250,140,50);
       C_panel.add(button2);
       
       JButton button3 = new JButton("3");
        button3.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       button3.setBounds(310,250,140,50);
       C_panel.add(button3);
       
       JButton button4 = new JButton("4");
        button4.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       button4.setBounds(10,190,140,50);
       C_panel.add(button4);
       
       JButton button5 = new JButton("5");
        button5.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       button5.setBounds(160,190,140,50);
       C_panel.add(button5);
       
       JButton button6 = new JButton("6");
        button6.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       button6.setBounds(310,190,140,50);
       C_panel.add(button6);
       
       JButton button7 = new JButton("7");
        button7.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       button7.setBounds(10,130,140,50);
       C_panel.add(button7);
       
       JButton button8 = new JButton("8");
        button8.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       button8.setBounds(160,130,140,50);
       C_panel.add(button8);
       
       JButton button9 = new JButton("9");
        button9.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       button9.setBounds(310,130,140,50);
       C_panel.add(button9);
       
       JButton button0 = new JButton("0");
        button0.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       button0.setBounds(160,310,140,50);
       C_panel.add(button0);
       
       JButton buttonpoint = new JButton(".");
        buttonpoint.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       buttonpoint.setBounds(10,310,140,50);
       C_panel.add(buttonpoint);
       
       JButton buttonpercentage = new JButton("%");
        buttonpercentage.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       buttonpercentage.setBounds(310,70,140,50);
       C_panel.add(buttonpercentage);
       
       JButton buttonadd = new JButton("+");
        buttonadd.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       buttonadd.setBounds(460,250,140,50);
       C_panel.add(buttonadd);
       
       JButton buttonsub = new JButton("-");
        buttonsub.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       buttonsub.setBounds(460,190,140,50);
       C_panel.add(buttonsub);
       
       JButton buttonmul = new JButton("*");
        buttonmul.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       buttonmul.setBounds(460,130,140,50);
       C_panel.add(buttonmul);
       
       JButton buttondiv = new JButton("/");
        buttondiv.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       buttondiv.setBounds(460,70,140,50);
       C_panel.add(buttondiv);
       
       JButton buttonequals = new JButton("=");
        buttonequals.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       buttonequals.setBounds(310,310,290,50);
       C_panel.add(buttonequals);
       
       JButton buttonreset = new JButton("C");
        buttonreset.setFont(new Font("Tahoma" ,Font.BOLD, 24 ));
       buttonreset.setBounds(180,70,110,50);
       C_panel.add(buttonreset);
       
       JRadioButton buttonon = new JRadioButton("ON");
        buttonon.setFont(new Font("Tahoma" ,Font.BOLD, 12 ));
       buttonon.setBounds (10,70,60,28);
       C_panel.add(buttonon);
       
       JRadioButton buttonoff = new JRadioButton("OFF");
        buttonoff.setFont(new Font("Tahoma" ,Font.BOLD, 12 ));
       buttonoff.setBounds (10,90,50,28);
       C_panel.add(buttonoff);
      }
      
   /*   public void actionPerformed(ActionEvent a)
      {
          
          String str = J_Text.getText();
          int b = Integer.parseInt(str);
      }

   
   /* static int flag=0;
    
    public void JavaApplication17() {
        initComponents();
        buttonon.setEnabled(false);
    }
      
      
    private Object J_Text;
    private Object buttonon;
    private Object buttonoff;
    private Object button1;
    private Object button2;
    private Object button3;
    private Object button4;
    private Object button5;
    private Object button6;
    private Object button7;
    private Object button8;
    private Object button9;
    private Object button0;
    private Object buttonpoint;
    private Object buttonpercentage;
    private Object buttonadd;
    private Object buttonsub;
    private Object buttonmul;
    private Object buttondiv;
    private Object buttonequals;
    private Object buttonreset;
       
       
    
     
        
    
     public void disable()
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
      buttonpercentage.setEnabled(false);
      buttonpoint.setEnabled(false);
      buttonequals.setEnabled(false);
      buttonreset.setEnabled(false);
    }
     
      private void buttononActionPerformed (java.awt.event.ActionEvent evt ){                                              
       enable(); 
         }                                             

    private void buttonoffActionPerformed(java.awt.event.ActionEvent evt ) {                                              
        disable();    
    }
    
   
   


      public void enable()
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
        buttonpercentage.setEnabled(true);
        buttonadd.setEnabled(true);
        buttonsub.setEnabled(true);
        buttonmul.setEnabled(true);
        buttondiv.setEnabled(true);
        buttonequals.setEnabled(true);
        buttonreset.setEnabled(true);
      }
      
     /* protected final String[] values = "0 1 2 3 4 5 6 7 8 9 PI E".split(" ");
	protected final String[] functions = "sin cos tan asin acos atan sqrt cbrt log10".split(" ");
      
      protected JTextField output;
      protected double curValue = 0;
      protected String oper = "=";
	protected boolean isStart = true;
        
        public void actionPerformed(ActionEvent e) {
		String input = (String) e.getActionCommand();
		
		//when the input is a dot (.)
		if(input.equals(".")){
			if(!output.getText().contains(".")){
				if(isStart){
					output.setText("0.");
					isStart=false;
				}else{
					output.setText(output.getText()+".");
				}
			}
			//when the input is a constant "PI"
		} else if(input.equals("PI")){
			output.setText(""+Math.PI);
			isStart = false;
			
			//when the input is a constant "E"
		} else if(input.equals("E")){
			output.setText(""+Math.E);
			isStart = false;
			
			//when the input is clear
		} else if(input.equals("CR")){
			curValue = 0;
			output.setText("");
			oper = "=";
			isStart = true;
			
			//when the input is 0~9
		} else if(Arrays.binarySearch(values, input)>=0){
			if(isStart){
				output.setText(input);
			} else{
				output.setText(output.getText()+ input);
			}
			isStart = false;
		
			//when the input is function
		} else if(Arrays.binarySearch(functions, input)>=0){
			computeFunc(input);
			isStart = true;
		
			//when the input is operator
		}else {
			if (isStart){
				if (input.equals("-") && output.equals("")) {
					output.setText(input);
					isStart = false;
				} else
					oper = input;
			} else {
				computeOper(Double.parseDouble(output.getText()));
				oper = input;
				isStart = true;
			}
		}
		
	
		
	}
	
	/**
	 * compute the operators
	 */
	/*private void computeOper(double d) {
		if (oper.equals("+"))
			curValue += d;
		else if (oper.equals("-"))
			curValue -= d;
		else if (oper.equals("*"))
			curValue *= d;
		else if (oper.equals("/"))
			curValue /= d;
		else if (oper.equals("="))
			curValue = d;
		else if (oper.equals("^"))
			curValue = Math.pow(curValue, d);
		else
			System.err.println("Non-existence Operator Error");
		output.setText(String.format("%.9f", curValue));
		
	}

	/**
	 * compute the functions
	 * @param input the function
	 */
	/*private void computeFunc(String input) {
		//sin cos tan asin acos atan sqrt cbrt log10
		curValue = Double.parseDouble(output.getText());
		if(input.equals("sin")){
			curValue = Math.sin(Math.toRadians(curValue));
		}else if(input.equals("cos")){
			curValue = Math.cos(Math.toRadians(curValue));
		}else if(input.equals("tan")){
			curValue = Math.tan(Math.toRadians(curValue));
		}else if(input.equals("asin")){
			curValue = Math.toDegrees(Math.asin(curValue));
		}else if(input.equals("acos")){
			curValue = Math.toDegrees(Math.acos(curValue));
		}else if(input.equals("atan")){
			curValue = Math.toDegrees(Math.atan(curValue));
		}else if(input.equals("sqrt")){
			curValue = Math.sqrt(curValue);
		}else if(input.equals("cbrt")){
			curValue = Math.cbrt(curValue);
		}else if(input.equals("log10")){
			curValue = Math.log10(curValue);
		}else{
			System.err.println("Non-existence Function Error");
		}
		
		output.setText(String.format("%.9f", curValue));
        }*/
 
//    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
/*
        String Enternumber = J_Text.getText() + button1.getText();
       J_Text.setText(Enternumber);
    }                                         

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         String Enternumber = jTextField1.getText() + jButton8.getText();
       jTextField1.setText(Enternumber);
    }                                        

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
           String Enternumber = jTextField1.getText() + jButton12.getText();
       jTextField1.setText(Enternumber);
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
           String Enternumber = jTextField1.getText() + jButton15.getText();
       jTextField1.setText(Enternumber);
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
           String Enternumber = jTextField1.getText() + jButton16.getText();
       jTextField1.setText(Enternumber);
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
    
        
        jTextField1.setText(jTextField1.getText()+ " = ");
        
        String str = jTextField1.getText();
        String[] substr = str.split("\\s+");
        
        float num1 =Float.parseFloat(substr[0]);
        float num2 =Float.parseFloat(substr[2]);
        
        if (flag==1)
        {
            jTextField1.setText(jTextField1.getText()+ " " +(num1 + num2));
        }
        if (flag==2)
        {
            jTextField1.setText(jTextField1.getText()+ " " +(num1 - num2));
        }
        if (flag==3)
        {
            jTextField1.setText(jTextField1.getText()+ " " +(num1 * num2));
        }
        if (flag==4)
        {
            jTextField1.setText(jTextField1.getText()+ " " +(num1 / num2));
        }
        if (flag==5)
        {
            jTextField1.setText(jTextField1.getText()+ " " +(num1 % num2));
        }
    }                                         

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String Enternumber = jTextField1.getText() + jButton9.getText();
       jTextField1.setText(Enternumber);
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String Enternumber = jTextField1.getText() + jButton10.getText();
       jTextField1.setText(Enternumber);
    }                                         

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       String Enternumber = jTextField1.getText() + jButton11.getText();
       jTextField1.setText(Enternumber);
    }                                         

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String Enternumber = jTextField1.getText() + jButton6.getText();
       jTextField1.setText(Enternumber);
    }                                        

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String Enternumber = jTextField1.getText() + jButton13.getText();
       jTextField1.setText(Enternumber);
    }                                         

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String Enternumber = jTextField1.getText() + jButton7.getText();
       jTextField1.setText(Enternumber);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
              jTextField1.setText("");

    }                                        

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
       enable(); // TODO add your handling code here:
    }                                             

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        disable();        // TODO add your handling code here:
    }                                             

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        jTextField1.setText(jTextField1.getText()+ " + ");
        flag =1;
        
    }                                         

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
          jTextField1.setText(jTextField1.getText()+ " - ");
        flag =2;
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
          jTextField1.setText(jTextField1.getText()+ " * ");
        flag =3;

    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
          jTextField1.setText(jTextField1.getText()+ " / ");
        flag =4;
 
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
          jTextField1.setText(jTextField1.getText()+ " % ");
        flag =5;
       
    }                                        
    
     private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            

    } 
      */
      
}
