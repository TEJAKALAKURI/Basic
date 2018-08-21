package Digits;

import java.util.Scanner;

public class Fibonocci {

	public static void main(String[] args) {
		int a=0,b=1,c,n,i;
		Scanner sc =new Scanner(System.in);
		System.out.print("enter n value:");
		n=sc.nextInt();
		System.out.print(a+" "+b);
		for(i=0;i<=n;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
					
		}
		
	}

}
