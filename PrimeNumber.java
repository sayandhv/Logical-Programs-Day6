package com.bridgelabz.day6;

import java.util.Scanner;

public class PrimeNumber {

	public static void CheckPrimeOrNot(int n){
		
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
				
		    }
		}
		if(count==2) 
		{
		
			System.out.println("The Number is Prime");
	  
		}
	  else 
	  {
		  
		  System.out.println("Not a prime number");
		  
	
	  }
		
}
	
public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check prime or not");
		int num=sc.nextInt();
		CheckPrimeOrNot(num);
		sc.close();
	}

}
