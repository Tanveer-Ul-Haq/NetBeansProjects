package javaapplication60;

public class JavaApplication60 {
int j=5;
int c=5;
    public void aircontroller(){
        
        System.out.println("Do you give permission to Land?");
           char a[] ={'y','y','n','y','n'}; 

       for(int i=0;i<j;i++)
       {
            System.out.println("Do you give permission to Land: Y!");
          if(a[i]=='y' )
          {
           try{

  Thread.sleep(1200);
}catch(InterruptedException ex){
  
}
           System.out.println("Wait Plane Fly");
    
           System.out.println("Plane fly\n\n");
                                 try{

  Thread.sleep(1200);
}catch(InterruptedException ex){
  
}}
          else {
              System.out.println("No!");
          }
           System.out.println("Do you give permission to Take off");
          if(a[i] =='y')
          {
                   System.out.println("Do you give permission to Take off: "+a[i]);
           System.out.println("Wait departure");
                                  try{

  Thread.sleep(1200);
}catch(InterruptedException ex){
 
}
 
         System.out.println("Plane arrive\n\n");
         
       }
          else 
       {System.out.println("No! you cann't");
               }
       }
       
plane();
    }
   
    public void plane() {
        
        System.out.println("Total Plane come: "+j);
        System.out.println("Totoal Plane gone: "+c);
 
         
        }
    public static void main(String[] args) {
         
        JavaApplication60 l=new JavaApplication60();
        l.aircontroller();
    } 
}