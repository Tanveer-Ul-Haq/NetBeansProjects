/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication86;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author tanve
 */
public class JavaApplication86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int counter=1;
       ArrayList<String> arr = new ArrayList<String>(Arrays.asList("tanveer", "ali hassan", "arslan islam", "ali hassan", "usman hassan", "ali hassan"));
       // Arrays.sort(arr);
        for(int x=0;x<=arr.size();x++)
        {
    //        for(int y=0;y<=arr.length;y++)
            {
    //            if(arr[x].charAt(0)==arr[y].charAt(0))
              //  if (arr[x].equals(arr[y]))
             // if(diff>0)
                {
                  //  arr.split(" ");
                  String element = arr.get(x);
                  for(int i=0;i<=element.length();i++)
    {
               char c=element.charAt(i);
                 if(c==' ')
                  System.out.println(i);
                 {
              //       i++;
     //                 if(arr[x].charAt(i)==arr[y].charAt(i))
                      {
                   //       System.out.println(arr[x]+" "+(counter++));
                   //    break;
                      }
                 }
                 }
                }
               // if(x==y)
            //    else 
           //     {
           //         counter=1;//x++;
            //        System.out.println(arr[x]+" "+(counter++));
           //     }
            }
                
        }
    /*   String input= "ali hassan";
       String arslan = "arslan islam";
       for(String name:arr)
       {
           
               
               for(int x=0;x<=arr.length;x++)
               {
                   if(name.equals(input))
                   {
                        System.out.println(arr[x]+" "+counter);
                        counter++;
                        input.Count();
                   }
                   else
                   {
                       counter=1;
                   }
               }
       }*/
        
    /*   for (int i = 0; i < arr.length; i++)
        {
 
            // Move the index ahead while
            // there are duplicates
            while (i < arr.length -1 &&
                    arr[i] != arr[i + 1])
            {
                System.out.println(arr[i]);
                i++;
            }
            counter++;
            System.out.println(arr[i]+" "+counter);
        }*/
  /*  String[] array = {"tanveer", "ali hassan", "arslan islam", "ali hassan", "usman hassan", "ali hassan"};
    Arrays.sort(array);
List<String> sampleList=(List<String>) Arrays.asList(array);
for(String input:array){
int frequency=Collections.frequency(sampleList,input);
System.out.println(input+" "+frequency);
}*/
 /* HashMap<String, Integer> map = new HashMap<String, Integer>();
        Integer count = 0;
        String first = arr[0];
        for( int counter = 0; counter < arr.length; counter++ ) {
            if(first.hashCode() == arr[counter].hashCode()) {
                count = count + 1;
            } else {
                map.put(first, count);
                count = 1;
            }
            first = arr[counter];
            map.put(first, count);
        }

*/
    }
    
}
