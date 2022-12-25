package javaapplication70;

public class JavaApplication70 
{
    int arr[];
    int front = -1;
    int rear = -1;
    int sublimit;
    public JavaApplication70(int num)
    {
        sublimit = num;
        arr = new int[sublimit];
    }
    
     void enqueue(int num)
    {
        if(front == -1 && rear == -1)
        {
            front = rear =0;
            arr[rear]=num;
        }
        else if(rear<arr.length-1)
        {
            rear++;
            arr[rear]=num;
        }
        else
        {
            System.out.println("queue overflow");
        }
    }
    void dequeue()
    {
        int item=arr[front];
        System.out.println("Removed number is "+ item);
        front++;
    }
    void peek()
    {
        int item=arr[front];
        System.out.println("Front is: "+item);
    }
    void size()
    {
        System.out.println("Size of Queue is :"+arr.length);
    }
    void display()
    {
        System.out.println("Current elements:");
        for (int i = front; i < rear+1; i++)
        {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
    }
    void isempty()
    {
        if(front==-1 &&rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("Not empty");
        }
    }
    void isfull()
    {
        if(rear==arr.length-1)
        {
            System.out.println("Queue is full");
        }
        else
        {
            System.out.println("not full");
        }
    }
    
    public static void main(String[] args) 
    {
       JavaApplication70 obj=new JavaApplication70(10);
        for (int i = 1; i <=10; i++) 
        {
            obj.enqueue(i+10);
        }
        obj.size();
        obj.peek();
        obj.dequeue();
        obj.display();
        obj.peek();
        obj.dequeue();
        obj.display();
          
    }
     

}