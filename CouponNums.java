package com.bl.logicalprograms;

import java.util.Scanner;

public class CouponNums {
 
	static String[] couponArray;
	
	public static void main(String[] args) {
		String str = "";
		
		System.out.print("How many coupon numbers you want? : ");
		Scanner sc=new Scanner(System.in);
		int coupons = sc.nextInt();
		couponArray = new String[coupons];
		for(int counter = 0; counter < coupons; counter++) {
			str = generateCoupon();
			System.out.println("Coupon Number "+(counter+1)+" :	"+str);
		}
		sc.close();
	}
	
	static String generateCoupon() {
		String str = "";
		
		for(int counter = 0; counter <= 4; counter++) {
			int randomDigit = (int)(Math.random()*10);
			str = str + randomDigit;
		}
		String checkedDuplicacy = checkCoupons(str);
		
		return checkedDuplicacy;
	}
	
	static String checkCoupons(String newCoupon) {
		int check = 0;
		
		for(String existing : couponArray) 
			if (newCoupon == existing)
				check++;
		if (check != 0)
			generateCoupon();
		
		return newCoupon;	
	}
}
