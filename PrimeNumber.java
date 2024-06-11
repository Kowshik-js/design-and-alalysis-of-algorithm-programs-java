package com.pack;

public class PrimeNumber {

	public static void main(String[] args) {

int num=27;
for(int i=2;i<=num;i++) {
boolean isPrime=true;
for(int j=2;j<=i/2;j++){
{
if(i%j==0)
	isPrime=false;
	break;
}
	}

	if(isPrime)


		System.out.println("The "+i+" is a Prime number");
}
}
}
