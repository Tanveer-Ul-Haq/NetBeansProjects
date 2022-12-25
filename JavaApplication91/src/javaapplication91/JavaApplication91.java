
package javaapplication91;
import java.io.File; 
import java.io.IOException;
import java.io.FileWriter;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class JavaApplication91 {

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        String file,file_Location;
      //  Desktop Browse= Desktop.getDesktop();
      //  Browse.browse(new URI("www.google.com"));
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
         //   i.nextLine();
      myWriter.write(i.nextLine());
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      //  Runtime rt = Runtime.getRuntime();
        
        try
        {
            Desktop Browse= Desktop.getDesktop();
            File myObj = new File(file_Location);
      if (myObj.exists())
      {
          Browse.open(myObj);
          
          Thread.sleep(5000);
        Runtime.getRuntime().exec("taskkill /IM notepad.exe");
      }
         //   Runtime rt = Runtime.getRuntime();
         //   rt.exec("E:\\filename.txt");
        }
        catch(IOException e)
                {
                    System.out.println(e);
                }
        try {
      FileWriter myWriter = new FileWriter(file_Location);
            System.out.println("Enter data to Update notepad:");
         //   i.nextLine();
      myWriter.write(i.nextLine());
      myWriter.close();
      System.out.println("Successfully Updated the file.");
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
          
          Thread.sleep(5000);
        Runtime.getRuntime().exec("taskkill /IM notepad.exe");
      }
         //   Runtime rt = Runtime.getRuntime();
         //   rt.exec("E:\\filename.txt");
        }
        catch(IOException e)
                {
                    System.out.println(e);
                }
    }
    
}
