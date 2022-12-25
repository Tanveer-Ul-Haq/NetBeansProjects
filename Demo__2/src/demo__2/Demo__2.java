/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo__2;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author tanve
 */
class Demo__2 {

    /**
     * @param args the command line arguments
     */
    public int x,a;
   
    public  String z;
    
    public void input()
    {
        int roll_no,mark_1,mark_2,mark_3,total;
        String str;
        Scanner i = new Scanner(System.in);
        System.out.println("Enter Name: ");
        z = str = i.nextLine();
        System.out.println("Enter Roll No: ");
        x = roll_no = i.nextInt();
        System.out.println("Enter marks of physics: ");
        mark_1 = i.nextInt();
        System.out.println("Enter marks of Math: ");
        mark_2 = i.nextInt();
        System.out.println("Enter marks of English: ");
        mark_3 = i.nextInt();
        total = mark_1 + mark_2 + mark_3;
        a=total;
     //   System.out.println(a);
        
    }
    
    public void show()
    {
        int roll_no =x;
     //   int mark = a;
        String str =z;
        System.out.println("Name of student is: "+str);
        System.out.println("Roll No. of student: "+ roll_no);
        
    }
    
    public void total()
    {
        System.out.println("Total Marks of Student is: "+a);
      //  total_1 =a;
    }
    
    public static void main(String[] args) {
        
        
        Demo__2 obj =new Demo__2();
        
        obj.input();
  //      String str= "";
   //     int a=0,b=0;
        obj.show();
        
       // int total=0;
        obj.total();
        
    }
    
}
