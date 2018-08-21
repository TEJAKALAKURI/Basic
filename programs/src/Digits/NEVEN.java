package Digits;

import java.util.Scanner;

public class NEVEN {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i,n;
		System.out.print("enter n value:");
		 n =sc.nextInt();
		for(i=1;i<=n;i++) {
			if((i%2)==0) 
				System.out.print(i+"\t");
				else
					continue;
		}
		//using while loop
		i=2;
		while(i<=n)	{
		
				System.out.print(i+"\t");
				i=i+2;
		}
		//using dowhile loop
		i=2;
		do {
			System.out.print(i+"\t");
			i=i+2;
		}while(i<=n);
		
	}

}
