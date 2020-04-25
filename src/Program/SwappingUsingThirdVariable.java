package Program;

import java.util.Scanner;

public class SwappingUsingThirdVariable {

	public static void main(String[] args) {
		int a,b;
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		b=c-b;
		a=c-b;
		System.out.println("Swapping Numbers");
		System.out.println(a);
		System.out.println(b);
	}

}
