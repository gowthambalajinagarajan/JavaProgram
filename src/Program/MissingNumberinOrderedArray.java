package Program;

public class MissingNumberinOrderedArray {

	public static void main(String[] args) {
		int a[]= {1,2,4,5};
		for(int i=0,j=1;i<a.length-1;i++,j++) {
			if(!(a[i]==j)) {
				System.out.println(j);
				break;
			}
		}
	}
}
