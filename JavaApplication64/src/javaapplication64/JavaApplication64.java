package javaapplication64;
import java.util.Arrays;
public class JavaApplication64 {
    
    int partition(int arr[], int Low, int High){
    int pivot = arr[High];
    int i = (Low-1);
    for(int j=Low; j<High; j++)
    {   
        if (arr[j]<pivot)
        {
        i++;
        int a= arr[i];
        arr[i]=arr[j];
        arr[j]= a;
         
        
        }
    
    }
    int a= arr[i+1];
        arr[i+1]=arr[High];
        arr[High]= a;
        return i+1;
    
    }
    
    void sort(int arr[], int Low, int High){
    int pivot = arr[High];
    int i = (Low-1);
  if(Low<High){
      int pi=partition(arr, Low, High);   
  for(int j=Low; j<High; j++)
    {       
  System.out.println(Low+"\t"+High+"\t"+pi+"\t"+Low+"<"+High+"\t  \t"+pivot+"\t"+(i+1)+"\t"+j+"\tarr["+j+"]<"+pivot+"\t"+arr[j]+","+arr[Low]+"\t"+arr[High]+"\t"+Arrays.toString(arr));
    }
  sort(arr,Low,pi-1);
  sort(arr,pi+1,High);
  
    
  }

    }
    
    
  static void SortedArray(int arr[]){
  int n= arr.length;
  for(int i=0;i<n;++i){
      
      System.out.print(+arr[i]+" ");
  
  }
 

  
  }
 
    public static void main(String[] args) {
        
        System.out.println("Low" + "\tHigh"+"\tpi"+"\tSort_Condition" +"\tPivot"+"\ti"+"\tj"+"\tP_Condition"+"\tSwap_1"+"\tSwap_2"+"\tCurrent_Array");
      
        int arr[]={10,90,77,50,80,30,40};
    int n= arr.length;
    JavaApplication64 obj=new JavaApplication64();
    obj.sort(arr,0,n-1);
        System.out.println("\nSorted Array");
   System.out.print("{ ");
        SortedArray(arr); 
    System.out.print("}");
   
    }
    
}