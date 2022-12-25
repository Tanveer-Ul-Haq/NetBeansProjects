
package functionoverloading;
import java.util.Scanner;

public class FunctionOverloading {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int x,y,z;
        System.out.println("ENTER NUMBER");
        x = i.nextInt();
        System.out.println("ENTER NUMBER");
        y = i.nextInt();
        int sum = calculator(x,y);
        double m=x;
        double n=y;
        System.out.println("SUM IS = " + sum);
        double diff = calculator(m,n);
        System.out.println("DIFFERENCE IS " + diff);
    }
    public static int calculator(int a,int b)
    {
        int sum;
        sum = a+b;
        return sum;
    }        
     public static double calculator(double c,double d)
    {
        double diff;
        diff = c-d;
        return diff;
    }      
}
