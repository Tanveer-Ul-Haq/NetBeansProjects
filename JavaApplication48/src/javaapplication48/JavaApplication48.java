
package javaapplication48;
import java.util.Scanner;
import java.util.ArrayList;     

public class JavaApplication48 {

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in); 
       ArrayList games= new ArrayList();
       games.add("football");
       games.add("hockey");
       games.add("cricket");
       System.out.println("Curent List: "+games);
       System.out.println("Press 1 for Adding Games in list \n Press 2 For removing games from list \n Pres 3 for Clear/Delete all");
       int choice= input.nextInt();
       switch(choice)
       {
       case 1:
       {
       System.out.println("Enter enter number of games do you want to add in Gameslist");
       int a=input.nextInt();
       System.out.println("Kindly Add Games by Pressing Enter");
       for(int i=1; i<=a;i++)
        {            
            games.add(input.next());
        }
       System.out.println("Your UpdatedList is : \n"+games);
       break;
       }
       case 2:
       {
        System.out.println("Enter enter number of games do you want to remove in Gameslist"); 
        int a=input.nextInt();
        System.out.println("Kindly Add Names of Games by Pressing Enter \n that you want to remove from list");
        for(int i=1; i<=a;i++)
        {            
            games.remove(input.next());
        }
        System.out.println("Your UpdatedList is : \n"+games);
        break;
        
       }
       case 3:
       {
           games.clear();
           System.out.println("All games have been deleted Successfully!!!!"+ games);
           break;
       }
       }
      
    }
    
}
