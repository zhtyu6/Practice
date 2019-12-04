import java.util.Scanner;

public class Main2051 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			String b=Integer.toUnsignedString(n, 2);
			System.out.println(b.toUpperCase());
		}
	}

}
