
import java.util.Scanner;

public class Main2043 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			sc.nextLine();
			for (int j = 1; j <= n; j++) {
				String a = sc.nextLine();
				char[] b = a.toCharArray();
				if (b.length >= 8 && b.length <= 16) {
					int S1 = 0;
					int S2 = 0;
					int S3 = 0;
					int S4 = 0;
					for (int i = 0; i < b.length; i++) {
						if (b[i] >= 'A' && b[i] <= 'Z' ) {
							S1=1;
						}else if (b[i] <= '9' && b[i] >= '0') {
							S2=1;
						}else if (b[i] >= 'a' && b[i] <= 'z') {
							S3=1;
						}else {
							S4=1;
						}
					}
					if (S1 + S2 + S3 + S4 >= 3) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				}
				else {
					System.out.println("NO");
				}
			}

		}
	}
}
