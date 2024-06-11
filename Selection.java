package com.pack;
import java.util.*;
public class Selection {
	public void sort(int a[],int n)
	{
	int i,min=0,j,temp;
	for(i=0;i<n-1;i++)
	{
		min=i;
		for(j=i+1;j<n;j++)
		{
			if(a[j]<a[min])
				min=j;
	}
	temp=a[min];
	a[min]=a[i];
	a[i]=temp;
	}
}
public static void main(String args[])
{
	Selection se=new Selection();
	Scanner s =new Scanner(System.in);
	Random r=new Random();
	int i,n;
	System.out.println("enter the number of elements");
	n=s.nextInt();
	int a[]=new int [n];
	System.out.println("enter the elements");
	for(i=0;i<n;i++)
	{
		a[i]=r.nextInt(1000);
	}
	long start=System.currentTimeMillis()	;
	se.sort(a,n);
	long end=System.currentTimeMillis()	;
	System.out.println("the sorted element eleemnt is");
	for(i=0;i<n;i++)
	{
		System.out.println(a[i]);

	}
	System.out.println("the array elements are");
	for(i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
	long total=end-start;
	System.out.println("total time taken"+total+"ms");
	
	
	
	
			
	}
	}
	
	