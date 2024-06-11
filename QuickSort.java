package com.pack;
import java.util.*;


public class QuickSort {
	public void QuickSort (int a[],int low,int high)
	{
		int k;
		if(low<high)
		{
			k=partsion(a,low,high);
			QuickSort(a,low,k-1);
			QuickSort(a,k+1,high);
		}
	}
	public int partsion (int a[],int low ,int high)
	{
		int i,j,pivot,temp;
		pivot=a[low];
		i=low;
		j=high+1;
		while(i<=j)
		{
			do
			i=i+1;
			while(pivot>=a[i] && i<=high);
			
			do
			j=j-1;
			while(pivot<a[j] && j>low);
				if(i<j)
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
		}
		temp=a[j];
		a[j]=a[low];
		a[low]=temp;
		return j;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i;
QuickSort q=new QuickSort();
Scanner s=new Scanner(System.in);
Random r=new Random();
int a[]=new int [100000];
System.out.println("enter the array size");
n=s.nextInt();
for(i=0;i<n;i++)

a[i]=r.nextInt(1000);

System.out.println("array elements are");
for(i=0;i<n;i++) 

	System.out.println(a[i]+"\t");

long start=System.currentTimeMillis();
q.QuickSort(a,0,n-1);
long end=System.currentTimeMillis();
long total=end-start;
System.out.println("\nsorted array");
for(i=0;i<n;i++)

	System.out.println(a[i]+"\t");

System.out.println("time taken:"+total+"ms");
}
}


