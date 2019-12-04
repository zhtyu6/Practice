import java.util.Scanner;

public class Main2023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			double[][] P = new double[n][m];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					P[i][j] = sc.nextDouble();
				}
			}
			for (int i = 0; i < n; i++) {
				double sum = 0;
				for (int j = 0; j < m; j++) {
					sum = P[i][j] + sum;
				}
				double x = sum / m;
				if (i == 0) {
					System.out.print(String.format("%.2f", x));
				} else {
					System.out.print(" " + String.format("%.2f", x));
				}
			}
			System.out.println();
			double[] B = new double[m];
			for(int q=0;q<m;q++) {
				double sum = 0;
			for (int i = 0; i <n; i++) {
				for (int j =q; j <q+1; j++) {
					sum = P[i][j] + sum;
			}
			}
			double x = sum / n;
			B[q] = x;
			if (q == 0) {
				System.out.print(String.format("%.2f", x));
			} else {
				System.out.print(" " + String.format("%.2f", x));
			}
			}
			System.out.println();
			int g = 0;
			for (int i = 0; i < n; i++) {
				int k = 0;
				for (int j = 0; j < m; j++) {
					if (P[i][j] >= B[j]) {
						k++;
					}
				}
				if (k == m) {
					g++;
				}
			}
			System.out.println(g);
			System.out.println();
		}
	}
}
