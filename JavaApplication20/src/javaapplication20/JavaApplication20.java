
package javaapplication20;

public class JavaApplication20 {
    
    public static void main(String[] args) {
        
          int count_true=0,count_false=0,i; 
        int arr[]={80,63,4,7,81,539,70,21,2,42};
        for (i = 0; i < arr.length; i++) 
        {
            if (arr[i]==arr[0])
            {
                arr[i]=80;
            }
            else if(arr[i]==arr[4])
            {
                arr[i]=81;
            }         
        }
        int temp,m;        
        boolean flag;
        System.out.println("i"+"\t"+"Value"+"\t"+"Hole"+"\t"+"Condition"+"\t\t"+"State/Boolen");
        
        for (i = 1; i < arr.length; i++)
        {
            flag=false;
            count_false++;
            temp=arr[i];
            m=i;
            
            System.out.println(i+"\t"+temp+"\t"+(m)+"\t"+m+">"+"0"+" && "+"arr["+(m-1)+"]"+">"+temp+"\t\t"+flag);
            

            while(m>0 && arr[m-1]>temp)
            {
                flag=true;
                count_true++;
                arr[m]=arr[m-1];
                m=m-1;
                System.out.println(i+"\t"+temp+"\t"+(m)+"\t"+m+">"+"0"+" && "+"arr["+(m-1)+"]"+">"+temp+"\t\t"+flag);
                
                //System.out.println(j+">"+"0"+" && "+"arr["+(j-1)+"]"+">"+temp);
            }           
            arr[m]=temp;
            
            
            
        }
        System.out.println("Total Iteration : "+(count_true+count_false));
        System.out.println("True Iteration : "+count_true);
        System.out.println("False Iteration : "+count_false);
        for (i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"\t");
        }
        
        
        
    }
    
}