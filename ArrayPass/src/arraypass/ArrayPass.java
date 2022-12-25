
package arraypass;
import java.util.Scanner;

public class ArrayPass {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("ENTER 10 NUMBERS");
        for(int a=0; a<arr.length; a++)
        {
            arr[a]= i.nextInt();
        }
        int b = array_function(arr);
        System.out.println("SUM OF NUMBERS = " + b);
        
        
    }
    
    public static int array_function(int x[])
    {
         int sum=0;
       
        for(int b=0;b<x.length;b++)
        {
            sum = sum + x[b];
        }
        
        return sum;
    }        
}
