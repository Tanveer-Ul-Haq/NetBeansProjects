
package javaapplication31;

import java.util.Scanner;

 abstract class Shape{  
    abstract void AREA(); 
 }

  class Rectangle extends Shape{  
      int length,width;
      Double area;
      String a,b;
void AREA(){
     Scanner i = new Scanner(System.in);
       System.out.println("Enter length of rectangle");
        length = i.nextInt();
       System.out.println("Enter width of rectangle");
        width = i.nextInt();
        double m=length;
        double n=width;
           area = m*n;
           System.out.println("Area of rectangle" + " = "+ area);
}  
}  
    
     class Circle extends Shape{  
void AREA(){
    int radius;
    Scanner i = new Scanner(System.in);
    System.out.println("Enter radius");
    radius = i.nextInt();
     System.out.println("Area of Circle" + " = " + 2*3.14*radius);
    
}  
}  


public class JavaApplication31 {

   
    public static void main(String[] args) {
          
          Shape r=new Rectangle();
          r.AREA();
    //      Shape t = new triangle();
    //      t.AREA();
           Shape c=new Circle();
          c.AREA(); 
    }
    
}
