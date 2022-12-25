
package javaapplication8;
import java.util.Random;

public class JavaApplication8 {
    
    public static void main(String[] args) {

      char[] characters=new char[100];
      char[] chars = RandomArray();
        int i;
        int sum=0;
        
     System.out.println("The lowercase letters are:");
      displayArray(chars);
        
        for ( i=0;i<characters.length;i++)
        {
            characters[i]=(char)('a' + Math.random() * ('z' - 'a') );      
        }
        
       int[] counts = countLetters(characters);
        System.out.println("Occurance count: ");
        
            for ( i = 0; i < counts.length; i++) {    
      if ((i + 1) % 10 == 0){
        System.out.println(counts[i] + " " + (char)(i + 'a'));}
      else{
        System.out.println(counts[i] + " " + (char)(i + 'a') + " ");}
      sum=counts[i]+sum;  
    }
            double mean=sum/counts.length;
            double std_dev=0;
            double sub=0;
            for(i=0;i<counts.length;i++){
            sub=sub+Math.pow(counts[i]-mean,2);
            }
            std_dev=Math.sqrt(sub/counts.length);
            System.out.println("\nMean of the counts is "+mean);
            System.out.println("Standard Deviation of the counts is "+std_dev);
         }
     public static int[] countLetters(char[] chars) {
    int[] counts = new int[26];
    for (int i = 0; i < chars.length; i++)
      counts[chars[i] - 'a']++;
return counts;


    }
    
     
     public static char[] RandomArray() {

     char[] chars = new char[100];

     Random generator = new Random();

     // Create lowercase letters randomly

     String S ="abcdefghijklmnopqrstuvwxyz";

     for (int i = 0; i < chars.length; i++)

       chars[i] = (char) S.charAt(generator.nextInt(26));

     // Return the array

    return chars;
     }
     
     // Display the array of characters 
     
        public static void displayArray(char[] chars) {

     for (int i = 0; i < chars.length; i++) {
       if ((i + 1) % 20 == 0)
       {
         System.out.println(chars[i] + " ");
       }
       else
       {
        System.out.print(chars[i] + " ");
       }
            }
        }
}
