package strings;

import java.util.Scanner;

public class Vorc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a alphabet:");
		char c=sc.next().charAt(0);
		Character ch=Character.toUpperCase(c);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			System.out.print("you entered a vowel");
		else
			System.out.println("you entered a consonant");
	}

}
