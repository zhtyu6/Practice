import java.util.Scanner;

public class Main2025 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()) {
			String a=sc.next();
			char[] b=a.toCharArray();
			char max=(char) getMax(b);
			for(int i=0;i<b.length;i++) {
				if(i==0&&i==max) {
					System.out.println(b[0]+("max"));
				}else if(b[i]==max) {
					System.out.print(b[i]+"(max)");
				}else {
					System.out.print(b[i]);
				}
				
			}System.out.println();
		}
	}

	private static int getMax(char[] b) {
		int max=b[0];
		for(int i=0;i<b.length;i++) {
			if(b[i]>max) {
				int x= max;
				max=b[i];
				}
		}
		return max;
	}

}
