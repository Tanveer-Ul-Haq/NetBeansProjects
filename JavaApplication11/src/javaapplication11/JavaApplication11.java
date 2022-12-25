
package javaapplication11;
import java.util.Scanner;

public class JavaApplication11 {

   // long array[] = new long[3];
    public int limit;
    public long[] array;
    public int top;
    
    public JavaApplication11(int a){
        limit = a;
        array = new long[limit];
        top = -1;
    }
    
     public void push(long b){
        array[++top] = b;
    }
     
    public long pop(){
         return array [top--];
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
   
    public static void main(String[] args) {
        
        JavaApplication11 Stack = new JavaApplication11(5);
        Stack.push(5);
        Stack.push(10);
        Stack.push(15);
        Stack.push(20);
        Stack.push(25);
        
        while (!Stack.isEmpty()){
            long value = Stack.pop();
            System.out.println("The value is: " + value);
            System.out.println(" ");
        }
    }
    
}
