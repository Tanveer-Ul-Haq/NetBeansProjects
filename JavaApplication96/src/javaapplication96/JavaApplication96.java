
package javaapplication96;
import java.util.*;

public class JavaApplication96 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter no of process:");
        int n = sc.nextInt(), process_id[] = new int[n], arrival_time[] = new int[n], burst_time[] = new int[n]; 
        int complete_time[] = new int[n], turn_around_time[] = new int[n], waiting_time[] = new int[n], flag[] = new int[n];  
        int st=0, total_no_of_process=0;
        float average_wait=0, average_turn_around=0;
 
        for(int i=0;i<n;i++)
        {
        System.out.println ("Enter process " + (i+1) + " arrival time:");
        arrival_time[i] = sc.nextInt();
        System.out.println ("Enter process " + (i+1) + " burst time:");
        burst_time[i] = sc.nextInt();
        process_id[i] = i+1;
        flag[i] = 0;
        }
        boolean a = true;
        while(true)
        {
        int c=n, min=999;
        if (total_no_of_process == n) 
        break;
        for (int i=0; i<n; i++)
        {

        if ((arrival_time[i] <= st) && (flag[i] == 0) && (burst_time[i]<min))
        {
        min=burst_time[i];
        c=i;
        }
        }
        if (c==n)
        st++;
        else
        {
        complete_time[c]=st+burst_time[c];
        st+=burst_time[c];
        turn_around_time[c]=complete_time[c]-arrival_time[c];
        waiting_time[c]=turn_around_time[c]-burst_time[c];
        flag[c]=1;
        total_no_of_process++;
        }
        }
        System.out.println("\nProcess_id  arrival_time  burst_time   completion_time  turnaround_time  waiting_time");
        for(int i=0;i<n;i++)
       {
       average_wait+= waiting_time[i];
       average_turn_around+= turn_around_time[i];
       System.out.println(process_id[i]+"\t\t"+arrival_time[i]+"\t\t"+burst_time[i]+"\t\t"+complete_time[i]+"\t\t"+turn_around_time[i]+"\t\t"+waiting_time[i]);
       }
       System.out.println ("\n average turnaround time is "+ (float)(average_turn_around/n));
       System.out.println (" average waiting time is "+ (float)(average_wait/n));
       sc.close();
    }
    
}
