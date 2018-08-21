package Digits;

import java.util.Scanner;

public class Digitsum {

	public static void main(String[] args) {
		int n,i,a,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		n=sc.nextInt();
		for(i=1;i<5;i++) {
			if(n!=0) {
				a=n%10;
				sum=sum+a;
				n=n/10;   //replace 10 with 100 then it gives sum of first and last
			}
		}
		System.out.println(sum);

	}

}
