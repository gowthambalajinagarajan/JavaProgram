package Program;

public class EvenNumbers {
	public static void main(String[] args) {
		int count=0;
		int sum=0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				 sum=sum+i;
				 count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);
	}
}
