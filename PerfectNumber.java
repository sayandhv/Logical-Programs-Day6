package com.bridgelabz.day6;

import java.util.Scanner;

public class PerfectNumber {

	public static int CheckPerfectNumber(int n) {
		
		int sum=0;
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				 sum=sum+i;
			}
			
		}
		
		if(sum==n)
		{
			
			System.out.println("The Number is Perfect");
		}
		else
		{
			System.out.println("It is not a Perfect Number ");
	    }
		
	return 1;
		
	}
	
public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to check");
	int num=sc.nextInt();
	CheckPerfectNumber(num);
    sc.close();
	}

}