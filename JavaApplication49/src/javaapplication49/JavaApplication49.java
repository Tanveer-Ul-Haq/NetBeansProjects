package javaapplication49;
public class JavaApplication49 {  
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,96,34,43 ,54};
        int n =arr.length;
        int hole,value;
        int trueCounter = 0,falseCounter=0; 
                   System.out.println("HOLE\tVALUE\tCONDITION\t\tSTATE");
        for(int i=1;i<n;i++){
            value = arr[i];
            hole = i;
            while(hole>0 && arr[hole-1]>value){
                System.out.println((hole) + "\t" + (value)+ "\t(" + (hole) + ">0  &&  " + (arr[hole-1]) + " > "+(value)+")\tTrue");

                arr[hole] = arr[hole-1];
                hole--;
                trueCounter++;
                
            }
             
            
            System.out.println((hole+1) + "\t" + (value)+ "\t(" + (hole+1) + ">0  &&  " + (arr[hole]) + " > "+(value)+")\tFalse");
            arr[hole] = value; 
            falseCounter++;
        }
        System.out.println("\n\n\nSorted Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\nAlgorithm ran "+ (trueCounter+falseCounter)+ " times");
        System.out.println("true counter "+trueCounter);
        System.out.println("false Counter "+falseCounter);
    }
}
