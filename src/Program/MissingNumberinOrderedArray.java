package Program;

import java.util.Scanner;

public class MissingNumberinOrderedArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,6,7};
		for(int i=0,j=1;i<a.length-1;i++,j++) {
			if(!(a[i]==j)) {
				System.out.println(j);
				break;
			}
		}
	}
}
