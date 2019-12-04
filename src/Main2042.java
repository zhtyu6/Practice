import java.util.Scanner;

public class Main2042 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int a=sc.nextInt();
			int sum =3;
			for(int j=1;j<=a;j++) {
				sum=(sum-1)*2;
			}System.out.println(sum);
		}
	}

}
