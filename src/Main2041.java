import java.util.Scanner;

public class Main2041 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				int m=sc.nextInt();
				if(m<=3) {
				if(m==1) {
					System.out.println(0);
				}
				if(m==2) {
					System.out.println(1);
				}
				if(m==3) {
					System.out.println(2);
				}}else {
				int [] b=new int [m];
				for(int j=3;j<m;j++) {
					b[1]=1;
					b[2]=2;
					b[j]=b[j-1]+b[j-2];
				}
				System.out.println(b[m-1]);
				}
			}
		}
	}
}
