package Program;

public class LetterCount {
	public static void main(String[] args) {
	 String a="This is Java !@# 123";
	 
	 String small="";
	 int count=0;
	 String caps="";
	 int count1=0;
	 String number="";
	 int count2=0;
	 String special="";
	 int count3=0;
	 for(int i=0;i<a.length();i++) {
		 char ch=a.charAt(i);
		 if(ch>='a' && ch<='z') {
			 small=small+ch;
			 count=count+1;
			}
		 else if(ch>='A' && ch<='Z') {
			 caps=caps+ch;
			 count1=count1+1;
			 }
		 else if(ch>='1' && ch<='9') {
			 number=number+ch;
			 count2=count2+1;
		 }
		 else {
			 special=special+ch;
			 count3=count3+1;
		 }
	 }
	 System.out.println("Small Letter:"+small);
	 System.out.println("Percentage:"+count*100/a.length()+"%");
	 
	 System.out.println("Capital Letter:"+caps);
	 System.out.println("Percentage:"+count1*100/a.length()+"%");
	 
	 System.out.println("Number:"+number);
	 System.out.println("Percentage:"+count2*100/a.length()+"%");
	 
	 System.out.println("Special Char:"+special);
	 System.out.println("Percentage:"+count3*100/a.length()+"%");
}
}
