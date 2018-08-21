package arays;

import java.util.Scanner;

public class Arays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[4];
		System.out.print("enter values:");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=1;i<=a.length-1;i++) {
			if(a[0]==a[1])
				continue;
			else
			System.out.println(a[i]);
		}
	
	}

}
