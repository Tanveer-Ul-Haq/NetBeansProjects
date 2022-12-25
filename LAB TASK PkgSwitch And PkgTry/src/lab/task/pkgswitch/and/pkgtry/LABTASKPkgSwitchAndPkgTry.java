
package lab.task.pkgswitch.and.pkgtry;
import java.util.Scanner;

public class LABTASKPkgSwitchAndPkgTry {

    static int x = 0;

    void display() {
        x = x + 1;
        System.out.println("Increment is " + x);
    }
   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = input.nextByte();

        switch (number) {
            case 1:
                try {
                    System.out.println("Enter numbers to divide ");
                    int a = input.nextInt();
                    int b = input.nextInt();
                    double c = a / b;

                } catch (ArithmeticException e) {
                    System.out.println("Divide by zero " + e);
                }
                break;
            case 2:
                System.out.println("Enter numbers ");
                int y = input.nextInt();
                int[] primes = new int[5];
                try {
                    for (int i = 0; i < 5; i++) {
           
                        primes[i] = input.nextInt();

                    }
                    System.out.println("Enter number ");
                    y = input.nextInt();
                    System.out.println(primes[y]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Number does not exist ");

                }
                break;
            case 3:
                try {
                    System.out.println("Enter any integer ");
                    int z = input.nextInt();
                } catch (Exception e) {
                    System.out.println("Incorrect DataType ");
                }
                break;

            case 4:
                try {
                    LABTASKPkgSwitchAndPkgTry obj = new LABTASKPkgSwitchAndPkgTry();
                    LABTASKPkgSwitchAndPkgTry obj1 = new LABTASKPkgSwitchAndPkgTry();
                    LABTASKPkgSwitchAndPkgTry obj2 = new LABTASKPkgSwitchAndPkgTry();

                    obj.display();
                    obj1.display();
                    obj2.display();
                    System.out.println("Static variable is "+obj.x);
                    System.out.println("Static variable is "+obj1.x);
                    System.out.println("Static variable is "+obj2.x);

                } catch (Exception e) {
                    System.out.println("Error occured " + e);
                }
                break;
        }
    }
    
}
