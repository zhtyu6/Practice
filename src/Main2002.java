import java.util.Scanner;

public class Main2002 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()) {
			double r=sc.nextDouble();
			double PI=3.1415927;
			double V=4.0/3*PI*r*r*r;
			System.out.printf("%.3f",V);
			System.out.println();
		}

	}

}
