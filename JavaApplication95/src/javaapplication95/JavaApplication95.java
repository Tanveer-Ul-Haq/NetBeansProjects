package javaapplication95;
import java.util.Scanner;

public class JavaApplication95
{

    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        System.out.println("User Thread");
        int a=1; int b=3;
        System.out.println("1 Sum\n2 Sub\n3 Mul");
        int ch=input.nextInt();
        switch(ch)
        {
            case 1:
            {
                int sum = kernel1(a,b);
                System.out.println(sum);
                break;
            }
            case 2:
            {
                int sub = kernel2(a,b);
                System.out.println(sub);
                break;
            }
            case 3:
            {
                int Mul = kernel3(a,b);
                System.out.println(Mul);
                break;
            }
        }
       
        
      
    }
    public static int kernel1(int a, int b)
    {
        int sum=a+b;
        return sum;
    }
    public static int kernel2(int a, int b)
    {
        int sub=a-b;
        return sub;
    }
     public static int kernel3(int a, int b)
    {
        int mul= a*b;
        return mul;
    }
     
}
