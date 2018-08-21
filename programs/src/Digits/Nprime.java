package Digits;

import java.util.Scanner;

public class Nprime {

	public static void main(String[] args) {
		int n,i,j,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n value:");
		n=sc.nextInt();
		for(i=2;i<=n;i++) {
			count=0;
			for(j=1;j<i;j++) {
				if(i%j==0)
					count++;
			}
			if (count==1)
				System.out.println(i);
		}
	}

}
