
package javaapplication16;


public class JavaApplication16 {

    void sort (int arr[])
    {
        boolean flag;
        int n = arr.length;
        System.out.println("I" + "\t" + "Value" + "\t" + "Hole" + "\t" + "State");
        for(int i=1; i<n; ++i)
        {
            flag =false;
            int key = arr[i];
            int j = i-1;
            
                 if (flag=false)
                {
                    System.out.println(i + "\t" + arr[i] + "\t" + j + "\t" + flag);
                }
            
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1] = key;
            
            flag =true;
           
            {
               if (flag == true)
             {
         //        System.out.println((i) + " " + (arr[i]) + " " + (j));
             }   
            }  
        }
    }
    
    static void Printarray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        int arr[] = {12, 45, 50, 25, 35, 10, 15};
        
        JavaApplication16 Insertion_Sort = new JavaApplication16();
        Insertion_Sort.sort(arr);
        Printarray(arr);
    }
    
}
