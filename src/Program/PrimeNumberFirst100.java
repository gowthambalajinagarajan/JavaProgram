package Program;

public class PrimeNumberFirst100 {

	public static void main(String[] args) {
		int count=0;
		
		for(int i=1;i<=100;i++) {
			boolean flag=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=false;
				}
			}
			if(flag) {
				System.out.println(i);
				count=count+1;
			}
		}
	}
}
