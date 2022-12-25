
package javaapplication42;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication42 {
    ArrayList<String> list;
    Scanner scan;
    int n;
    
    void getVal(){
        list = new ArrayList<String>();
        scan = new Scanner(System.in);
        System.out.println("ArrayList (String) - delete all data");
        
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
    
    void delete(){
        System.out.println("\nDo you want to delete all? (y/n)");
        String result = scan.next();
       
        if (result.equalsIgnoreCase("y"))
            list.clear();
        display();
    }

    public static void main(String[] args) {
         JavaApplication42 obj = new JavaApplication42();
        
        obj.getVal();
        obj.display();
        
        obj.delete();
    }
    
}
