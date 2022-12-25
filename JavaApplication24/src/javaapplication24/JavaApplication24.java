
package javaapplication24;

 abstract class Shape{  
    abstract void draw();  
}  

    class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  
    
     class Circle extends Shape{  
void draw(){System.out.println("drawing Circle");}  
}  


public class JavaApplication24 {

   
                       
    public static void main(String[] args) {
        // TODO code application logic here
        
        Shape c=new Circle();//In a real scenario, object is provided through method, e.g., getShape() method  
          c.draw(); 
          Shape r=new Rectangle();
          r.draw();

    }

}
