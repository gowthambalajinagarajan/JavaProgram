package Program;

import java.util.Scanner;

public class SwappingUsingThirdVariable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		b=c-b;
		a=c-b;
		System.out.println("Swapping Number");
		System.out.println(a);
		System.out.println(b);
	}

}
