import java.util.Scanner;

public class Main2029 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();

			sc.nextLine();
			for (int i = 1; i <= n; i++) {
				String a = sc.nextLine();
				char[] b = a.toCharArray();
				if (b.length % 2 == 1) {
					int x = 0;
					int c = (b.length) / 2;
					for (int j = 0; j < c; j++) {
						if (b[j] == b[b.length - 1 - j]) {
							x++;
						}
					}
					if (b.length / 2 == x) {
						System.out.println("yes");
					} else {
						System.out.println("no");
					}
				} else {
					int x = 0;
					int c = (b.length) / 2;
					for (int j = 0; j < c; j++) {
						if (b[j] == b[b.length - 1 - j]) {
							x++;
						}
					}
					if (b.length / 2 == x) {
						System.out.println("yes");
					} else {
						System.out.println("no");
					}

				}
			}
		}
	}
}
