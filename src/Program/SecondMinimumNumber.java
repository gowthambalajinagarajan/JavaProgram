package Program;

public class SecondMinimumNumber {
	public static void main(String[] args) {
		int a[]= {-12,45,-23,64,-100,24};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

		System.out.println("The Second Minimum Number is:"+a[a.length-2]);
	}
}
