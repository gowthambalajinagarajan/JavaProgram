package Program;

public class Pattern13465 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=i;j<=4;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}




/*for(int i=1;i<=9;i=i+2) {
	for(int j=9;j>=i;j=j-2) {
		System.out.print(j);
	}
	System.out.println();
}*/

/*int k=1;
for(int i=1;i<=4;i++) {
for(int j=1;j<i+1;j++) {
	System.out.print(k++ +" ");
}
System.out.println();
}*/

/*for(int i=1;i<=4;i++) {
for(int j=i;j<=4;j++) {
System.out.print(" ");
}
for(int k=1;k<=i;k++) {
System.out.print("* ");
}
System.out.println();
}*/