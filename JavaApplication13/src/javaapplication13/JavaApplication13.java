
package javaapplication13;
import java.util.Arrays; 

public class JavaApplication13 {

    public static void main(String[] args) {
        
        int a,b,min,temp=0;
        int arr[] = new int [5];
         arr[0]=1;arr[1]=2;arr[2]=5;arr[3]=3;arr[4]=4;
         
         for(a=0;a<=arr.length-1;a++)
         {
             min = a;
             for (b=a+1;b<=arr.length-1;b++)
             {
                 if(arr[b]>arr[min])
                 {
                     min = b;
                 }
                 
                  if (temp == arr[a] && arr[a] == arr[b])
                 {
                      arr[b] = temp;
                 }
                  System.out.println(temp);
             }
         }
         
      
    /*  int[] array_nums = {20,40,30};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int x = array_nums[0];
	array_nums[0] = array_nums[array_nums.length-1];
	array_nums[array_nums.length-1] = x;
	System.out.println("New array after swaping the first and last elements: "+Arrays.toString(array_nums));
      */
    }
    
}
