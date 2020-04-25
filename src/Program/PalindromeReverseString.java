package Program;

import java.util.Scanner;

public class PalindromeReverseString {
	public static void main(String[] args) {
		String Original,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		Original=sc.next();
		for(int i=Original.length()-1;i>=0;i--) {
			reverse=reverse+Original.charAt(i);
		}
		if(Original.equals(reverse)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
