package com.pack;
import java.util.Scanner;
public class Greedy_KnapSack {
	void knapSack(int n,float m,float w[],float p[])
	{
		float x,sum=0;
		for(int i=1;i<=n;i++)
		{
			if(w[i]<=m)
				x=1;
			else
				x=m/w[i];
			sum=sum+p[i]*x;
			m=m-w[i]*x;
		}
		System.out.println("Optimal solution is :"+sum);
	}
void orderitems (int n,float w[], float p[])
{
	int i,j;
	float r[]=new float[50];
	for( i=1;i<=n;i++)
		r[i]=p[i]/w[i];
	for(i=1;i<=n;i++)
		for(j=1;j<=n;j++)
			if(r[j]<r[j+1])
			{
				swap (j,j+1,r);
				swap (j,j+1,r);
				swap (j,j+1,r);
}
System.out.println("item\tweight\tprofit\tratio");
for(i=1;i<=n;i++)
	System.out.println(i+"\t"+w[i]+"\t"+p[i]+"\t"+r[i]);
			
	}
void swap (int i,int j,float r[])
{
	float temp;
	temp=r[i];
	r[i]=r[j];
	r[j]=temp;
}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greedy_KnapSack g=new Greedy_KnapSack();
Scanner s=new Scanner(System.in);
int n,m,i;
float w[]=new float[50];
float p[]=new float[50];
System.out.println("Enter the number of items :");
n=s.nextInt();
System.out.println("Enter the capacity of knapsack :");
m=s.nextInt();
System.out.println("Enter the weight of items :");
for(i=1;i<=n;i++)
	w[i]=s.nextInt();
System.out.println("Enter the profits of items :");
for(i=1;i<=n;i++)
p[i]=s.nextInt();
g.orderitems(n, w, p);
g.knapSack(n,m,w,p);

	
	}

}
