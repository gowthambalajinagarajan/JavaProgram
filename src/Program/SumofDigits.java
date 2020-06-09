package Program;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int a,b=0,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		a=sc.nextInt();
		while(a>0) {
			b=a%10;
			c=c+b;
			a=a/10;
		}
		System.out.println("Sum of Digit:"+c);
	}
}
