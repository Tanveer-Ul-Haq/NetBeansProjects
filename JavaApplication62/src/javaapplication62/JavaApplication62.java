
package javaapplication62;
import java.util.Arrays;

public class JavaApplication62 {

    int pi,j;
  int partition(int array[], int low, int high) {

    int pivot = array[high];
    int i = (low - 1);

    for (j = low; j < high; j++) {
      if (array[j] <= pivot) {
          System.out.println(low+"\t"+high+"\t"+pi+"\t\t"+low+"<"+high+"\t"+pivot+"\t"+i+"\t"+j+"\t"+"arr["+j+"]"+"<"+pivot+"\t"+array[i+1]+","+array[j]+"\t"+"N/A"+"\t"+Arrays.toString(array));

        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
        System.out.println(low+"\t"+high+"\t"+pi+"\t\t"+low+"<"+high+"\t"+pivot+"\t"+i+"\t"+j+"\t"+"arr["+j+"]<"+pivot+"\t"+array[i+1]+","+array[j]+"\t"+"N/A"+"\t"+Arrays.toString(array));

    }

    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;
        
        System.out.println(low+"\t"+high+"\t"+pi+"\t\t"+low+"<"+high+"\t"+pivot+"\t"+i+"\t"+j+"\t"+"arr["+j+"]<"+pivot+"\t"+"N/A"+"\t"+array[i]+","+array[high]+"\t"+Arrays.toString(array));

    return (i + 1);
    
  }

  void quickSort(int array[], int low, int high) {
    if (low < high) {

       pi = partition(array, low, high);
       
      quickSort(array, low, pi - 1);

      quickSort(array, pi + 1, high);
    }
  }

    
    public static void main(String[] args) {
        
    int[] data = { 10, 80, 30, 90, 40, 50, 70 };
    int size = data.length;

    JavaApplication62 qs = new JavaApplication62();
      
    System.out.println("Low"+"\t"+"High"+"\t"+"PI"+"\t"+"Sort_Condition"+"\t"+"Pivot"+"\t"+"I"+"\t"+"J"+"\t"+"P_Condition"+"\t"+"Swap_1"+"\t"+"Swap_2"+"\t"+"Current Array");
        
    qs.quickSort(data, 0, size - 1);
    System.out.println("Sorted Array: ");
    System.out.println(Arrays.toString(data));
        
    }
    
}
