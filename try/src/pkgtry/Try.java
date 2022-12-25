package pkgtry;


import javax.swing.*;




public class Try {
	
public static void main(String[] args) {
   

              
       
        String a,b,c;

    a= JOptionPane.showInputDialog("Enter 1st number: ");
    int x = Integer.parseInt(a);
    
    b= JOptionPane.showInputDialog("Enter 2nd number ");
    int y = Integer.parseInt(b);
      
 c= JOptionPane.showInputDialog("Enter 3rd number ");
    int z = Integer.parseInt(c);



if(x==y)
 { if(x==z)
     {JOptionPane.showMessageDialog(null,"Numbers are Equal");}
     else
     {JOptionPane.showMessageDialog(null,"Numbers are Different");}
 }
 else
  { JOptionPane.showMessageDialog(null,"Numbers are Different");
  }

    

    }
   
}