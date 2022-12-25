
package javaapplication25;

 abstract class CUI
{
      int credit_hours,per_credit_hour_fee,total_fee;
    
    abstract void fee ();
}
class CS extends CUI
{
    void fee ()
    {
     credit_hours = 4;
     per_credit_hour_fee = 600;
     total_fee = credit_hours*per_credit_hour_fee;
    System.out.println("Fee of CS is: " + total_fee);
    }
}
class Student extends CUI
{
    
void fee ()
{
     credit_hours = 4;
     per_credit_hour_fee = 600;
     total_fee = credit_hours*per_credit_hour_fee;
    System.out.println("Fee of Student is: " + total_fee);
}
    
}
class Accounts extends CUI
{
    
 void fee ()
{
     credit_hours = 4;
     per_credit_hour_fee = 600;
     total_fee = credit_hours*per_credit_hour_fee;
    System.out.println("Fee of Accounts is: " + total_fee);
}   
}
    

public class JavaApplication25 {

   
  
    public static void main(String[] args) {
        
       CUI a = new CS();
           a.fee();
       CUI b = new Student();
           b.fee();
       CUI c = new Accounts();
           c.fee();
      
    
    }
    
}
