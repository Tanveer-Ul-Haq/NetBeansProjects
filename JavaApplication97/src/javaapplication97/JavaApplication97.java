
package javaapplication97;

import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication97 {

    
    public static void main(String[] args) {
        
      //   System.out.println("Priority Scheduling");
        System.out.print("Enter Number of Process: ");
        Scanner sc = new Scanner(System.in);
        int number_Of_Process = sc.nextInt();
        String process[] = new String[number_Of_Process];

        int p = 1;
        for (int i = 0; i < number_Of_Process; i++) {
            process[i] = "P" + p;
            p++;
        }

        System.out.println(Arrays.toString(process));

        System.out.print("Enter Burst Time for " + number_Of_Process + " process: ");

        int burstTime[] = new int[number_Of_Process];
        for (int i = 0; i < number_Of_Process; i++) {
            burstTime[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(burstTime));

        System.out.print("Enter Priority for " + number_Of_Process + " process: ");

        int priority[] = new int[number_Of_Process];
        for (int i = 0; i < number_Of_Process; i++) {
            priority[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(priority));

       // Sorting process & burst time by priority
         int temp;
         String temp2;
       for (int i = 0; i < number_Of_Process - 1; i++) {
        for (int j = 0; j < number_Of_Process - 1; j++) {
            if (priority[j] > priority[j + 1]) {
                   temp = priority[j];
                    priority[j] = priority[j + 1];
                    priority[j + 1] = temp;

                    temp = burstTime[j];
                    burstTime[j] = burstTime[j + 1];
                    burstTime[j + 1] = temp;

                    temp2 = process[j];
                    process[j] = process[j + 1];
                    process[j + 1] = temp2;

                }
            }
        }

        int TAT[] = new int[number_Of_Process + 1];
        int waitingTime[] = new int[number_Of_Process + 1];

      // Calculate Waiting Time & Turn Around Time
        for (int i = 0; i < number_Of_Process; i++) {
            TAT[i] = burstTime[i] + waitingTime[i];
            waitingTime[i + 1] = TAT[i];
        }

        int totalWT = 0;
        int totalTAT = 0;
        double avgWT;
        double avgTAT;

        System.out.println("Process  |  Burst_time   |  Waiting_time   |   Turn_around_time");
        for (int i = 0; i < number_Of_Process; i++) {

            System.out.println(process[i] + "\t |\t" + burstTime[i] + "\t |\t" + waitingTime[i] + "\t   |\t" + (TAT[i]));
            totalTAT += (waitingTime[i] + burstTime[i]);
            totalWT += waitingTime[i];

        }

        avgWT = totalWT / (double) number_Of_Process;
        avgTAT = totalTAT / (double) number_Of_Process;

        System.out.println("\n Average Wating Time: " + avgWT);
        System.out.println(" Average Turn Around Time: " + avgTAT);
    }
    
}

