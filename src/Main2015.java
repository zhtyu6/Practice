import java.util.Scanner;

public class Main2015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int sum=0;
			for(int i=1;i<=n;i++) {
				sum+=2*i;
				if(i%m==0&&i!=n) {
					System.out.print(sum/m+" ");
					sum=0;
				}
				else if(i==n) {
					System.out.println(n%m==0?sum/m:sum/(n%m));
				}
			}
		}
	}
}