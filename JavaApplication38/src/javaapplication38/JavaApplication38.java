
package javaapplication38;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication38 {
    ArrayList<Integer> list;
    Scanner scan;
    int n;
    
    void getVal(){
        list = new ArrayList<Integer>();
        scan = new Scanner(System.in);
        System.out.println("ArrayList (Integer) - Create and Insert");
        
        System.out.println("\nEnter 'n' value : ");
        n = Integer.parseInt(scan.nextLine());
        
        System.out.println("Enter the data : ");
        
        for(int i=0; i<n; i++)
        {
            list.add(scan.nextInt());
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
        JavaApplication38 obj = new JavaApplication38();
        
        obj.getVal();
        obj.display();
    }
    
}
