package javaapplication63;
import  java.util.Arrays;
public class JavaApplication63 
{
       int pi,j;
    void q_sort(int array[],int low,int high)
    {
        if (low<high)
        {
             pi = partition(array, low, high); 
            q_sort(array, low, pi-1); 
            q_sort(array, pi+1, high); 
        }
    }
    
    int partition(int arr[],int low, int high)
    {
        int pivot = arr[high];  
        int i = (low-1);
        for (j=low; j<high; j++) 
        { 
            if (arr[j] < pivot) 
            { 
                System.out.println(low+"\t"+high+"\t"+pi+"\t"+low+"<"+high+"\t\t"+pivot+"\t"+i+"\t"+j+"\t"+"arr["+j+"]"+"<"+pivot+"\t"+arr[i+1]+","+arr[j]+"\tN/A\t"+Arrays.toString(arr));
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            }
                System.out.println(low+"\t"+high+"\t"+pi+"\t"+low+"<"+high+"\t\t"+pivot+"\t"+i+"\t"+j+"\t"+"arr["+j+"]"+"<"+pivot+"\t"+arr[i+1]+","+arr[j]+"\tN/A\t"+Arrays.toString(arr));

        }     
            //System.out.println(low+"\t"+high+"\t"+pi+"\t"+pivot+"\t"+i+"\t"+j+"\t"+"arr["+j+"]"+"<"+pivot+"\tN/A\t"+arr[i]+","+arr[j]+"\t"+Arrays.toString(arr));

        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
        System.out.println(low+"\t"+high+"\t"+pi+"\t"+low+"<"+high+"\t\t"+pivot+"\t"+i+"\t"+j+"\t"+"arr["+j+"]"+"<"+pivot+"\tN/A\t"+arr[i]+","+arr[j]+"\t"+Arrays.toString(arr));

        return i+1; 
    }
    
   
     public static void main(String[] args)
    {
        System.out.println("Low"+"\t"+"High"+"\t"+"pi"+"\t"+"Sort_Condition"+"\t"+"Pivot"+"\t"+"i"+"\t"+"j"+"\t"+"P_condition"+"\t"+"Swap_1"+"\t"+ "Swap_2"+"\t\t"+"Current_Array");
        int arr[] = {10,80,30,90,40,50,70}; 
        int n = arr.length; 
  
        JavaApplication63 ob = new JavaApplication63(); 
        ob.q_sort(arr, 0, n-1);
        
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
        
    }
    
}