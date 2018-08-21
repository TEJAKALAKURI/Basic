package strings;

import java.util.Scanner;

public class Revwords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String s=sc.nextLine();
		String[] s2=s.split(" ");
		for(int i=s2.length-1;i>=0;i--) {
			System.out.print(s2[i]+" ");
		}
	}

}
