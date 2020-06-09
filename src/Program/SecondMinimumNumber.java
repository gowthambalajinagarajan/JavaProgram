package Program;

import java.util.Scanner;

public class SecondMinimumNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of Element");
		int n=sc.nextInt();
		System.out.println("Enter the numbers");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Second Smallest Number:"+a[a.length-2]);
	}

}
