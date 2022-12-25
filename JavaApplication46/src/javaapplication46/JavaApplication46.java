
package javaapplication46;
import java.util.Random;
import javax.swing.*;

public class JavaApplication46 {

    
    public static void main(String[] args) {
        
         Random dice = new Random();
        String choice = JOptionPane.showInputDialog("**Welcome to Dice Game***\n*Press 1 for Playing in Integer\n*Press 2 for playing in floating");
        int ch=Integer.parseInt(choice);
        switch(ch)
        {
            case 1:
            {
                String a= JOptionPane.showInputDialog("Enter Game Rounds from 1-10");
        int round=Integer.parseInt(a);
        int count=0,count1=0;
        for(int counter=1;counter<=round;counter++)
        {
            int player=1+dice.nextInt(6);
            int pc=1+dice.nextInt(6);
            if(player>pc)
            {
                JOptionPane.showMessageDialog(null,"Round:"+counter+"\n*****You Won****\nYour Score: "+player+ "\nPc Score: "+ pc);
                count=count+1;
            }
            else if(pc>player)
            {
                JOptionPane.showMessageDialog(null,"Round:"+counter+"\n*****Pc Wons****\nYour Score: "+player+ "\nPc Score: "+ pc);
                count1=count1+1;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Round:"+counter+"\n Match is Draw ");
            }
            
        }
        if(count>count1)
        {
            JOptionPane.showMessageDialog(null,"***Result**\n"+"Total Rouds: "+round+"\nYour Total Score:"+ count+"\nPc total Score:"+count1+ "\n**Congrats You won***");

        }
        else if(count1>count)
        {
            JOptionPane.showMessageDialog(null,"***Result**\n"+"Total Rouds: "+round+"\nYour Total Score:"+ count+"\nPc total Score:"+count1+"\n**PC Wons**\nBetter luck next time");

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Match Draw Both have Equal Score");
        }
                break;
            }
            case 2:
            {
                String a= JOptionPane.showInputDialog("Enter Game Rounds from 1-10");
        float round=Integer.parseInt(a);
        float count=0,count1=0;
        for(float counter=1;counter<=round;counter++)
        {
            float player=5+dice.nextFloat();
            float pc=5+dice.nextFloat();
            if(player>pc)
            {
                JOptionPane.showMessageDialog(null,"Round:"+counter+"\n*****You Won****\nYour Score: "+player+ "\nPc Score: "+ pc);
                count=count+1;
            }
            else if(pc>player)
            {
                JOptionPane.showMessageDialog(null,"Round:"+counter+"\n*****Pc Wons****\nYour Score: "+player+ "\nPc Score: "+ pc);
                count1=count1+1;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Round:"+counter+"\n Match is Draw ");
            }
            
        }
        if(count>count1)
        {
            JOptionPane.showMessageDialog(null,"***Result**\n"+"Total Rouds: "+round+"\nYour Total Score:"+ count+"\nPc total Score:"+count1+ "\n**Congrats You won***");

        }
        else if(count1>count)
        {
            JOptionPane.showMessageDialog(null,"***Result**\n"+"Total Rouds: "+round+"\nYour Total Score:"+ count+"\nPc total Score:"+count1+"\n**PC Wons**\nBetter luck next time");

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Match Draw Both have Equal Score");
        }
                break;
            }
        }
        
    }
    
}
