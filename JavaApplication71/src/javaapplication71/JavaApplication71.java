
package javaapplication71;

import java.util.LinkedList;
import java.util.*;

public class JavaApplication71 {

    private final int V;
    private final LinkedList<Integer> adj[];
    static int x,y;
    
    JavaApplication71(int v)
    {
        V=v;
        adj=new LinkedList[v];
        for (int i=0; i< v; ++i)
        {
            adj[i]=new LinkedList();
        } 
    }
    void addEdge(int v, int w)
    {
        adj[v].add(w);
    }
    void DFSUtil(int v,boolean visited[])
    {
          visited[v]= true;
          System.out.println(v+" ");
        Iterator<Integer> i=adj[v].listIterator();
        while(i.hasNext())
        {
            int n = i.next();
            if(!visited[n])
            {
                DFSUtil(n, visited);
            }  
        }
    }
    
    void DFS()
    {
        boolean visited[]=new boolean[V];
        
        for(int i=0; i<V; ++i)
        {
            if (visited[i]==false)
            {
                DFSUtil(i, visited);
            }
        }
    }

    
    public static void main(String[] args) {
        
         Scanner input=new Scanner(System.in);
        System.out.println("Enter number of vertices: ");
        int vertex=input.nextInt();
        JavaApplication71 obj = new JavaApplication71(vertex);
        System.out.println("Enter Number of Edges: ");
        int ch=input.nextInt();
        for (int i = 1; i <=ch; i++) 
        {
            System.out.println("Enter coordinate x for Edge "+i+" ");
            x=input.nextInt();
            System.out.println("Enter coordinate y for Edge "+i+" ");
            y=input.nextInt();
            obj.addEdge(x, y);
            System.out.println("");
        }
        System.out.println("Enter any 2 Vertex: ");
        int ch1=input.nextInt();
        int ch2=input.nextInt();
        if (ch1 == x && ch2 == y)
        {
            System.out.println("Path Available");
        }
        else
        {
            System.out.println("Invalid Path / Path not Available");
        }
        
                
        System.out.println("Following is Depth first First Traversal");
        obj.DFS();
        
        
    }
    
}
