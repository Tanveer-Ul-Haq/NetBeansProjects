
package javaapplication72;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
 
public class JavaApplication72 {
   
    static void DFS(int[][] matrix, int source){
        boolean[] visited = new boolean[matrix.length];
        visited[source-1] = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        int i,x;
        
        System.out.println("The depth first Search is");
        System.out.println(source);
        while(!stack.isEmpty()){
            x = stack.pop();
            for(i=0; i<matrix.length; i++){
                if(matrix[x-1][i] == 1 && visited[i] == false){
                    stack.push(x);
                    visited[i] = true;
                    System.out.println(i+1);
                    x = i+1;
                    i = -1;
                }
            }
        }
    }
    // Function to read user input
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner a = new Scanner(System.in);
        int vertices;
        System.out.println("Enter the number of vertices in the graph");
        try{
            vertices = Integer.parseInt(br.readLine());
        }catch(IOException e){
            System.out.println("An error occurred");
            return;
        }
        int[][] matrix = new int[vertices][vertices];
        System.out.println("Enter the adjacency matrix");
        int i,j;
        for(i=0; i<vertices; i++){
            for(j=0; j<vertices; j++){
                try{
                    matrix[i][j] = Integer.parseInt(br.readLine());
                }catch (IOException e){
                    System.out.println("An error occurred");
                }
            }
        }
        int source;
        System.out.println("Enter the selected vertex");
        try{
            source = Integer.parseInt(br.readLine());
            
        }catch(IOException e){
            System.out.println("An error occurred");
            return;
        }
        DFS(matrix,source);
    }
}