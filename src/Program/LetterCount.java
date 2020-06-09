package Program;

public class LetterCount {

	public static void main(String[] args) {
		String a="This is Java Program $%%123";
		
		String small="";
		int count=0;
		String large="";
		int count1=0;
		String Numbers="";
		int count2=0;
		String Special="";
		int count3=0;
		
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch>='a' && ch<='z') {
				small=small+ch;
				count=count+1;
			}
			else if(ch>='A' && ch<='Z') {
				large=large+ch;
				count1=count1+1;
			}
			else if(ch>='0' && ch<='9') {
				Numbers=Numbers+ch;
				count2=count2+1;
			}
			else {
				Special=Special+ch;
				count3=count3+1;
			}
		}
		
		System.out.println("Number of Small Letter:"+small+"   "+"Count:"+count);
		System.out.println("Percentage:"+count*100/a.length()+"%");
		
		System.out.println("Number of large Letter:"+large+"   "+"Count:"+count1);
		System.out.println("Percentage:"+count1*100/a.length()+"%");
		
		System.out.println("Number of Numbers:"+Numbers+"   "+"Count:"+count2);
		System.out.println("Percentage:"+count2*100/a.length()+"%");
		
		System.out.println("Number of Special Letter:"+Special+"   "+"Count:"+count3);
		System.out.println("Percentage:"+count3*100/a.length()+"%");
	}

}
