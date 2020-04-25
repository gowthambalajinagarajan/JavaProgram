package Program;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		int count=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			count=count*i;
		}
		System.out.println(count);
	}
}
