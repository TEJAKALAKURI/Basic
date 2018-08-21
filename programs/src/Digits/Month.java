package Digits;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter month : ");
		String mo=sc.next();
		String m=mo.toLowerCase();
		
		if(m.equals("february"))
			System.out.println(m+"has 28 days");
		
		else if(m.equals("january")||m.equals("march")||m.equals("may")||m.equals("july")||m.equals("august")||m.equals("october")||m.equals("december")) 
			System.out.println(m+" has 31 days");
		
		else if(m.equals("april")||m.equals("june")||m.equals("september")||m.equals("november"))
			System.out.println(m+" has 30 days");
		
		else
			System.out.println("enter a valid month");
	}

}
