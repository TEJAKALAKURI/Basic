package pyramid;

import java.util.Scanner;

public class Full {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("enter how many rows:");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(" ");
				for(int k=j;k>=1;k--)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
