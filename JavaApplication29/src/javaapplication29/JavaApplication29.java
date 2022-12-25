
package javaapplication29;
import java.awt.*;  
import java.awt.event.*; 
import javax.swing.*;

public class JavaApplication29 extends Frame implements ActionListener
{
    double num,ans;  //These all are INSTANCE variable
    int calculation;
    JTextField txt,text; 
    JLabel label;
    JRadioButton bon,boff;
    ButtonGroup bonoff;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,badd,bsub,bmul,bdot,bdiv,bdel,bac,beql,bfact,bsqrt,bsin,bcos,btan,bpow;
     JavaApplication29() // Constructor of workingclaculator
     {
       //Creating FRAME  
       JPanel panel=new JPanel();
     //  panel.setSize(400,550);
       JFrame frame=new JFrame( "Calculator");
       frame.setSize(410,550);
       frame.setLocation(400, 100);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.add(panel);       
       panel.setLayout(null);
       
       txt=new JTextField();
       txt.setBounds(43,30,290,50);
       panel.add(txt);
       
       text=new JTextField();
       text.setBounds(400,50,270,450);
       panel.add(text);
       JScrollPane scroll = new JScrollPane (text, 
   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       
    //   text.setEditable(false);
       
       //Buttons
       b1= new JButton("1");b1.setBounds(10,305,70,60);
       b2= new JButton("2");b2.setBounds(90,305,70,60);
       b3= new JButton("3");b3.setBounds(170,305,70,60);
       b4= new JButton("4");b4.setBounds(10,235,70,60);
       b5= new JButton("5");b5.setBounds(90,235,70,60);
       b6= new JButton("6");b6.setBounds(170,235,70,60);
       b7= new JButton("7");b7.setBounds(10,165,70,60);
       b8= new JButton("8");b8.setBounds(90,165,70,60);
       b9= new JButton("9");b9.setBounds(170,165,70,60);
       b0= new JButton("0");b0.setBounds(10,375,70,60);
       b00= new JButton("00");b00.setBounds(90,375,70,60);
       bdot= new JButton(".");bdot.setBounds(170,375,70,60);
       beql= new JButton("=");beql.setBounds(10,445,233,60);
       bon = new JRadioButton("ON" , true);bon.setBounds (10,100,60,30);
       boff = new JRadioButton("OFF" , false);boff.setBounds (10,130,60,30); 
        
       bonoff = new ButtonGroup();

       bonoff.add(bon);
       bonoff.add(boff);
      
       
       //operation Button
       badd= new JButton("+");badd.setBounds(250,380,60,55);
       bsub= new JButton("-");bsub.setBounds(250,310,60,55);
       bmul= new JButton("*");bmul.setBounds(250,240,60,55);
       bdiv= new JButton("/");bdiv.setBounds(250,170,60,55);
       bpow= new JButton("^");bpow.setBounds(320,170,60,55);
       bac= new JButton("AC");bac.setBounds(250,100,60,55);
       bdel= new JButton("DEL");bdel.setBounds(320,100,60,55);
       bsin= new JButton("sin");bsin.setBounds(320,240,60,55);
       bcos= new JButton("cos");bcos.setBounds(320,310,60,55);
       btan= new JButton("tan");btan.setBounds(320,380,60,55);
       bsqrt=new JButton("sqrt");bsqrt.setBounds(320,450,60,55);
       bfact=new JButton("!");bfact.setBounds(250,450,60,55);
       
       //Adding Action Listener to button
       b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
       b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
       b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);
       b0.addActionListener(this);b00.addActionListener(this);bdot.addActionListener(this);
       beql.addActionListener(this);badd.addActionListener(this);bsub.addActionListener(this);
       bmul.addActionListener(this);bdiv.addActionListener(this);bac.addActionListener(this);
       bdel.addActionListener(this);bpow.addActionListener(this);bsin.addActionListener(this);
       bcos.addActionListener(this);btan.addActionListener(this);bsqrt.addActionListener(this);
       bfact.addActionListener(this);bon.addActionListener(this); boff.addActionListener(this);
          
       //Label
       label=new JLabel();
       label.setBounds(120, 20, 170, 140);
       panel.add(label);
       // Adding Buttons to panel
       panel.add(b1);panel.add(b2);panel.add(b3);panel.add(b4);
       panel.add(b5);panel.add(b6);panel.add(b7);panel.add(b8);
       panel.add(b9);panel.add(b0);panel.add(b00);panel.add(bdot);
       panel.add(beql);panel.add(bac);panel.add(bdel);panel.add(bsub);
       panel.add(bdiv);panel.add(bmul);panel.add(badd);panel.add(bpow);
       panel.add(bsin);panel.add(bcos);panel.add(btan);panel.add(bsqrt);
       panel.add(bfact);panel.add(bon);panel.add(boff);
       
       // Size of font on button and text field
       b1.setFont(new Font("Tahoma" ,Font.BOLD, 20 ));b2.setFont(new Font("Tahoma" ,Font.BOLD, 20 ));
       b3.setFont(new Font("Tahoma" ,Font.BOLD, 20 ));b4.setFont(new Font("Tahoma" ,Font.BOLD, 20 ));
       b5.setFont(new Font("Tahoma" ,Font.BOLD, 20 ));b6.setFont(new Font("Tahoma" ,Font.BOLD, 20 ));
       b7.setFont(new Font("Tahoma" ,Font.BOLD, 20 )); b8.setFont(new Font("Tahoma" ,Font.BOLD, 20 ));
       b9.setFont(new Font("Tahoma" ,Font.BOLD, 20 )); b0.setFont(new Font("Tahoma" ,Font.BOLD, 20 ));
       b00.setFont(new Font("Tahoma" ,Font.BOLD, 20 )); bdot.setFont(new Font("Tahoma" ,Font.BOLD, 20 ));
       beql.setFont(new Font("Tahoma" ,Font.BOLD, 20 )); bac.setFont(new Font("Tahoma" ,Font.BOLD, 12 ));
       bdel.setFont(new Font("Tahoma" ,Font.BOLD, 12 )); bsub.setFont(new Font("Tahoma" ,Font.BOLD, 20 ));
       bdiv.setFont(new Font("Tahoma" ,Font.BOLD, 20 )); bmul.setFont(new Font("Tahoma" ,Font.BOLD, 20 ));
       badd.setFont(new Font("Tahoma" ,Font.BOLD, 20 )); bpow.setFont(new Font("Tahoma" ,Font.BOLD, 20 ));
       bsin.setFont(new Font("Tahoma" ,Font.BOLD, 12 )); bcos.setFont(new Font("Tahoma" ,Font.BOLD, 12 ));
       btan.setFont(new Font("Tahoma" ,Font.BOLD, 12 ));bsqrt.setFont(new Font("Tahoma" ,Font.BOLD, 12 ));
       bfact.setFont(new Font("Tahoma" ,Font.BOLD, 20 ));bon.setFont(new Font("Tahoma" ,Font.BOLD, 16 ));
       boff.setFont(new Font("Tahoma" ,Font.BOLD, 16 ));
       
    //   panel.setBackground(Color.white);
       frame.setVisible(true);        
        bon.setEnabled(false);  
         text.setEnabled(false); 
         
        
     }
     
     // for factorial 
     public double factorial(double n){    
              if (n == 0)    
              return 1;    
              else    
              return(n * factorial(n-1));  
    
     }
     
     
     // Method to perform Arithmatic operations
    public void arithmatic_operation()
    {
        switch(calculation)
        {
            case 1:
            {
                ans= num + Double.parseDouble(txt.getText());
              //  txt.setFont(new Font("Tahoma" ,Font.BOLD, 20 ));
                txt.setText(Double.toString(ans));
                break;
            }
            case 2:
            {
                ans= num - Double.parseDouble(txt.getText());
                txt.setText(Double.toString(ans));
                break;
            }
            case 3:
            {
                ans= num * Double.parseDouble(txt.getText());
                txt.setText(Double.toString(ans));
                break;
            }
            case 4:
            {
                ans= num / Double.parseDouble(txt.getText());
                txt.setText(Double.toString(ans));
                break;
            }
             case 5:
            {
                ans= Math.pow(num, Double.parseDouble(txt.getText()));
                txt.setText(Double.toString(ans));
                break;
            }
            
        }
    }
    
      
    //Main Method 
    public static void main(String[] args)
    {
        JavaApplication29 obj =new JavaApplication29();                 
    }
    // Method of Action Listener
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        txt.setFont(new Font("Tahoma" ,Font.BOLD, 20 ));
        label.setFont(new Font("Tahoma" ,Font.BOLD, 16 ));

        System.out.println("Buton clicked");
        if(e.getSource() == b1)
        {
        txt.setText(txt.getText()+ "1");
        }
        else if(e.getSource() == b2)
        {
        txt.setText(txt.getText()+ "2");
        }
        else if(e.getSource() == b3)
        {
        txt.setText(txt.getText()+ "3");
        }
        else if(e.getSource() == b4)
        {
        txt.setText(txt.getText()+ "4");
        }
        else if(e.getSource() == b5)
        {
        txt.setText(txt.getText()+ "5");
        }
        else if(e.getSource() == b6)
        {
        txt.setText(txt.getText()+ "6");
        }
        else if(e.getSource() == b7)
        {
        txt.setText(txt.getText()+ "7");
        }
        else if(e.getSource() == b8)
        {
        txt.setText(txt.getText()+ "8");
        }
        else if(e.getSource() == b9)
        {
        txt.setText(txt.getText()+ "9");
        }
        else if(e.getSource() == b0)
        {
        txt.setText(txt.getText()+ "0");
        }
        else if(e.getSource() == b00)
        {
        txt.setText(txt.getText()+ "00");
        }
        else if(e.getSource() == bdot)
        {
        txt.setText(txt.getText()+ ".");
        }
        else if(e.getSource() == bac)
        {
        txt.setText("");
        }
        else if(e.getSource() == badd)
        {
        num=Double.parseDouble(txt.getText());
        calculation = 1;
        txt.setText("");
        label.setText(num + "+");
        
        }
        else if(e.getSource() == bsub)
        {
        num=Double.parseDouble(txt.getText());
        calculation = 2;
        txt.setText("");
        label.setText(num + "-");
        }
        else if(e.getSource() == bmul)
        {
        num=Double.parseDouble(txt.getText());
        calculation = 3;
        txt.setText("");
        label.setText(num + "*");
        }
        else if(e.getSource() == bdiv)
        {
        num=Double.parseDouble(txt.getText());
        calculation = 4;
        txt.setText("");
        label.setText(num + "/");
        }
        else if(e.getSource() == bpow)
        {
        num=Double.parseDouble(txt.getText());
        calculation = 5;
        txt.setText("");
        label.setText(num + "^");
        }
         else if(e.getSource() == bsin)
        {
            num=Double.parseDouble(txt.getText());
            ans = Math.sin(Math.toRadians(num));
            txt.setText(Double.toString(ans));
            label.setText("sin "+ num);
        }
        else if(e.getSource() == bcos)
        {
            num=Double.parseDouble(txt.getText());
	    ans = Math.cos(Math.toRadians(num));
             txt.setText(Double.toString(ans));
              label.setText("cos "+ num);
        }
        else if(e.getSource() == btan)
        {
            num=Double.parseDouble(txt.getText());
	   ans = Math.tan(Math.toRadians(num));
            txt.setText(Double.toString(ans));
             label.setText("tan "+ num);
	}
        else if(e.getSource() == bsqrt)
        {
            num=Double.parseDouble(txt.getText());
	   ans = Math.sqrt(num);
            txt.setText(Double.toString(ans));
             label.setText("sqrt "+ num);
        }
        else if(e.getSource() == bfact)
        {
          num=Double.parseDouble(txt.getText());
                ans = factorial(num);
            txt.setText(Double.toString(ans));
             label.setText(num + "!");
        }
        else if(e.getSource() == beql)
        {
        arithmatic_operation();
        }
        else if(e.getSource() == bdel)// Code From net for deleting numbers
        {
        int length=txt.getText().length(); 
        int number=txt.getText().length()- 1;
        String store;
        if(length>0)
        {
            StringBuilder back=new StringBuilder(txt.getText());
            back.deleteCharAt(number);
            store=back.toString();
            txt.setText(store);
        }
                
        }
        
          if (e.getSource()==bon)
        {
            
        
            
            txt.setEnabled(true);
        
        bon.setEnabled(false);
      boff.setEnabled(true);
        
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b0.setEnabled(true);
        bdot.setEnabled(true);
        bsin.setEnabled(true);
        bcos.setEnabled(true);
        btan.setEnabled(true);
        bsqrt.setEnabled(true);
        bpow.setEnabled(true);
        b00.setEnabled(true);
        badd.setEnabled(true);
        bsub.setEnabled(true);
        bmul.setEnabled(true);
        bdiv.setEnabled(true);
        beql.setEnabled(true);
        bac.setEnabled(true); 
        bdel.setEnabled(true);
        bfact.setEnabled(true);
        }
        
         else  if (e.getSource()==boff)
         {
             txt.setEnabled(false);
      
      bon.setEnabled(true);
      boff.setEnabled(false);
      
      b1.setEnabled(false);
      b2.setEnabled(false);
      b3.setEnabled(false);
      b4.setEnabled(false);
      b5.setEnabled(false);
      b6.setEnabled(false);
      b7.setEnabled(false);
      b8.setEnabled(false);
      b9.setEnabled(false);
      b0.setEnabled(false);
      bdiv.setEnabled(false);
      bmul.setEnabled(false);
      badd.setEnabled(false);
      bsub.setEnabled(false);
      bsin.setEnabled(false);
      bcos.setEnabled(false);
      btan.setEnabled(false);
      bsqrt.setEnabled(false);
      bdot.setEnabled(false);
      beql.setEnabled(false);
      bac.setEnabled(false);        
      b00.setEnabled(false); 
      bpow.setEnabled(false);
      bdel.setEnabled(false);
      bfact.setEnabled(false);
          
         }
    }
}


