package com.pack;

import java.util.Scanner;
public class Djistras {

void Djstras_approach(int a[][],int n,int source)
{
	int i,j,u=0,v,min;
	int s[]=new int [10];
	int d[]=new int[10];
	for(i=0;i<n;i++)
	{
		s[i]=0;
		d[i]=a[source][i];
	}
	s[source]=1;
	for(i=0;i<n;i++)
	{
		min =999;
		for(j=0;j<n;j++)
		{
		if(s[j]==0 && d[j]<min)
		{
			min=d[j];
			u=j;
		}
	}

	s[u]=1;
	for(v=0;v<n;v++)
	{
		if(s[v]==0 && d[v]>=d[u]+a[u][v])
		{
			d[v]=d[u]+a[u][v];
		}
	}
	}

System.out.println("\nshortest path is .....\n");
for(i=0;i<n;i++)
	System.out.println(source+"->"+i+"="+d[i]);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Djistras d=new Djistras();
Scanner s=new Scanner(System.in);
int i,n,j,source;
int a[][]=new int [10][10];
System.out.println("enter the number of vertices ");
n=s.nextInt();
System.out.println("enter the value of array");
for(i=0;i<n;i++)
	for(j=0;j<n;j++)
		a[i][j]=s.nextInt();
System.out.println("enter the soruce vertices ");
source=s.nextInt();
d.Djstras_approach(a,n,source);

	}
}



