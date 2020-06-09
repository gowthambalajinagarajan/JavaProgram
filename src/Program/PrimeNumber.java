package Program;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				flag=false;
			}
		}
		if(flag) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}
