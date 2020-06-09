package Program;

public class SwappingSecondNumber {

	public static void main(String[] args) {
		int a[]= {12,34,54,67,33,24,99};
		for(int i=0;i<a.length-1;i=i+2) {
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
