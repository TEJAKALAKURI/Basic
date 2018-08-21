package Digits;

import java.util.Scanner;

public class PandN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		if(n>0)
			System.out.println("positive");
		else if(n<0) 
			System.out.println("negative");
		else 
			System.out.println("neither positive nor negative");
	}

}
