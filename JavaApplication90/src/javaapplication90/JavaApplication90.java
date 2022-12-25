
package javaapplication90;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class JavaApplication90 {

    
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList();
        int a;
        String c;
        Scanner i = new Scanner(System.in);
        
        System.out.println("Enter Number of elements: ");
        a = i.nextInt();
        
        System.out.println("Enter elements for arraylist");
        for(int b=0; b<=a; b++)
        {
             c = i.nextLine();
            arrayList.add(c);
        }
        System.out.println("--------------------------------");
        
        System.out.print("Arraylist is: ");
        for(int b=0; b<=a; b++)
        {
              System.out.println(arrayList.get(b));
        }
              System.out.println("----------------------------");
                countFrequencies(arrayList);
    }
    
     public static void countFrequencies(ArrayList<String> list)
    {
        // hashmap to store the frequency of element
        Map<String, Integer> hm = new HashMap<String, Integer>();
  
        for (String i : list) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        // displaying the occurrence of elements in the arraylist
        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println("Element " + val.getKey() + " "
                               + "occurs"
                               + ": " + val.getValue() + " times");
        }
    }
    
}
