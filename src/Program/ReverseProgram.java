package Program;

public class ReverseProgram {

	public static void main(String[] args) {
		String a="Program";
		char ch[]=a.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	}
}
