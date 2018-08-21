package Digits;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		int a,b,c,big=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 3 numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b&&a>c)
			System.out.println(a);
		else if(b>a&&b>c)
			System.out.println(b);
		else if(c>a&&c>b)
			System.out.println(c);
		else 
			System.out.println("plz enter distinct numbers");
		
		//using ternary operator
		int big1=(boolean) (a>b&&a>c)?a:(b>a&&b>c)?b:c;
		System.out.println(big1);
	}

}
