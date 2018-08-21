package Digits;

import java.util.Scanner;

					//To check given char is alphabet or digit or symbol and its ascii value

public class Ans {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value:");
		char ch=sc.next().charAt(0);
		int ascii =ch;
		
		if(ch>=65&ch<=90) 
			System.out.println("u entered upper case and the ASCII value is "+ascii);
		
		else if(ch>=97&ch<=122) 
			System.out.println("u entered lower case and the ASCII value is "+ascii);
		
		else if(ch>=48&ch<=57) 
			System.out.println("u entered a digit and the ASCII value is "+ascii);
		
		else
			System.out.println("u entered a symbol and the ASCII value is "+ascii);
	}

}
