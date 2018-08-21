package Digits;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		int n,rev=0,a;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n value: ");
		n=sc.nextInt();
		a=n;
		while(n!=0) {
		   rev = (rev*10)+(n%10);
		   n = n/10;
		}
		if(a==rev)
		System.out.println("pallindrome");
		else
			System.out.println("not a pallindrome");
	}

}
