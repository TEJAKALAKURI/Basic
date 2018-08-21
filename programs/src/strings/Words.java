package strings;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		int i,count=1;
		String s,s1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		s=sc.nextLine();
		for(i=0;i<s.length()-1;i++) {
				if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
				{
					count++;
				}	
	}
		System.out.println("no of words is:"+count);
		
		//using string function
		int count1=1;
		String st=s.replaceAll("( )+"," ");
		for(int j=0;j<st.length()-1;j++) {
			if(st.charAt(j)==' ')
				count1++;
		}
		System.out.println("no of words using string function is:"+count1);
}
}
