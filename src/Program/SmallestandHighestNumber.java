package Program;

public class SmallestandHighestNumber {

	public static void main(String[] args) {
		int a[]= {1,3,4,24,2,1,23,4,3332,5664,343434};
		int small=a[0];
		int large=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>large) {
				large=a[i];
			}
			else if(a[i]<small) {
				small=a[i];
			}
		}
		System.out.println("Smallest Number is:"+small);
		System.out.println("Largest Number is:"+large);
	}

}
