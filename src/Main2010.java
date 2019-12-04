
import java.util.Scanner;

public class Main2010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			String result = "";
			for (int i = m; i <= n; i++) {
				int a = i / 100;
				int b = i / 10 % 10;
				int c = i % 10;
				if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i) {
					result += i + " ";
				}
			}
			result = result.trim();
			if ("".equals(result)) {
				result = "no";
			}
			System.out.println(result);
		}

	}
}