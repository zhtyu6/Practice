import java.util.Scanner;

public class Main2075 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=1;i<=x;i++) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			if(n%m==0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
