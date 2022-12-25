package javafirstlab;
import java.util.Scanner;

public class JavaFirstLab {

    public static void main(String[] args)
    {
       
        int a;
        float d,x,y,z,p;
        String n;
        Scanner i = new Scanner(System.in);
        System.out.println(" Enter 1 to find Radius \n Enter 2 to ADD numbers \n Enter 3 to find Greater or Smaller number \n Enter 4 to find prefix and postfix \n Enter 5 to Enter name");
        a = i.nextInt();
        
        switch(a)
        {
            case 1:
                System.out.println("Enter diameter to find Radius");
                d = i.nextFloat();
                System.out.println("RADIUS IS " + d/2);
                break;
                
            case 2:
                System.out.println("ENTER FIRST NUMBER");
                x = i.nextFloat();
                System.out.println("ENTER SECOND NUMBER");
                y = i.nextFloat();
                System.out.println("ADDITION OF NUMBERS ARE " + (x+y));
                break;
                
            case 3:
                System.out.println("ENTER FIRST NUMBER");
                x = i.nextFloat();
                System.out.println("ENTER SECOND NUMBER");
                y = i.nextFloat();
        
                if (x>y)
            {
                System.out.println("GREATER NUMBER IS " + x);  
            }
                else
            {
                System.out.println("GREATER NUMBER IS " + y);
            } 
                break;
                
            case 4:
                System.out.println("ENTER NUMBER");
                x = i.nextFloat();
                p=--x;
                z=++x;
                System.out.println("PREFIX IS " + p);
                System.out.println("POSTFIX IS " + (++z));
                break;
                
            case 5:
                System.out.println("ENTER NAME ");
                n = i.nextLine();
                System.out.println("NAME IS " + n);
               break; 
               
            default:
                System.out.println("INVALID");
        }     
    }
}