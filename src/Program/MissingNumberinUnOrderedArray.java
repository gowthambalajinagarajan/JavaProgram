package Program;

public class MissingNumberinUnorderedArray {

	public static void main(String[] args) {
		int a[]= {1,3,5,6,2};
		int sum=0;
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		for(int j=0;j<=6;j++) {
			sum1=sum1+j;
		}
		System.out.println(sum1-sum);

	}

}
