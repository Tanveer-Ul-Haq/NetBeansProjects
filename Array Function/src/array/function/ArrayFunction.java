
package array.function;
import java.util.Scanner;

public class ArrayFunction {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("ENTER 10 NUMBERS");
        for(int a=0; a<arr.length; a++)
        {
            arr[a]= i.nextInt();
        }
        int sum=0;
        System.out.println("SUM OF NUMBERS");
        for(int b=0;b<arr.length;b++)
        {
            sum = sum + arr[b];
        }
        System.out.println(sum);
        
    }
    
}
