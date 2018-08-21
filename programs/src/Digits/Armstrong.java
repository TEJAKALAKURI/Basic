package Digits;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int n,i,a,sum=0,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n value:");
		n=sc.nextInt();
		c=n;
		if(n!=0) {
			for(i=1;i<=3;i++) {
			a=n%10;
			sum=sum+a*a*a;
			n=n/10;
			}
		}
		if(sum==c) 
			System.out.println("armstrong");
		else
			System.out.println("not a armstrong");
		
	}

}
