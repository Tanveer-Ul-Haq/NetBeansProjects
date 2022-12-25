
package functions;
import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a,b,c,d,e,f;
        System.out.println("ENTER NUMBER");
        a = i.nextInt();
        System.out.println("ENTER NUMBER");
        b = i.nextInt();
        c = div(a,b);
        System.out.println(c);
        d = multi(a,b);
        System.out.println(d);
        e = add(a,b);
        System.out.println(e);
        f = sub(a,b);
        System.out.println(f);
       
    }
    public static int add( int a , int b) {
         int add;
         System.out.println("SUM OF NUMBERS");
        add = a+b;
        return add;
    }
    
    public static int sub(int a, int b){
        int sub;
        System.out.println("SUBTRACTION OF NUMBERS");
        sub = a-b;
        return sub;
    }
    
     public static int div(int a, int b){
        int div;
        System.out.println("DIVISION OF NUMBERS");
        div = a/b;
        return div;
    }
     
      public static int multi(int a, int b){
        int multi;
        System.out.println("MULTIPLICATION OF NUMBERS");
        multi = a*b;
        return multi;
    }
}
