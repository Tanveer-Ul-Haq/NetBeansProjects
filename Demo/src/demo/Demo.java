
package demo;


public class Demo {

    public static void main(String[] args) {
        int count_H =0, count_T=0;
        for(int a=0; a<=199; a++)
        {
            for(int b=0; b<=24; b++)
            {
                
                {
                    System.out.print("H ");
                    count_H++;
                }
                
                System.out.print("T ");
                count_T++;
            }
            System.out.println("");
                
        }
            System.out.println("Number of Heads: "+ count_H);
            System.out.println("Number of Tails: "+ count_T);  
    }
    
}
