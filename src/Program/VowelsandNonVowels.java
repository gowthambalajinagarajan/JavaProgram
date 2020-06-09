package Program;

public class VowelsandNonVowels {

	public static void main(String[] args) {
		String a="This is a Java Program";
		int vowels=0;
		int nonvowels=0;
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				vowels++;
			}
			else {
				nonvowels++;
			}
		}
		System.out.println("Number of Vowels:"+vowels);
		System.out.println("Number of Non-Vowels:"+nonvowels);
	}
}
