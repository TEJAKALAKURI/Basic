package Digits;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		int n,i,c=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter n value:");
	n=sc.nextInt();
	for(i=1;i<n;i++) {
		if(n%i==0) {
			c=c+i;
		}	
	}
	if(c==n)
		System.out.println("perfect");
	else
		System.out.println("not a perfect");
	
	}

}
