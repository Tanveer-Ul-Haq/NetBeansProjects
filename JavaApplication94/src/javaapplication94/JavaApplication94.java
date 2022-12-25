
package javaapplication94;


public class JavaApplication94 {

    
    public static void main(String[] args) {
        
        int a=0,b=1,c;
        System.out.println(a+"\n"+b);
        for(int d=1;d<=50;d++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
    
}
