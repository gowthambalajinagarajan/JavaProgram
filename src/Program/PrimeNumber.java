package Program;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				flag=false;
				break;
				}
		}
		if(flag==true) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}
