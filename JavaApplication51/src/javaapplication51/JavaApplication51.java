
package javaapplication51;
import java.util.Scanner;

public class JavaApplication51 {

    
    public static void main(String[] args) {
        
        Scanner u=new Scanner(System.in);
        System.out.println("Enter values for Deviation");
        double[] numArray = new double[10];
        for(int i=0;i<numArray.length;i++){
            
            numArray[i]=u.nextDouble();
        }
        
        
        double SD = calculateSD(numArray);

        System.out.format("Standard Deviation = %.6f", SD);
    }

    public static double calculateSD(double numArray[])
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;

        for(double num : numArray) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
    
}
