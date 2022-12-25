
package javaapplication10;


public class JavaApplication10 {

    
    public static void main(String[] args) {

        int a[]=new int[5];
        //a = new int[3];
        a[0]=1;a[1]=2;
        System.out.println(""+ a[0]);
        System.out.println(""+ a[1]);
        
        System.out.println("-------------------");
        
        int b[] ={
            2,4,6,8    };
        System.out.println(""+ b[0]);
        System.out.println(""+ b[1]);
        System.out.println(""+ b[2]);
        System.out.println(""+ b[3]);
        
        System.out.println("------------------");
        
        int m[][] =new int [2][4];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("---------------------");
        System.out.println("Addition of Matrix");
        
        int [][] a1 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] a2 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] sum = new int [3][3];
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum[i][j] = a1[i][j]+a2[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("-----------------------");
        System.out.println("Subtraction of Matrix");
        
        int [][] b1 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] b2 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] sub = new int [3][3];
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sub[i][j] = b1[i][j]-b2[i][j];
                System.out.print(sub[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("-------------------------");
        System.out.println("Multiplication of Matrix");
        
         int [][] c1 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] c2 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] c3 = new int [3][3];
        int [][] multi = new int [3][3];
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    c3[i][j] = 0;
                    multi[i][j] += c1[i][j]*c2[i][j];
                }
               
                System.out.print(multi[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("------------------------");
        
         int [][] d1 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] d2 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] div = new int [3][3];
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                div[i][j] = b1[i][j]/b2[i][j];
                System.out.print(div[i][j] + "\t");
            }
            System.out.println("");
        }
        
       
    }
    
}
