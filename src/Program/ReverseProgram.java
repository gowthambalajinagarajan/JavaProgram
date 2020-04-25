package Program;

import java.util.Scanner;

public class ReverseProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Word");
		String a=sc.next();
		char ch[]=a.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
	}

}
