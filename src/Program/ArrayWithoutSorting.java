package Program;

public class ArrayWithoutSorting {
	public static void main(String[] args) {
		int a[]= {3,42,446,4,5,5,6,464,467};
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
		System.out.println("Smallest Number:"+small);
		System.out.println("Largest Number:"+large);
	}
}
