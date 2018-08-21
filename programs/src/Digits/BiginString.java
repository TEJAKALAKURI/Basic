package Digits;

import java.util.Scanner;

public class BiginString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=new String();
		System.out.print("Enter digits:");
		s=sc.nextLine();  
		int max=s.charAt(0);
		for(int i=0;i<=s.length()-1;i++) {       
			if(max<s.charAt(i)) {
				max=s.charAt(i);
			}
		}
		System.out.println(Character.getNumericValue(max));
	}

}
