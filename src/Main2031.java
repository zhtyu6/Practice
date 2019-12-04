import java.util.Scanner;

public class Main2031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			String b=Integer.toString(n, m);
			System.out.println(b.toUpperCase());
		}
	}

}
