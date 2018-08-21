package Digits;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int n,i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n value:");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			if((n%i)==0) {
				count++;
			}
		}
		if(count>2)
			System.out.println("not a prime");
		else
			System.out.println("prime");
	}

}
