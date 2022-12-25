
package ashape;

import java.util.Scanner;

public class Ashape {

    public static void main(String[] args) {
        
        	for(int a=1;a<=7;a++)
	{
		for(int b=1;b<=15;b++)
		{
			if (a==1 && b==6 || a==2 && b==5 || a==2 && b==7 || a==3 && b==4 || a==3 && b==8 || a==4 && b==4 || a==4 && b==5 || a==4 && b==6 || a==4 && b==7 || a==4 && b==8 || a==5 && b==3 || a==5 && b==9 || a==6 && b==2 || a==6 && b==10 || a==7 && b==1 || a==7 && b==11)
			{
		                          System.out.print("#");
			}
			else
			{
			                         System.out.print(" ");
			}
		}
		          System.out.println("\n");
    }
    }
    
}
