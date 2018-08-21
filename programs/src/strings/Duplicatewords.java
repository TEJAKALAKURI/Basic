package strings;

import java.util.Scanner;

public class Duplicatewords {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String s=sc.nextLine();
		String[] s2=s.split(" ");
		String[] s3=s2;
		/*for(int i=s2.length-1;i>=0;i--) {
			System.out.print(s2[i]+" ");
		}*/
		for(int i=0;i<=s2.length-1;i++) {
			count=0;
			for(int j=0;j<=s2.length-1;j++) {
				if(s2[i].equals(s3[j])) {
					count++;
				}
				
			}
			System.out.println(s2[i]+count);
		}
		

	}

}
