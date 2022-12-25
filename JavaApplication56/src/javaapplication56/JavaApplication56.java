
package javaapplication56;
import java.util.Scanner;
import java.lang.Math;

public class JavaApplication56 {

    
    public static void main(String[] args) {
        
        int x;
		double seriesSum = 0.0;
		double totalSum = 0.0;

		Scanner myInput = new Scanner( System.in );

		try{
			System.out.print( "Enter the value of x: ");
			x = myInput.nextInt();

			System.out.println( "Calculating the given series for x: " + x);
			for( int i = 2; i <= 79; i++ ){
				seriesSum = seriesSum + ( 1 / Math.pow( x , i ) );
			}
			totalSum = x + seriesSum;

			System.out.println( "Value of totalSum is: " + totalSum );
		}
		catch(Exception e){
			System.out.println( e );
		}
    }
    
}
