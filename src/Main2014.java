import java.util.Scanner;

public class Main2014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int sum = 0;
			int[] score = new int[n];
			if (n > 2 & n <= 100) {
				for (int i = 0; i < score.length; i++) {
					score[i] = sc.nextInt();
					sum += score[i];
				}
				int max = score[0];
				int min = score[0];
				for (int i = 1; i < score.length; i++) {
					if (score[i] >= max) {
						max = score[i];
					}
					if (score[i] <= min) {
						min = score[i];
					}
				}
				double s = n - 2.0;
				double avg = (sum - max - min) / s;
				System.out.println(String.format("%.2f", avg));
			}
		}
	}

}
