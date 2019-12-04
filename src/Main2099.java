import java.util.Scanner;

public class Main2099 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0) {
				break;
			}
			int k = 0;
			int c = a * 100;
			for (int i = 0; i < 100; i++) {
				if ((c + i) % b == 0) {
					if (k == 0) {
						if (i<10) {
							System.out.print("0"+i);
							k++;
						} else {
							System.out.print(i);
							k++;
						}
					} else {
						System.out.print(" " + i);
					}
				}
			}
			System.out.println();
		}
	}

}
