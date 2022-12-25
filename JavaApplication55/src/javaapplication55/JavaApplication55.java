
package javaapplication55;

import java.io.*; 
  
public class JavaApplication55{ 
      
    static void series(int A, int X, int n) 
    { 
          
        
        int term = (int)Math.pow(A, n); 
        System.out.print(term + " "); 
  
        for (int i = 1; i <= n; i++) { 
  
            term = term * X * (n - i + 1)  
                                / (i * A); 
  
            System.out.print(term + " "); 
        } 
    } 
  
    public static void main(String[] args) {
        
         int A = 3, X = 4, n = 5; 
          
        series(A, X, n); 
    }
    
}
