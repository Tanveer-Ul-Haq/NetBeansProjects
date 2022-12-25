
package javaapplication7;
import java.util.Random;

public class JavaApplication7 {

    static Random randNum = new Random();
    public static void main(String[] args) {
        
        System.out.println("Lowercase random letters...");
      for (int i = 0; i < 100; i++) {
         System.out.print("" + "abcdefghijklmnopqrstuvwxyz".toCharArray()[randNum.nextInt("abcdefghijklmnopqrstuvwxyz".toCharArray().length)]);
         System.out.print("\t");
      }
        System.out.println("");
    //  System.out.println("Uppercase random letters...");
   ///   for (int i = 0; i < 5; i++) {
   //      System.out.println("" + "ABCDEFGHIJKLMNOPQRSTUVWZYZ".toCharArray()[randNum.nextInt("ABCDEFGHIJKLMNOPQRSTUVWZYZ".toCharArray().length)]);
    //  }
      
  /*    int [] userarray = new int[100];
      int max = 0;
      int maxcounter =0;
      for(int k=0;k<userarray.length;k++)
      {
      if(max == userarray[k])
      {
      maxcounter++;
      }
      }
      System.out.println("Max number is: " + max);
      System.out.println("Occurence " + maxcounter + " times");
        */
   
  /*    
//  getOccuringChar(str); 
      int count[] = new int[256];
int len = str.length();
// Initialize count array index
for (int i = 0; i < len; i++)
count[str.charAt(i)]++;

for(int i=0; i< count.length; i++) {
if(count[i] > 0) {
char ch = (char) i;
System.out.println("Number of Occurrence of " + ch + " is:" + count[i]);
}
}*/
      
   /*     int len = str.length(); 
  
        // Initialize count array index 
        for (int i = 0; i < len; i++) 
            count[str.charAt(i)]++; 
  
        // Create an array of given String size 
        char ch[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = str.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
  
                // If any matches found 
                if (str.charAt(i) == ch[j])  
                    find++;                 
            } 
  
            if (find == 1)  
                System.out.println("Number of Occurrence of " + 
                 str.charAt(i) + " is:" + count[str.charAt(i)]);             
        } 
    
*/
    }
    
}
