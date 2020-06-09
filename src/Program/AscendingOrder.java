package Program;

import java.util.Scanner;

public class AscendingOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Element");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the numbers");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending Order");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

}
