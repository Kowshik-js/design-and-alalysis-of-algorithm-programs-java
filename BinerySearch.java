package com.pack;
import java.util.Scanner;


public class BinerySearch {
	

	public static void main(String args[])
	{
	int i,n,key,low=0 ,mid,high;
	Scanner s=new Scanner(System.in);
	int a[]=new int[100];
	System.out.println("Enter a number of element");
	n=s.nextInt();
	System.out.println("Enter the element");
	for(i=0;i<n;i++)
	{
	a[i]=s.nextInt();
	}
	System.out.println("Enter the key");
	key=s.nextInt();
	high=n-1;
	while (low<=high)
	{
		mid=(high+low)/2;
		if(key==a[mid])
		{
		System.out.println("Element is found");
		System.exit(0);
		}
		if(key<a[mid])
			high=mid-1;
			else
				low=mid+1;
		}
		System.out.println("Element is not found");
	}
	}