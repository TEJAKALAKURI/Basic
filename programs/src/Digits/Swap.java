package Digits;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 values");
		a=sc.nextInt();
		b=sc.nextInt();
		/*temp=a;
		a=b;
		b=temp;*/
		
		a=a+b;
		b=b-a;
		a=a-b;
		System.out.println(a+" "+b);
	}

}
