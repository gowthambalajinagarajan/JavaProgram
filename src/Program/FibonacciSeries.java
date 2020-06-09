package Program;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		/*int a=0;
		int b=1;
		int c=0;
		for(int i=1;i<=10;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		int d=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		while(c<150) {
			c=a+b;
			if(c>d) {
				break;
			}
			a=b;
			b=c;
			System.out.println(c);
		}
		
	}
}
