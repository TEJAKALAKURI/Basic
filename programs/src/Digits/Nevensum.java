package Digits;

import java.util.Scanner;

public class Nevensum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,s=0,n,c;
		System.out.print("enter n value:");
		 n=sc.nextInt();
		for(i=1;i<=n;i++) {
			if((i%2)==0) {
				s=s+i;
			}
			else
				continue;
			}
		System.out.println(s);
		}

}
