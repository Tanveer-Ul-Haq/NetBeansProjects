/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo__1;

import java.util.Scanner;

/**
 *
 * @author tanve
 */
public class Demo__1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner i = new Scanner(System.in);
        int a;
        System.out.println("Enter Number for Square root");
        a = i.nextInt();
        System.out.println(sqrt(a));
    }
    
}
