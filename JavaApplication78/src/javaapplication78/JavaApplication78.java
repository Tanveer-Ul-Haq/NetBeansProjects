
package javaapplication78;

import java.util.LinkedList;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaApplication78 {

    private final int V;
    private final LinkedList<Integer> adj[];
   
    
    JavaApplication78(int v)
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
        
        
        System.out.println(" ");
        BTreePrinter.printNode(test1());
    }
    
    
    private static Node<Integer> test1() {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of vertex");
        int vrtx=input.nextInt();
        JavaApplication78 g=new JavaApplication78(vrtx);
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
    
        System.out.println("Following is breadth traversal");
        
        g.BFS(ch1);
        
         System.out.println(" ");   
        
        Node<Integer> root = new Node<Integer>(2);
        Node<Integer> n11 = new Node<Integer>(0);
        Node<Integer> n12 = new Node<Integer>(3);
        Node<Integer> n22 = new Node<Integer>(1);
       
        root.left = n11;
        root.right = n12;
        
        n11.right = n22;
        
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
