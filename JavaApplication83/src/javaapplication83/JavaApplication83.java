
package javaapplication83;
import java.util.Scanner;


public class JavaApplication83 {
    
    public static void main(String[] args) {
        
        int hostel_type,room_no, gender;
        String username, password, hostel, yn;
        
        Scanner i= new Scanner(System.in);
        //Login
        System.out.println("Enter username");
        username = i.nextLine();
        System.out.println("Enter Password");
        password = i.nextLine();
        
        if(username.equals("Ezrone") && password.equals("123") || username.equals("Martha") && password.equals("1234"))
        {
            // Hostel type
        System.out.println("Enter 1 to book Boys Hostel");
        System.out.println("Enter 2 to book Girls Hostel");
        hostel_type = i.nextInt();
        // Boys Hostel data input
        if(hostel_type==1)
        {
            System.out.println("Enter name of Hostel");
            hostel = i.nextLine();
            i.nextLine();
            System.out.println("Rooms in Hostel are:  101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111");
            // Room Number 102, 104, 106, 108, 110 are booked
            System.out.println("Choose your room");
            room_no = i.nextInt();
            if(room_no == 101 || room_no == 103 || room_no == 105 || room_no == 107 || room_no == 109 || room_no == 111)
            {
                System.out.println("Choose your gender / sex");
                System.out.println("1 for Boy");
                System.out.println("2 for Girl");
                gender = i.nextInt();
                if (gender == 1)
                {    // Identify mesho
                    System.out.println("Do You want to identify your mesho?   yes / no");
                    i.nextLine();
                    yn=i.nextLine();
                    if(yn.equals("yes"))
                    {
                        System.out.print("Your mesho is: ");
                        switch (room_no)
                        {   
                        case 101:
                                System.out.println("Peter Betera");
                                break;
                        case 103:
                            System.out.println("Wongani Luhanga");
                            break;
                        case 105:
                            System.out.println("Wongani Gondwe");
                            break;
                        case 107:
                            System.out.println("Ezrone Mkandawire");
                            break;
                        case 109:
                            System.out.println("Misheck Nanguwo");
                            break;
                        case 111:
                            System.out.println("John Joseph");
                            break;
                        }
                        System.out.println("Room booked successfully");
                    }     
                    else if(yn.equals("no"))
                    {
                        System.out.println("Room booked successfully");
                        System.exit(0);
                    }
                    else
                    {
                        System.out.println("Invalid Input");
                    }
                }
                else
                {
                    System.out.println("Boys cannot book hostel room in girls hostel");
                    System.exit(0);
                }
            }
            else
            {
                System.exit(0);
            }
        }
        // Girls Hostel data input
        else if(hostel_type==2)
        {
            System.out.println("Enter name of Hostel");
            hostel = i.nextLine();
            i.nextLine();
            System.out.println("Rooms in Hostel are:  101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112");
            // Room Number 101, 104, 105, 107, 110, 111 are booked
            System.out.println("Choose your room");
            room_no = i.nextInt();
            if(room_no == 102 || room_no == 103 || room_no == 106 || room_no == 108 || room_no == 109 || room_no == 112)
            {
                System.out.println("Choose your gender / sex");
                System.out.println("1 for Boy");
                System.out.println("2 for Girl");
                gender = i.nextInt();
                if(gender == 2)
                {
                     System.out.println("Do You want to identify your mesho?   yes / no");
                    i.nextLine();
                    yn=i.nextLine();
                    if (yn.equals("yes"))
                    {     // Identify mesho
                       System.out.print("Your mesho is: ");
                        switch (room_no)
                        {   
                        case 102:
                                System.out.println("Ruth Banda");
                                break;
                        case 103:
                            System.out.println("Catherine Chakhaza");
                            break;
                        case 106:
                            System.out.println("Faith Chizaka");
                            break;
                        case 108:
                            System.out.println("Martha Mkandawire");
                            break;
                        case 109:
                            System.out.println("Desire Nkhoma");
                            break;
                        case 112:
                            System.out.println("Lizzie kasambara");
                            break;
                        }
                         System.out.println("Room booked successfully");
                    }
                    else if(yn.equals("no"))
                    {
                        System.out.println("Room booked successfully");
                        System.exit(0);
                    }
                    else
                    {
                        System.out.println("Invalid Input");
                    }
                }
                else
                {
                    System.out.println("Girls cannot book hostel room in Boys hostel");
                    System.exit(0);
                }
            }
            else
            {
                System.out.println("Room is already booked");
                System.exit(0);
            }
        }
        else 
        {
            System.out.println("Invalid input");
        }    
        }
        else 
        {
            System.out.println("Invalid username or password");
        }    
        
    }
    
}
