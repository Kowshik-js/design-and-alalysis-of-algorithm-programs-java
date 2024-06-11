package com.pack;
import java.util.Scanner;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
//Random r=new Random();
int i,n;
int a[]=new int[50];
System.out.println("enter the number of elements:");
n=s.nextInt();
System.out.println("enter array elements");
for(i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
System.out.println("Unsorted array: ");
for( i=0;i<n;i++)
{
	System.out.println(a[i]+" \t");
}
for( i=1;i<n;i++)
{
	int key=a[i];
	int j=i-1;
	while( j>=0&&a[j]>key)
	{
		a[j+1]=a[j];
		j=j-1;
	}
	a[j+1]=key;
}
System.out.println("sorted array: ");
for(i=0;i<n;i++)
{
	System.out.println(a[i]);
}
	}

}