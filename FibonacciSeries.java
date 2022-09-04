package com.bl.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int serieslength = 0;
		int num1 = 0, num2 = 1, num3;
		System.out.println("Enter length of fibbonacci series : ");
		Scanner sc = new Scanner(System.in);
		serieslength = sc.nextInt();
		sc.close();
		
		System.out.print("Fibonacci series : " + num1 + " " + num2);
		
		for(int i = 0; i < serieslength; i++)
		{
		num3 = num1 + num2;
		System.out.print( " " + num3 + " ");
		num1 = num2;
		num2 = num3;
		}
	}
}
