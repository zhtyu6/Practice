import java.util.Scanner;

public class Main2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int sum = 0;
			if (n == 0) {
				break;
			}
			if (n == 1) {
				System.out.println(n);
				continue;
			}
			int year4 = 1;
			int year3 = 0;
			int year2 = 0;
			int year1 = 0;
			int c = 0;
			for (int i = 0; i < n-1; i++) {
				year4 += year3;
				year3 = year2;
				year2 = year1;
				year1 = year4;
				c = year1 + year2 + year3 + year4;
			}
			System.out.println(c);
		}
	}
}
