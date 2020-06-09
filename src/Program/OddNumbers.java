package Program;

public class OddNumbers {

	public static void main(String[] args) {
		int sum=0;
		int count=0;
		for(int i=0;i<=100;i++) {
			if(i%2==1) {
				sum=sum+i;
				count=count+1;
			}
		}
		System.out.println(sum);
		System.out.println(count);

	}

}
