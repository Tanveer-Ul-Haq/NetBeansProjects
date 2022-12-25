package javaapplication69;

public class JavaApplication69 {
    
    private int maxsize;
    private long array[];
    private int top;
    
    public JavaApplication69(int s)
    {
        maxsize =s;
        array=new long[maxsize];
        top=-1;
    }
    public void push(long i)
    {
        System.out.println("COMSATS");
        array[++top]=i;
    }
    public long pop()
    {
        System.out.println("CS Department");
        return array[top--];   
    }
    public boolean isEmpty()
    {
        return(top==-1);
    }

    public static void main(String[] args) {
        JavaApplication69 s= new JavaApplication69(5);
      s.push(5);
      s.push(10);
      s.push(15);
      s.push(20);
      s.push(25);
      System.out.println("The Values are");
      while(!s.isEmpty())
      {
          long value =s.pop();
          System.out.println(value);
      
      }
    

    }
    
}