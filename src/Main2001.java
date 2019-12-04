import java.util.Scanner;

public class Main2001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
				double x1 = sc.nextDouble();
				System.out.print("");
				double y1 = sc.nextDouble();
				System.out.print("");
				double x2 = sc.nextDouble();
				System.out.print("");
				double y2 = sc.nextDouble();
				double Z1 = (x1-x2)*(x1-x2);
				double Z2 = (y1-y2)*(y1-y2);
				double x = Math.sqrt(Z1+Z2);
				System.out.printf("%.2f",x);
				System.out.println();
		}

}
}