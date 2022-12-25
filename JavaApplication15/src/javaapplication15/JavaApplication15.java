
package javaapplication15;
import java.io.*;

public class JavaApplication15 {
public static void BubbleSort(int[] arr, int n){ 
    
     boolean flag;
     int i, index, j; 
        for (i = 0; i < n-1; i++)  
        {  
             flag =false;
            for (j = 0; j < n-i-1; j++){ 
                index = j+1;
                if (arr[j] > arr[index]){  
                    
                    int swap = arr[index];   
            arr[index] = arr[i];  
            arr[i] = swap;  
            
             flag = true;
                }  
            }  
            
            if (flag == false)
                break;
        }  
    }  
    
static void printArray(int arr[], int size)
{
    int i;
    for(i=0;i<size;i++)
    {
        System.out.print(arr[i] + " ");
     //   System.out.println("");
    }
}

    public static void main(String[] args) {
        
         int[] arr1 = {15,14,3,1,43,28,58,22};  
     
        BubbleSort(arr1,arr1.length); 
        
        printArray(arr1,arr1.length);
      //  for(int i:arr1){  
          //  System.out.print(i+" ");  
      //  }  
    }
    
}
