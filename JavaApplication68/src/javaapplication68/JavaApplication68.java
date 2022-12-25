
package javaapplication68;

import java.util.LinkedList;
import java.util.*;

public class JavaApplication68 {

    private final int V;
    private final LinkedList<Integer> adj[];
    JavaApplication68(int v)
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
        
        JavaApplication68 g=new JavaApplication68(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("following is Depth first first traversal");
        g.DFS();

        
    }
    
}
