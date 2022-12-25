
package javaapplication3;
import java.util.Scanner;

public class RESERVATION {
    
    static String name;
    static int reservation_id;
    static String reservation_type;
    static String reservation_date;
     int reservation_seats;
     String reservation_time;
     float Ticket_price;
    public void insert_reservation_record(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of pessnger who reserved the seat :");
        name=sc.nextLine();
        System.out.println("The name of pessenger is :"+name);
        System.out.println("---------------------------------");
        System.out.println("enter the date of travelling");
        reservation_date=sc.nextLine();
        System.out.println("Reservation date of travellinf was :/"+reservation_date);
        System.out.println("------------------------------------------------------");
         System.out.println("Enter the time of traveling");
        reservation_time=sc.nextLine();
        System.out.println("What was your time of traveling taht you reserved :/"+this.reservation_time);
        System.out.println("----------------------------------------------------------------------");       
        System.out.println("kindly enter the type of reservatrion you need");
        reservation_type=sc.nextLine();
        System.out.println("Reservation type was : "+reservation_type);
        System.out.println("-----------------------------------------");
        System.out.println("Enter the reservation id:");
        reservation_id=sc.nextInt();
        System.out.println("Reservation id is: "+reservation_id);
        System.out.println("-----------------------------------");
        System.out.println("Kindly enter your reserrved seat no: ");
        reservation_seats=sc.nextInt();
        System.out.println("your reserved seat numbber is :/ "+this.reservation_seats);
        System.out.println("----------------------------------------------------");
        System.out.println("Enter the price of ticket");
        Ticket_price=sc.nextFloat();
        System.out.println("The price of ticket ia :"+this.Ticket_price);
         System.out.println("---------------------------------------------");
        
    }
    public void show_reservation_record(){
        System.out.println("pessenger name       =    " +name+"\n"  
                         + "reservtion_id        =    " +reservation_id+"\n"
                         + "reservation_type     =    " +reservation_type+"\n"
                         + "reservation_date     =    " +reservation_date+"\n"
                         + "reservation_time     =    " +this.reservation_time+ "\n"
                         + "reservation_seat     =    " +this.reservation_seats);
        
}
}