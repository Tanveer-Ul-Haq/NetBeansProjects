// Priority for Scheduling algorithm
package javaapplication111;
import java.util.Arrays;
import java.util.Comparator;


    class Process
{
    int Process_ID; 
    int Burst_time; 
    int priority; 
    Process(int pid, int bt, int priority)
    {
        this.Process_ID = pid;
        this.Burst_time = bt;
        this.priority = priority;
    }
    public int prior() {
        return priority;
    }
}
 

public class JavaApplication111
{
   
public void findWaitingTime(Process proc[], int n,
                    int waiting_time[])
{
    waiting_time[0] = 0;
 
    for (int i = 1; i < n ; i++ )
        waiting_time[i] = proc[i - 1].Burst_time + waiting_time[i - 1] ;
}
 

public void findTurnAroundTime( Process proc[], int n,
                        int wt[], int tat[])
{
    // bt[i] + wt[i]
    for (int i = 0; i < n ; i++)
        tat[i] = proc[i].Burst_time + wt[i];
}
 
public void findavgTime(Process proc[], int n)
{
    int wt[] = new int[n], tat[] = new int[n], total_wt = 0, total_tat = 0;
 
    findWaitingTime(proc, n, wt);
 
    findTurnAroundTime(proc, n, wt, tat);
 
    System.out.print("\nProcesses   Burst time   Waiting time   Turn around time  Priority\n");
 
    for (int i = 0; i < n; i++)
    {
        total_wt = total_wt + wt[i];
        total_tat = total_tat + tat[i];
        System.out.print(" " + proc[i].Process_ID + "\t\t" + proc[i].Burst_time + "\t " + wt[i] + "\t\t " + tat[i] + "\t\t\t"+ proc[i].priority+"\n");
    }
 
    System.out.print("\nAverage waiting time = "
            +(float)total_wt / (float)n);
    System.out.println("\nAverage turn around time = "+(float)total_tat / (float)n);
}
 
public void priorityScheduling(Process proc[], int n)
{
   
    Arrays.sort(proc, new Comparator<Process>() {
        @Override
        public int compare(Process a, Process b) {
            return b.prior() - a.prior();
        }
    });
    System.out.print("Order of processes in which processes gets executed according to priority \n");
    for (int i = 0 ; i < n; i++)
        System.out.print(proc[i].Process_ID + " ") ;
 
    findavgTime(proc, n);
}
 
public static void main(String[] args)
{
    JavaApplication111 ob=new JavaApplication111();
    int n = 3;
    Process proc[] = new Process[n];
    proc[0] = new Process(1, 10, 2);
    proc[1] = new Process(2, 5, 0);
    proc[2] = new Process(3, 8, 1);
    ob.priorityScheduling(proc, n);
}
    
}

