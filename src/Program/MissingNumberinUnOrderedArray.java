package Program;

public class MissingNumberinUnOrderedArray {
	public static void main(String[] args) {
		int sum1=0,sum2=0;
		int a[]= {2,1,5,4};
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		for(int j=0;j<=5;j++) {
			sum2=sum2+j;
		}
		System.out.println(sum2-sum1);
	}

}
