
package javaapplication77;

import java.util.LinkedList;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaApplication77 {

    private final int V;
    private final LinkedList<Integer> adj[];
    static int x,y,z,a,b,c,d,e,f,g,h,i,j,k,l,m,r;
    
    JavaApplication77(int v)
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
    void BFS(int s)
    {
        int arr[] = new int [4];
        boolean visited[]=new boolean[V];
        LinkedList<Integer> queue=new LinkedList<>();
        visited[s]=true;
        queue.add(s);
        while(queue.size() !=0)
        {
            s=queue.poll();
            System.out.print(s+" ");
           
            Iterator<Integer> i=adj[s].listIterator();
            while(i.hasNext())
            {
                int n=i.next();
                if(!visited[n])
                {
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
        
    }

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of vertex");
        int vrtx=input.nextInt();
        JavaApplication77 g=new JavaApplication77(vrtx);
        System.out.println("Enter Number of Edges");
        int ch=input.nextInt();
        int arrx[]=new int[ch];
        int arry[]=new int[ch];
        int arrv[]=new int[ch];
        for (int i = 0; i < ch; i++) 
        {
            System.out.println("Enter cordinate x for Edges "+i+"");
            arrx[i]=input.nextInt();
            System.out.println("Enter cordinate y for Edges "+i+"");
            arry[i]=input.nextInt();
            arrv[i]=i+1;
            System.out.println("value b/w "+arrx[i]+" and "+arry[i]+" is "+arrv[i]);
            g.addEdge(arrx[i], arry[i]);
            System.out.println("");
        }
        
        System.out.println("Enter Staring Vertex");
        int ch1=input.nextInt();
        System.out.println("Enter Entering Vertex");
        int ch2=input.nextInt();
        for (int i = 0; i <ch; i++) 
        {
            if (ch1 == arrx[i] && ch2 == arry[i])
            {
               System.out.println("Path Available");
                System.out.println(arrx[i]+"->"+arry[i]);
                System.out.println("Sum is "+arrv[i]);
               break;
            }
            else
            {
               System.out.println("Searching.....");
            }
        }    
    /*    g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);*/
        System.out.println("Following is breadth traversal");
        
        g.BFS(ch1);
        
        
        System.out.println(" ");
        BTreePrinter.printNode(test1());
    }
    
    
    private static Node<Integer> test1() {
        Node<Integer> root = new Node<>(2);
        Node<Integer> n11 = new Node<>(0);
        Node<Integer> n12 = new Node<>(3);
       // Node<Integer> n21 = new Node<Integer>(2);
        Node<Integer> n22 = new Node<>(1);
       // Node<Integer> n23 = new Node<Integer>(2);
       // Node<Integer> n24 = new Node<Integer>(2);
      //  Node<Integer> n31 = new Node<Integer>(0);
      //  Node<Integer> n32 = new Node<Integer>(2);
     //   Node<Integer> n33 = new Node<Integer>(3);
     //   Node<Integer> n34 = new Node<Integer>(3);
     //  Node<Integer> n35 = new Node<Integer>(3);
      //  Node<Integer> n36 = new Node<Integer>(4);
       // Node<Integer> n37 = new Node<Integer>(5);
      //  Node<Integer> n38 = new Node<Integer>(8);

        root.left = n11;
        root.right = n12;
        
   //     n11.left = n21;
        n11.right = n22;
        
     //   n12.left = n23;
     //   n12.right = n24;

     //   n21.left = n31;
     //   n21.right = n32;
        
   //     n22.left = n33;
    //    n22.right = n34;
        
    //    n23.left = n35;
     //   n23.right = n36;
        
     //   n24.left = n37;
      //  n24.right = n38;

        return root;
    }

   
    
}



class Node<T extends Comparable<?>> {
    Node<T> left, right;
    T data;

    public Node(T data) {
        this.data = data;
    }
}

class BTreePrinter {

    public static <T extends Comparable<?>> void printNode(Node<T> root) {
        int maxLevel = BTreePrinter.maxLevel(root);

        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static <T extends Comparable<?>> void printNodeInternal(List<Node<T>> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || BTreePrinter.isAllElementsNull(nodes))
             return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        BTreePrinter.printWhitespaces(firstSpaces);

        List<Node<T>> newNodes = new ArrayList<Node<T>>();
        for (Node<T> node : nodes) {
            if (node != null) {
                System.out.print(node.data);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            BTreePrinter.printWhitespaces(betweenSpaces);
        }
        System.out.println("");
        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                BTreePrinter.printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    BTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).left != null)
                    System.out.print("/");
                else
                    BTreePrinter.printWhitespaces(1);

                BTreePrinter.printWhitespaces(i + i - 1);

                if (nodes.get(j).right != null)
                    System.out.print("\\");
                else
                    BTreePrinter.printWhitespaces(1);

                BTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
            }
            
             System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    private static <T extends Comparable<?>> int maxLevel(Node<T> node) {
        if (node == null)
            return 0;

        return Math.max(BTreePrinter.maxLevel(node.left), BTreePrinter.maxLevel(node.right)) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }

    
}
