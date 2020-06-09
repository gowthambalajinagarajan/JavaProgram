package Program;

public class PalindromeNumberCount {

	public static void main(String[] args) {
		int count=0;
		for(int b=1;b<=1000;b++) {
			int a=0,c=0,d=0;
			a=b;
			while(a>0) {
				c=a%10;
				d=(d*10)+c;
				a=a/10;
			}
			if(b==d) {
				count=count+1;
			}
		}
		System.out.println(count);
	}
}
