import java.util.Scanner;

public class Main2040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int k = sc.nextInt();
			for (int j = 1; j <= k; j++) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				int sum = 0;
				for (int i = 1; i < m; i++) {
					if (m % i == 0) {
						sum = sum + i;
					}
				}
				if (sum == n) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}

}
