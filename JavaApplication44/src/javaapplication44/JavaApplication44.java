
package javaapplication44;

import java.util.Scanner;


interface CUI
{
     void GetFee();
}

 class CS_DEPARTMENT implements CUI
{
    public void GetFee(){
     Scanner s=new Scanner(System.in);
    int Credit_hour;
    int Fee=500;
 
    System.out.println("Enter the credit hours: " );
     Credit_hour=s.nextInt();
     int totalfee= Credit_hour*Fee;
     System.out.println("Fees: " + totalfee);
}
    
}
 class Student implements CUI
{
    public void GetFee(){
     Scanner s=new Scanner(System.in);
    int Credit_hour;
    int Fee=600;
 
    System.out.println("Enter the credit hours: " );
     Credit_hour=s.nextInt();
     int totalfee= Credit_hour*Fee;
     System.out.println("Fees: " + totalfee);
}
    
}
 class Account implements CUI
{
    public void GetFee()
    {
         Scanner s=new Scanner(System.in);
    int Credit_hour;
    int Fee=700;
 
    System.out.println("Enter the credit hours: " );
     Credit_hour=s.nextInt();
     int totalfee= Credit_hour*Fee;
     System.out.println("Fees: " + totalfee);
}
    
}
public class JavaApplication44
{
    public static void main(String[] args) {
        
        
        CUI obj1=new CS_DEPARTMENT();
        obj1.GetFee();
        
        CUI obj2 =new Student();
        obj2.GetFee();
        
        CUI obj3=new Account();
        obj3.GetFee();
    }
    
}