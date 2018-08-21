package strings;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		String s,s1="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		s=sc.nextLine();
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		if(s.equals(s1))
			System.out.println("pallindrome");
		else
				System.out.println("not a pallindrome");
		
		//using string functions
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sb1=new StringBuffer();
		sb1=sb.reverse();
		String s3=sb1.toString();
		if(s.equals(s3)) 
			System.out.println("pallindrome");
		else
				System.out.println("not a pallindrome");
			
		
		
		
		
		
	}

}
