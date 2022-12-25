
package javaapplication52;
import java.util.Scanner;
import java.io.*;

public class JavaApplication52 {

     int total_cars=0,total_paying_cars=0,total_non_paying_cars=0;
    double total_money=0,increment=0;

    JavaApplication52()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Pay/Enter 50 rupees to pass car:");
        int pay=input.nextInt();
        if(pay==50)
        {
            paying_car(pay);
        }
        else
        {
            non_paying();
        }
        System.out.println("Enter 1 to view total paying car");
        System.out.println("Enter 2 to view non paying car");
        System.out.println("Enter 3 to Display All Passing in toll");
        System.out.println("Enter 4 to Exit");
        System.out.println("Enter 5 File HAndling writing");
        System.out.println("Enter 6 file handling reading");
        
        int choice=input.nextInt();
        switch(choice)
        {
            case 1:
            {
                showpaying_cars();
                break;
            }
            case 2:
            {
                show_nonpaying_cars();
                break;
            }
            case 3:
            {
                display();
                break;
            }
            case 4:
            {
                
                System.out.println("\r");
                break;
            }
            case 5:
            {
                try
               {  FileWriter fw=new FileWriter("E:\\TollBooth data.txt");
                  fw.write("Total cars paying"+total_paying_cars);
                  fw.write("Total non paying cars"+total_non_paying_cars );
                  fw.close();
                  System.out.println("Success");
               }
        catch(Exception e)
        {
            System.out.println(e);
        }break;
            }
            case 6:
            {
                 try
                {
                FileReader filereadObj=new FileReader("E:\\TollBooth Data.txt");    
                int iterator;    
                while((iterator=filereadObj.read())!=-1)    
                System.out.print((char)iterator);    
                filereadObj.close();
                }
                catch(Exception e)
                {
                System.out.println(e);
                }
                break;
            }
            default:
            {
                System.out.println("Invalid Input");
            } 
        }
    }
    
    public static void main(String[] args) {
        
        JavaApplication52 t=new JavaApplication52();
        
    }
    void paying_car(int p)
    {
        total_paying_cars++;
        total_money=0.50+total_money;
        
    }
    void non_paying()
    {
        total_non_paying_cars++;
    }
    void showpaying_cars()
    {
        System.out.println("total no of paying cars : "+total_paying_cars);   
    }
    void show_nonpaying_cars()
    {
        System.out.println("total no of non_paying cars : "+total_non_paying_cars);
    }
    void display()
    {
        System.out.println("total no of cars passed : "+total_paying_cars+total_non_paying_cars);
        System.out.println("total money collected : "+total_money+"Rs");
    }
    
    
}
