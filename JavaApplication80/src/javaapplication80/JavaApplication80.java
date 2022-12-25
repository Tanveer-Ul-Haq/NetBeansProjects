
package javaapplication80;
import java.util.*;

public class JavaApplication80 {

    public static void main(String[] args) {
        
       Scanner input=new Scanner(System.in);
       
 System.out.println("ENTER 1 FOR CIRCLE");
 System.out.println("ENTER 2 FOR RECTANGLE");
 System.out.println("ENTER 3 FOR SQUARE");
 System.out.println("Enter 4 FOR TRIANGLE");
 System.out.println("ENTER 5 FOR EXIT");
 System.out.println("--------------------------------------");
 
  for(int a=0;a<6;a++)
  {
      
 System.out.println("ENTER A NUMBER TO SELECT MENU");

 int menu=input.nextInt();

 switch(menu){
 case 1:
 Shape c=new Circle();
     System.out.println("draw circle");
 c.draw();

 break;
 case 2:
 Shape r=new Rectangle();
     System.out.println("draw rectangle");
r.draw();
 break;
 case 3 :
 Shape s=new Square();
     System.out.println("draw Square");
 s.draw();
 break;
 case 4:
  Shape t=new Triangle() ;
     System.out.println("draw triangle");
t.draw();
break;
 case 5 :
     System.out.println("exit");
     System.out.println("--------------------------------------");
     System.out.println("--------------------------------------");
     break;
 default:
 System.out.println("WRONG INPUT");
 System.out.println("--------------------------------------");
 System.out.println("--------------------------------------");
 break;
 }
  }
 }
 }
