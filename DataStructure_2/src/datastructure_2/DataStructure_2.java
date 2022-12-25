
package datastructure_2;
import java.util. Scanner;

public class DataStructure_2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
int [] array = new int[8];
int a;
System.out.println("Enter marks of 8 students:");
for(a=0;a<array.length;a++)
{
array[a] = scan.nextInt();
}
        int max=array[0];
        for(a=0;a<array.length;a++){
        if (array[a]>max){
        max=array[a];
        }
        }
        System.out.println("Maximum numbers are "+ max);

    if(max>=90 & max<=100)
{
    System.out.println("Grade is A");
}
    else if(max>=80 & max<90)
{
System.out.println("Grade is B");
}
    else if(max>=70 & max<80)
{
System.out.println("Grade is C");
}
    else if(max>=60 & max<70)
{
System.out.println("Grade is D");
}
    else if(max<60 & max>0)
{
System.out.println("Grade is F");
}
    else if(max>100 | max<0)
{
System.out.println("INVALID Entry");
}
    }
    
}
