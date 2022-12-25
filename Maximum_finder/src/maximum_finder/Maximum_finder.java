/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximum_finder;

import java.util.Scanner;

public class Maximum_finder {

    public static void main(String[] args) {
        
        Maximum_finder obj = new Maximum_finder();
        
        obj.maximum_value();
        obj.maximum();
        
    }
    
    public double N_1,N_2,N_3;
    public double result;
    
    public void maximum_value()
    {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter 3 values floating by spaces ");
        double N_1 = i.nextDouble();
        double N_2 = i.nextDouble();
        double N_3 = i.nextDouble();
     //   double result = maximum();
     //   System.out.println("Maximum Number is "+ result);
    }
    
    public void maximum()
    {
        double w = Math.max(N_1, N_2);
        double abc = Math.max(w, N_3);
        System.out.println("Maximum Value is "+abc);
    }
}
