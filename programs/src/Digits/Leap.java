package Digits;

import java.util.Scanner;
				
					//leap year

public class Leap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter year:");
		int n=sc.nextInt();
		if((n%400)==0||(n%4)==0&&(n%100)!=0) {
			System.out.println("leap year");
		}
		else
			System.out.println("not a leap year");
	}

}
