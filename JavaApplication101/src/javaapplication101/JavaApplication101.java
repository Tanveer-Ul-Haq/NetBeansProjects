
package javaapplication101;
import java.io.File; 
import java.io.IOException;
import java.io.FileWriter;
import java.awt.Desktop;
import java.net.URISyntaxException;
import java.util.Scanner;

public class JavaApplication101 {
    
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
       
        String file,file_Location;
        Scanner i = new Scanner(System.in);
        System.out.println("Enter file name to create a file");
            file=i.nextLine();
            file_Location= ("E:\\"+file+".txt");
            
        try {
      File myObj = new File(file_Location);
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        
        try {
      FileWriter myWriter = new FileWriter(file_Location);
            System.out.println("Enter data to write notepad:");
      myWriter.write(i.nextLine());
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        
        try
        {
            Desktop Browse= Desktop.getDesktop();
            File myObj = new File(file_Location);
      if (myObj.exists())
      {
          Browse.open(myObj);
          
          Thread.sleep(1000);
        Runtime.getRuntime().exec("taskkill /IM notepad.exe");
      } 
        }
        catch(IOException e)
                {
                    System.out.println(e);
                }
        
        System.out.println("Enter 1 to delete file");
        System.out.println("Enter 2 to update file");
        System.out.println("Enter 3 to exit");
        int a = i.nextInt();
        if(a==1)
        {
            Desktop Browse= Desktop.getDesktop();
            File myObj = new File(file_Location);
            if (myObj.exists()) 
            {
                myObj.delete();
                System.out.println("Successfully deleted the file");
            }
        }
        else if (a==2)
        {
             try {
      FileWriter myWriter = new FileWriter(file_Location);
      System.out.println("Enter data to Update notepad:");
      myWriter.write(i.nextLine());
      myWriter.close();
      System.out.println("Successfully Updated the file.");
    } 
             catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        
         try
        {
            Desktop Browse= Desktop.getDesktop();
            File myObj = new File(file_Location);
      if (myObj.exists())
      {
          Browse.open(myObj);
          Thread.sleep(1000);
        Runtime.getRuntime().exec("taskkill /IM notepad.exe");
      }  
        }
        catch(IOException e)
                {
                    System.out.println(e);
                }
        }
        else if(a==3)
        {
            System.exit(0);
        }
        else 
        {
            System.out.println("Invalid input");
        }
       
}
}    
