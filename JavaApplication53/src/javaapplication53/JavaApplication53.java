
package javaapplication53;
import java.util.Scanner;

 class Angle
{
 public int x;
public  float y;
public  String z;
  Angle(){
      x=0;
      y=0;
      z="none";}
  void setvalue(int A,String C,float B){
      
      x=A;
      y=B;
      z=C;
  
}
    void display(){
        
      
       System.out.println(x + "°" +  y + "'" + z);
  
}
 }

public class JavaApplication53 {

    
    public static void main(String[] args) {
        
         Scanner s= new Scanner(System.in);
        
        System.out.println("Enter the direction in N/S/E/W");
        String c=s.nextLine();
        System.out.println("Enter the degree");
        int a=s.nextInt();
        System.out.println("Enter the minutes");
         float b=s.nextFloat();
        Angle ang=new Angle();
        ang.setvalue(a,c,b);
        ang.display();
    }
    
}
