
package find_number_from_numbers;
import java.util.Scanner;

public class Find_number_from_numbers {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        int x, count=0;
        int a;
        System.out.println("Enter number for search:  ");
        x=sc.nextInt();
        System.out.println("Enter 20 numbers: ");
        for(int b=0;b<=19;b++)
        {
            a=sc.nextInt();
            while(a>0){
            int rem = a%10;
            if(rem == x)
                count++;
            a /= 10;
        }
        
    }
    System.out.println("Number of occurences of a digit: "+count);
    }
    
}
