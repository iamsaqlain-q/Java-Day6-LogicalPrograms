package com.bl.logicalprograms;

import java.util.Scanner;

public class Stopwatch {
	
public static void main(String[] args) {
	
	long start, end, elapse;
	
	System.out.println("Stimulate Stopwatch Program !");
	System.out.println("Enter S to Start Stopwatch : ");
	
	Scanner sc = new Scanner(System.in);
	char input = sc.next().charAt(0);
	start = System.currentTimeMillis();
    
    System.out.println("Enter E to Stop Stopwatch : ");
	input = sc.next().charAt(0);
	end = System.currentTimeMillis();
	
	elapse = (end - start) / 1000;
	System.out.println("Time elapsed(in sec) : " + elapse);
	sc.close();
}

}
