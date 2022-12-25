
package datastructure_1;
import java.util.Scanner;

public class DataStructure_1 {
    
    public static void main(String[] args) {
        
        Scanner i = new Scanner(System.in);
int [] array = new int[6];
int x,y,z;
int max = 0,count =0;
System.out.println("Enter 6 integers:");
for(x=0;x<array.length;x++)
{
array[x] = i.nextInt();
}

 for(y=0;y<array.length;y++)
{
if(max<array [y])
{
max = array[y];
}
}
for(z=0;z<array.length;z++)
{
if(max == array[z])
{
count++;
}
}
System.out.println("Maximum number is: " + max);
System.out.println("Occurence of maximum number is " + count );

    }
}
