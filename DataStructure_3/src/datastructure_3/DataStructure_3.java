
package datastructure_3;
import java.util.Scanner;

public class DataStructure_3 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
System.out.println("Enter the size of array:");
int s=scan.nextInt();
double [] array = new double[s];
int x,y,z;
System.out.println("Enter " + s +" numbers:-");
for(x=0;x<array.length;x++)
{
array[x] = scan.nextDouble();
}
double sum = 0;
for(x=0;x<array.length;x++)
sum = sum + array[x];

 double mean = sum/s;
System.out.println();
System.out.println("Mean: " + mean);
double p = 0;
 for(x=0;x<array.length;x++)
{
p = p + Math.pow(array[x] - mean, 2);
}
double dev = Math.sqrt(p/(s-1));
System.out.println("Deviation: " + dev);
    }
    
}
