package com.pack;
import java.util.*;
public class MergSort
{
	void simplemerge(int a[],int low,int mid,int high)
	{
	 int c[]=new int[100000];
	 int i,j,k;
	i=low;
	j=mid+1;
	k=low;
	while(i<=mid && j<=high)
	{
		if(a[i]<a[j])
		{
			c[k]=a[i];
			i++;
			k++;
		}
		else
		{
			c[k]=a[j];
			j++;
			k++;
		}
	}
	while (i<=mid)
	{
		c[k]=a[i];
		i++;
		k++;
	}
	while(j<=high)
	{
		c[k]=a[j];
		j++;
		k++;
	}
	for(i=low;i<=high;i++)
	{
		a[i]=c[i];
	}
}
	void merge(int a[],int low,int high)
	{
		int mid;
		if(low<high)
		{
			mid=(low+high)/2;
		merge(a,low,mid);
		merge(a,mid+1,high);
		simplemerge(a,low,mid,high);
	}
}
public static void main(String args[])
{
	int i,n;
	Scanner s=new Scanner(System.in);
	MergSort m=new MergSort();
	Random r=new Random();
	int a[]=new int[100000];
	System.out.println("enter the size of array");
	n=s.nextInt();
	for(i=0;i<n;i++)
	
	a[i]=r.nextInt(1000);
	
	System.out.println("array elements are");
	for(i=0;i<n;i++) 
	
		System.out.println(a[i]+"\t");
	
	long start=System.currentTimeMillis();
	m.merge(a,0,n-1);
	long end=System.currentTimeMillis();
	long total=end-start;
	System.out.println("\nsorted array");
	for(i=0;i<n;i++)
	
		System.out.println(a[i]+"\t");
	
	System.out.println("time taken:"+total+"ms");
}
}
