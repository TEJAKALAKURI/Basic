  package others;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character:");
		char ch=sc.next().charAt(0);
		if(ch>47&ch<58)
			System.out.println("you entered a digit");
		else if(ch>=65&ch<=90)
			System.out.println("you entered a uppercase alphabet");
		else if(ch>=97&ch<=122)
			System.out.println("you entered a lower case alphabet");
		else 
			System.out.println("you entered a symbol");
	}

}
