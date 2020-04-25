package Program;

public class Program {
	public static void main(String[] args) {
		int a[]= {1,2,5,5,2,81,10};
		int first=a[0];
		int second=a[1];
		if(a[0]<a[1]) {
			first=a[1];
			second=a[0];
		}
		for(int i=2;i<a.length;i++) {
			if(a[i]>second) {
				if(a[i]>first) {
					second=first;
					first=a[i];
				}
				else {
					second=a[i];
				}
			}
		}
		System.out.println(second);
		
	}

}
