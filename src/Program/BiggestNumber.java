package Program;

import java.util.Scanner;

public class BiggestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		if(a>b && a>c && a>d) {
			System.out.println("The Biggest Number is:"+a);
		}
		else if(b>a && b>c && b>d) {
			System.out.println("The Biggest Number is:"+b);
		}
		else if(c>b && c>b && c>d) {
			System.out.println("The Biggest Number is:"+c);
		}
		else {
			System.out.println("The Biggest Number is:"+d);
		}
	}

}
