import java.util.Scanner;

public class Main2022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int x = 0, y = 0, max = 0;
			int arr[][] = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
					if (i == 0 && j == 0) {
						max = Math.abs(arr[0][0]);
						x = 0;
						y = 0;
					} else if (Math.abs(arr[i][j]) > max) {
						max = Math.abs(arr[i][j]);
						x = i;
						y = j;
					}
				}
			}
			x = x + 1;
			y = y + 1;
			System.out.println(x + " " + y + " " + arr[x - 1][y - 1]);
		}
	}
}