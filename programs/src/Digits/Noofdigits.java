package Digits;

import java.util.Scanner;

public class Noofdigits {

	public static void main(String[] args) {
		int n,i,a,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value:");
		n=sc.nextInt();
		for(i=1;i<=10;i++) {
			if(n!=0) {
				n /= 10;
				count++;
			}
		}
		System.out.println(count);
		
	}

}
