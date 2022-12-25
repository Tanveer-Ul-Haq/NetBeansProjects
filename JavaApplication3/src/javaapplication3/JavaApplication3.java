
package javaapplication3;
import java.util.*;

public class JavaApplication3 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int user_choice=1;
       
            System.out.println("Enter 1:   For pessenger Reservation Detail  : \n");
            user_choice=sc.nextInt();
           System.out.println("----------------------------------------------");
            switch(user_choice){
                case 1:
                    RESERVATION r1=new RESERVATION();
                    r1.insert_reservation_record();
                    r1.show_reservation_record();
                   
                    break;
                default :
                    System.out.println("invalid cammand");
          
            }  
    }
    
}
