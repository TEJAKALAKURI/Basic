package Digits;

import java.util.Scanner;

public class Perfects {

	public static void main(String[] args) {
		int n,i,j,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n value:");    l
		n=sc.nextInt();
		for(i=2;i<=n;i++) {
			for(j=1;j<i;j++) {
				if(i%j==0) {
					c=c+j;
				}
			}
			if(c==i)
				System.out.println(c);
		}
		
	}

}
