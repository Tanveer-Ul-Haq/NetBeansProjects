
package javaapplication39;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication39 {
     ArrayList<Float> list;
    Scanner scan;
    int n;
    
    void getVal(){
        list = new ArrayList<Float>();
        scan = new Scanner(System.in);
        System.out.println("ArrayList (Float) - Create and Insert");
        
        System.out.println("\nEnter 'n' value : ");
        n = Integer.parseInt(scan.nextLine());
        
        System.out.println("Enter the data : ");
        
        for(int i=0; i<n; i++)
        {
            list.add(scan.nextFloat());
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
    
    public static void main(String[] args) {
        JavaApplication39 obj = new JavaApplication39();
        
        obj.getVal();
        obj.display();
    }
    
}
