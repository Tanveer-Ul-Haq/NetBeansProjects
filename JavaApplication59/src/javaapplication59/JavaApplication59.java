package javaapplication59;
import java.util.Scanner;

interface Calculation
{
    abstract void math();
    Scanner input= new Scanner(System.in);
}

class Tips implements Calculation
{
    public void math()
    {
        System.out.print("Enter the value of Xi:");
        float Xi=input.nextFloat();
        System.out.print("Enter Value of Meu :");
        float u=input.nextFloat();
        System.out.print("Enter the Value of N :");
        float N=input.nextFloat();
        double a=Math.pow((Xi-u),2.0);
        System.out.println("Press 1 for Finding Standard Deviation \nPress 2 For Exit");
        int choice=input.nextInt();
        switch(choice)
        {
            case 1:
            {
                if(N!=0)
                {
                    if(a>0)
                    {
                        double pdev=Math.sqrt(a/N);
                        System.out.println(pdev);
                    }
                }
                else
                {
                    System.out.println("Invalid Input: You Entered N="+N);
                }
                break;
            }
            case 2:
            {
                System.out.println("\r");
                break;
            }
            default:
            {
                System.out.println("Invald option");
            }
                    
            
        }
    }
           
    
}

class Reward implements Calculation
{
    public void math()
    {
        System.out.println("Press 1 for Total marks \nPress 2 for Average marks \nPress 3 for Percentage");
        int ch=input.nextInt();
        switch(ch)
        {
            case 1:
            {
                System.out.println("Enter your number of Subjects e.g 5,6,8 etc");
                int array_lim =input.nextInt();
                int array2[] = new int[array_lim];
                int sum=0;
                System.out.println("Enter your Marks out of 100 by pressing enter");
                for(int i=0;i<array2.length;i++)
                {
                    array2[i]=input.nextInt();                 
                }
                for( int num : array2)
                {
                   sum = sum+num;
                }
                System.out.println("Sum of Your Marks  is:" + sum);
            }
            case 2:
            {
                System.out.println("Enter your total subjects");
                int sub=input.nextInt();
                System.out.println("Enter your total marks");
                int mar=input.nextInt();
                int avg=sub/mar;
                System.out.println("Your Average Marks are:" + avg);
                
                break;
            }
            case 3:
            {
                System.out.println("Enter your marks");
                int mar=input.nextInt();
                System.out.println("Enter total marks of paper");
                int papr=input.nextInt();
                double perct=(mar/papr)*100;
                System.out.println("your Percentage is " + perct);
                break;
            }
        }
        
    }
}


public class JavaApplication59 
{
    public static void main(String[] args)
    {
        Tips t=new Tips();
        t.math();
        Reward r=new Reward();
        r.math();
    }    
}