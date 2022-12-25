
package javaapplication75;

import java.util.*;

class Graph
{
    ArrayList<ArrayList<Integer>> graph;
    int V;
    Graph(int nodes)
    {
        V=nodes;
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++)
        {
            graph.add(new ArrayList<Integer>());
        }
    }
    void addEdge(int v,int u)
    {
        graph.get(v).add(u);
        graph.get(u).add(v);
    }
    void print()
    {
        for (int i = 0; i < V; i++)
        {
            System.out.print("Node i :");
            for(int arr:graph.get(i))
            {
                System.out.print("->"+arr);
            }
            System.out.println("");
        }
    }

}
public class JavaApplication75 
{
    public static void main(String[] args) 
    {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of vertex");
        int vrtx=input.nextInt();
        Graph obj = new Graph(vrtx);
        System.out.println("Enter Number of Edges");
        int ch=input.nextInt();
        int arrx[]=new int[ch];
        int arry[]=new int[ch];
        for (int i = 0; i < ch; i++) 
        {
            System.out.println("Enter cordinate x for Edges "+i+"");
            arrx[i]=input.nextInt();
            System.out.println("Enter cordinate y for Edges "+i+"");
            arry[i]=input.nextInt();
            obj.addEdge(arrx[i], arry[i]);
            System.out.println("");
        }
        System.out.println("*******************");
        obj.print();
        System.out.println("*******************");
        System.out.println("Enter any 2 Vertex");
        int ch1=input.nextInt();
        int ch2=input.nextInt();
        for (int i = 0; i <ch; i++) 
        {
            if (ch1 == arrx[i] && ch2 == arry[i])
            {
               System.out.println("Path Available");
                System.out.println(arrx[i]+"->"+arry[i]);
               break;
            }
            else
            {
               System.out.println("You select incorrect vertex");
            }
        }          
        
    }
    
}