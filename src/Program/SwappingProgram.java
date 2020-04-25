package Program;

public class SwappingProgram {

	public static void main(String[] args) {
		int a[]= {10,20,15,25,30,48,77};
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
