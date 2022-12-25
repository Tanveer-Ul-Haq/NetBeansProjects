
//FIFO in paging
package javaapplication105;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class JavaApplication105 {

    
    public static void main(String[] args)throws IOException {
        
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
   int f,page=0,pgf=0,n,chn=0;
   boolean flag;
   int pages[]; 
   int pt=0;
	
	System.out.println("Enter no. of frames: ");
	 f=Integer.parseInt(obj.readLine());
	int frame[]=new int[f];
	for(int i=0;i<f;i++)
		{
		frame[i]=-1;
		}
	System.out.println("Enter the number of pages ");
	 n=Integer.parseInt(obj.readLine());
	 pages=new int[n];
	System.out.println("Enter the page no ");
	for(int j=0;j<n;j++)
	pages[j]=Integer.parseInt(obj.readLine());
	do{
	int pg=0;
	for(pg=0;pg<n;pg++)
	{
	
	page=pages[pg];
	flag=true;
	for(int j=0;j<f;j++)
	{
	if(page==frame[j])
	{
	flag=false;
	 break;
	}
	}
	if(flag)
	{
	frame[pt]=page;
	pt++;
	if(pt==f)
	pt=0;
	System.out.print("frame :");
	for(int j=0;j<f;j++)
	System.out.print(frame[j]+"   ");

	System.out.println();
	pgf++;
	}
	else
	{
	System.out.print("frame :");
	for(int j=0;j<f;j++)
	System.out.print(frame[j]+"  ");

	System.out.println();
	}
	
	chn++;
	}
	}while(chn!=n);
	System.out.println("Page fault:"+pgf);
        
    }
    
}
