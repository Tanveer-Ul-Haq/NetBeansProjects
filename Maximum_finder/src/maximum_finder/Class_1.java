
package maximum_finder;

import java.util.Scanner;

/**
 *
 * @author tanve
 */
public class Class_1 {
    
    public void maximum_value()
    {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter 3 values floating by spaces ");
        double N_1 = i.nextDouble();
        double N_2 = i.nextDouble();
        double N_3 = i.nextDouble();
      //  double result = maximum(N_1,N_2,N_3);
     //   System.out.println("Maximum Number is "+ result);
        
        double w = Math.max(N_1, N_2);
        double abc = Math.max(w, N_3);
        System.out.println("Maximum Value is "+ abc);
        
    }
}
