package Program;

public class ArrayWithoutSorting {

	public static void main(String[] args) {
		int a[]= {34,12,56,76,34};
		int large=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>large) {
				large=a[i];
			}
		}
		System.out.println("Largest Number:"+large);
	}

}
