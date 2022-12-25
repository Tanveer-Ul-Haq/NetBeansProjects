
package javaapplication12;


public class JavaApplication12 {

    private int array[];
    private int front;
    private int rear;
    private int capacity;
    private int count;
    
    JavaApplication12(int size)
    {
        array = new int[size];
        capacity = size;
        front =0;
        rear = -1;
        count = 0;
    }
    
    public void dequeue()
    {
        if (isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        
        System.out.println("Removing" + array[front]);
        front = (front + 1)%capacity;
        count--;
    }
    
    public void enqueue(int item)
    {
        if (isFull())
        {
            System.out.println("OverFlow\nProgram Terminated");
            System.exit(1);
        }
        System.out.println("Insrting "+ item);
        rear = (rear +1)%capacity;
        array[rear]=item;
        count++;
    }
    
    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        return array[front];
    }
    
    public int size()
    {
        return count;
    }
    
    public boolean isEmpty()
    {
        return (size()==0);
    }
    
    public boolean isFull()
    {
        return (size()== capacity);
    }
    public static void main(String[] args) {
        
        JavaApplication12 q = new JavaApplication12(5);
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        
        System.out.println("Front Element is: "+ q.peek());
        q.dequeue();
        System.out.println("Front Element is: "+ q.peek());
        System.out.println("Queue size is: "+ q.size());
        
        q.dequeue();
        q.dequeue();
        
        if(q.isEmpty())
            System.out.println("Queue is Empty ");
        else
            System.out.println("Queue is not Empty");
    }
    
}
