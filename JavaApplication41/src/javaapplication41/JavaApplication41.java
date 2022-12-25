
package javaapplication41;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication41 {
    ArrayList<String> list;
    Scanner scan;
    int n;
    
    void getVal(){
        list = new ArrayList<String>();
        scan = new Scanner(System.in);
        System.out.println("ArrayList (String) - Insert a data");
        
        System.out.println("\nEnter 'n' value : ");
        n = Integer.parseInt(scan.nextLine());
        
        System.out.println("Enter the data : ");
        
        for(int i=0; i<n; i++)
        {
            list.add(scan.next());
        }
    }
    
    void display() {
        System.out.println("\nThe ArrayList");
        if(list.isEmpty())
        {
            System.out.println("ArrayList is Empty...");
        }
        else
        {
            for(int i=0; i<list.size(); i++)
            {
                System.out.println(list.get(i));
            }
        }
    }
    
    void insert(){
        System.out.println("\nEnter the index : ");
        int i = scan.nextInt();
        
        System.out.println("Enter the data : ");
        String item = scan.next();
        
        list.add(i, item);
        display();
    }

    public static void main(String[] args) {
         JavaApplication41 obj = new JavaApplication41();
        
        obj.getVal();
        obj.display();
        
        obj.insert();
    }
    
}
