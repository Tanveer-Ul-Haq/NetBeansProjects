
package javaapplication19;


public class JavaApplication19 {

     void sort ( int x[], int n ){
        boolean flag;
        n= x.length;
       
         System.out.println("I"+" "+ "Value"+" "+" Hole" + " "+ " Condition "+" "+" State");
        for (int i=0 ; i<n;i++){
            int value = x[i];
            int hole = i;
            while(hole >0 && x[hole-1]>value){
                x[hole]=x[hole-1];
                hole = hole-1;
                ////////////////////////////
                flag=true;
                if (flag==true){
                  int z = 0;
                  if(hole == 0){
                      flag = false;
                  }
                    System.out.println(i+"   "+ value+"      "+ hole + "    "+ hole + ">"+  z+"&&"+(hole-1)+"    "+ flag);
                    
                    
                }
                
            }
            flag = false;
            x[hole]=value;
        }
        
    }
    

   
    public static void main(String[] args) {
        
        JavaApplication19 i = new JavaApplication19();
        int arr[] = {80,63,4,7,81,539,70,21,2,42};
        int size=arr.length;
        i.sort(arr, size);
        
        System.out.println("\n\n\nsorted array \n\n");
        
        for ( int j = 0 ; j<size ; j ++){
            
            
            System.out.print(arr[j]+" ");
        }
        
        
    }
}