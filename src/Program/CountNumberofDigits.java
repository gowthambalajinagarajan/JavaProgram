package Program;

import java.util.Scanner;

public class CountNumberofDigits {
	public static void main(String[] args) {
		int a,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		a=sc.nextInt();
		while(a>0) {
			a=a/10;
			b++;
		}
		System.out.println("No. of Digits:"+b);
	}

}
