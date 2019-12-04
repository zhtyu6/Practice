import java.util.Scanner;

public class Main2003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		while(sc.hasNext()) {
			double A=sc.nextDouble();
			double B=Math.abs(A);
			System.out.printf("%.2f",B);
			System.out.println();
		}
	}

}
