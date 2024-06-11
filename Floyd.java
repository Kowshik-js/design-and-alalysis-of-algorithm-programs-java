package com.pack;
import java.util.Scanner;
public class Floyd {
public void Floyd_method(int D[][],int n)
{
	int i,j,k;
	for(k=1;k<=n;k++)
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
				D[i][j]=Math.min (D[i][j],D[i][k]+D[k][j]);
	System.out.println("shortest distance is");
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			System.out.print(D[i][j]+"\t");
			
		}
		System.out.println();
	}
}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n,i,j;
		int D[][]=new int [10][10];
		Floyd f=new Floyd();
System.out.println("enter the number of nodes");
n=s.nextInt();
System.out.println("enter the weighted matrix");
for(i=1;i<=n;i++)
	for(j=1;j<=n;j++)
		D[i][j]=s.nextInt();
f.Floyd_method(D,n);
	}
}
			

