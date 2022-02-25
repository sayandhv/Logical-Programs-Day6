package com.bridgelabz.day6;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void findReverse(int n)
      {
		int r;
		int sum=0;
		while(n>0)
		 {
			r=n%10;
			sum=sum * 10+r;
			n=n/10;
		   }
				
		System.out.println("The reverse number is "  +sum);
				
	 }
	
	
public static void main(String[] args) {
	
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number to Reverse");
	int num=sc.nextInt();
	findReverse(num);
	sc.close();
	}

}