package strings;

import java.util.Scanner;

							//Length of the String,no of chars and white Spaces 

public class Len {

	public static void main(String[] args) {
		int count=0,i;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		s=sc.nextLine();
		System.out.println("Length of string is:"+s.length());
		
		char[] c=s.toCharArray();
		for(i=0;i<=s.length()-1;i++) {
			if(c[i]!=' ')  		
			count++;
		}
		System.out.println("No of characters using char array is : "+count);
		
		//using String functions
		String s2=s.replaceAll("\\s+","");			//This is for replacing spaces
		System.out.println("No of characters using regex is : "+s2.length());
		
		String s3=s.replaceAll(" ","");				//This is for replacing spaces
		System.out.println("No of characters using literal is : "+s3.length());
		
		//TO print no of white spaces
		System.out.print("No of spaces:");
		System.out.println(s.length()-count);
		
		//To print no of words
		int words=1;								//here u can use above logic and iterate s2 or s3
		for (int j= 0; j <s.length()-1;j++)
		{
			if ((s.charAt(j) == ' ') && (s.charAt(j + 1) != ' '))
			{
				words++;
			}
		}
		System.out.println("No of words:"+words);
	}

}
