package Program;

import java.util.Scanner;

public class SwappingWithoutUsingThird {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapping Numbers");
		System.out.println(a);
		System.out.println(b);
	}

}
