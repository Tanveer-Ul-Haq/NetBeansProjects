
package javaapplication43;

interface Vehicle {
    
   void Speed();
   void Colour();
    }

 class Bicycle implements Vehicle {
    public void Speed()
     {
         System.out.println("This is Speed method");
     }
 

    public void Colour()
     {
         System.out.println("This is Colour method");
     }
 } 
  
public class JavaApplication43 {

   
    public static void main(String[] args) {
              Vehicle obj0 = new Bicycle();    
                 obj0.Speed();
                 obj0.Colour();
       
    }
    
}
