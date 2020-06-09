package Program;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int a,b=0,c=0,d=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		a=sc.nextInt();
		b=a;
		while(a>0) {
			c=a%10;
			d=(d*10)+c;
			a=a/10;
		}
		System.out.println(d);
		if(b==d) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}

}
