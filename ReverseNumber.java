package com.bl.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int rev = 0, rem = 0;
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(;num != 0; num = num /10)
		{
	
		    rem = num % 10;
		    rev = (rev * 10) + rem;
		    
	}
		System.out.println("Reverse is " + rev );
  }
}