package Program;

import java.util.Arrays;

public class SmallestandHighestNumber {
	public static void main(String[] args) {
		int a[]= {10,20,5,44,13};
		int small=a[0];
		int large=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<small) {
				small=a[i];
			}
			else if(a[i]>large) {
				large=a[i];
			}
		}
		System.out.println("Given Number:"+Arrays.toString(a));
		System.out.println("Smallest:"+small);
		System.out.println("Largest:"+large);
	}

}
