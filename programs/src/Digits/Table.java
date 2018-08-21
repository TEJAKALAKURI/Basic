package Digits;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n value:");
		n=sc.nextInt();
		for(i=1;i<=12;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
	}

}
