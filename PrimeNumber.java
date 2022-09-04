package com.bl.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		
		
			if(isPrime(num))
			{
				System.out.println(+ num + " is Prime");
			}
			else
			{
				System.out.println(+ num + " is not Prime");
			}
	}
	
	public static boolean isPrime(int num)
	{
			if(num <= 1)
			{
				return false;
			}
				
			for(int i = 2; i < Math.sqrt(num); i++)
			{
				if(num % i == 0)
				{
					return false;
     			}
	    	}
			return true;
		}
}