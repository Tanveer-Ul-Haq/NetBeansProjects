
package javaapplication73;
import java.util.*;
public class JavaApplication73 
{
    private final int V;
    private final LinkedList<Integer> adj[];
    static int x,y;
    
    public JavaApplication73(int v)
    {
        V=v;
        adj=new LinkedList[v];
        for (int i=0; i< v; ++i)
        {
            adj[i]=new LinkedList();
        }         
    }
   
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of vertex");
        int vrtx=input.nextInt();
        JavaApplication73 obj = new JavaApplication73(vrtx);
        System.out.println("how many edges do you want to enter");
        int ch=input.nextInt();
        for (int i = 1; i <=ch; i++) 
        {
            System.out.println("Enter cordinate x for Edges "+i+" (x,y) by pressing enter");
            x=input.nextInt();
            System.out.println("Enter cordinate y for Edges "+i+" (x,y) by pressing enter");
            y=input.nextInt();
            obj.addEdge(x, y);
            System.out.println("");
        }
        System.out.println("Enter any 2 Vertex By pressing Enter");
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
        

                
        System.out.println("following is Depth first first traversal");
        obj.DFS();
        
 
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
}