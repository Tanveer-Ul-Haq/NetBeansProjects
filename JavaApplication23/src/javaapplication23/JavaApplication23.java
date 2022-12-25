
package javaapplication23;



public class JavaApplication23 {

   abstract class Bike{
    
    abstract void run();    //Empty body
}
    
   class Honda extends Bike{
    
    void run()
    {
        System.out.println("This is Honda class");
    }
}
   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
