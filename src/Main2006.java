import java.util.Scanner;

public class Main2006 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int x=sc.nextInt();
			int a=1;
			for(int i=1; i<=x ; i++) {
				int b =sc.nextInt();
			if(b%2!=0) {
				a*=b;
			}
			}
			System.out.println(a);
		}
	}
}
