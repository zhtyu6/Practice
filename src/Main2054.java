import java.math.BigDecimal;
import java.util.Scanner;

public class Main2054 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			BigDecimal A=sc.nextBigDecimal();
			BigDecimal B=sc.nextBigDecimal();
			if(A.compareTo(B)==0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
