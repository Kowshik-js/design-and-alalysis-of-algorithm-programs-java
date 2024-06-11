import java.util.Scanner;

public class Subset
{
public static int w[] = new int [10];
public static int x[] = new int [10];
public static int d;

void subset(int s,int k,int r)
{
	int i;
	x[k]=1;
	if(s+w[k]==d)
	{
		System.out.print("sum of subset is: (");
		for(i=1;i<=k;i++)
		{
			if(x[i]==1)
				System.out.print(" " +w[i]);
			}
			System.out.println( " )");
		}
		else if((s+w[k]+w[k+1])<=d)
		{
			subset(s+w[k],k+1,r-w[k]);
		}
	if((s+r-w[k])>=d && (s+w[k+1])<=d)
	{
		x[k]=0;
		subset(s,k+1,r-w[k]);
		}
	}

public static void main(String[] args)
{
		// TODO Auto-generated method stub
int total=0;
Subset s1=new Subset();
Scanner s=new Scanner(System.in);
System.out.println("enter the number of elements: ");
int n=s.nextInt();
System.out.println("enter the elements:");
for(int i=1;i<=n;i++)
{
	w[i]=s.nextInt();
	total=total+w[i];
	}
System.out.println("enter the sum to be obtained:");
d=s.nextInt();
if(total<d)
{
	System.out.println("no possible subsets!!!");
	System.exit(0);
}
s1.subset(0, 1, total);
}
}