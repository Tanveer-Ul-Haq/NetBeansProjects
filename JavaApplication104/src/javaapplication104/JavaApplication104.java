
// LRU in paging
package javaapplication104;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication104 {

    
    public static void main(String[] args) {
        
        int capacity = 4;
        System.out.println("Enter numbers to find page fault");
        Scanner a= new Scanner(System.in);
        int arr[] = new int [13];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=a.nextInt();
        }
       // int arr[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2};
         
        // To represent set of current pages.We use
        // an Arraylist
        ArrayList<Integer> s=new ArrayList<>(capacity);
        int count=0;
        int page_faults=0;
        for(int i:arr)
        {
            // Insert it into set if not present
            // already which represents page fault
            if(!s.contains(i))
            {
             
            // Check if the set can hold equal pages
            if(s.size()==capacity)
            {
                s.remove(0);
                s.add(capacity-1,i);
            }
            else
                s.add(count,i);
                // Increment page faults
                page_faults++;
                ++count;
         
            }
            else
            {
                // Remove the indexes page
                s.remove((Object)i);
                // insert the current page
                s.add(s.size(),i);        
            }
         
        }
        System.out.println("Number of page faults in given array list");
        System.out.println(page_faults);
    }
    
}
