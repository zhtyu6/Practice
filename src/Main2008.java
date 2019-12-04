import java.util.Scanner;

public class Main2008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			double[] arr = new double[n];
			int a = 0;
			int b = 0;
			int c = 0;
			for (int x = 0; x < n; x++) {
				arr[x] = sc.nextDouble();
				if (arr[x] > 0) {
					a++;
				} else if (arr[x] < 0) {
					b++;
				} else {
					c++;
				}
			}System.out.println(a + "" + b + "" + c);
		}
	}
}
