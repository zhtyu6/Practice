import java.util.Scanner;

public class Main2024{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			String b = sc.nextLine();
			for (int i = 0; i < a; i++) {
				String c = sc.nextLine();
				int m = 0;
				char d[] = new char[c.length()];
				d = c.toCharArray();
				loop: Loop: for (int j = 0; j < c.length(); j++) {
					if (j == 0) {
						if (d[j] == '_' || d[j] >= 'A' && d[j] <= 'z' ) {
							m++;
						} else {
							System.out.println("no");
							break Loop;
						}
					} else {
						if (d[j] == '_' || d[j] >= 'A' && d[j] <= 'z'|| d[j] >= '0' && d[j] <= '9') {
							m++;
						} else {
							System.out.println("no");
							break loop;
						}
					}
				}
				if (m == c.length()) {
					System.out.println("yes");
				}
			}

		}
	}

}