
// LFU in Paging
package javaapplication106;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class JavaApplication106 {

    
    public static void main(String[] args)throws IOException {
        
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
   int f,page=0,pgf=0,n,chn=0;
   boolean flag;
   int pages[]; 
   int k=0;
	pgf=0;
	int sml;
	System.out.println("Enter no. of frames: ");
	 f=Integer.parseInt(obj.readLine());
	int frame2[]=new int[f];
	int cnt[]=new int [f];
	flag=true;
	
	for(int i=0;i<f;i++)
		{
		frame2[i]=-1;
		cnt[i]=0;
		}
	System.out.println("Enter the no of pages ");
	 n=Integer.parseInt(obj.readLine());
	 pages=new int[n];
	System.out.println("Enter the page no ");
	for(int j=0;j<n;j++)
	pages[j]=Integer.parseInt(obj.readLine());
	do
	{
	int pg=0;
	for(pg=0;pg<n;pg++)
	{
		page=pages[pg];
		flag=true;
		
	
	for(int j=0;j<f;j++)
	{
		if(page==frame2[j])
		{
		flag=false;
		cnt[j]++;
		 break;
		}
	}
	if(flag)
	{
	
	sml=cnt[0];
	for(int j=0;j<f;j++)
	{
	if(cnt[j]<sml)
	{
	sml=cnt[j];
	break;
	}
	}
	for(int j=0;j<f;j++)
	{
	if(sml==cnt[j] )
                  {
	frame2[j]=page;
	k=j;
	break;
	}
	}
	cnt[k]=1;
	System.out.print("frame :");
	for(int j=0;j<f;j++)
	{
	System.out.print(frame2[j]+"   ");
	System.out.println();
	pgf++;
	}
	}
	else
	{
	System.out.print("frame :");
	for(int j=0;j<f;j++)
	System.out.print(frame2[j]+"  ");

	System.out.println();
	
	}
	chn++;
	}	
	}while(chn!=n);
	System.out.println("Page fault:"+pgf);
        
    }
    
}
