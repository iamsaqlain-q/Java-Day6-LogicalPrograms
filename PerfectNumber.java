package com.bl.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int num, sum = 0;
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		
		System.out.print("Divisors are : ");
		
		int index = 1;
		while(index <= num / 2)
		{
			
			if(num % index == 0 )
			{
			sum = sum + index;
			System.out.print(" " +sum);
			}
			index++;
		}
	 
		if(sum == num)
		{
			System.out.println("\n" + num + " is a perfect number");
		}
		
		else
		{
			System.out.println("\n" + num + " is not a perfect number");
		}
	}
}
