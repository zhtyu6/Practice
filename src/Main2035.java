import java.util.Scanner;

public class Main2035 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			if(A==0&&B==0) {
				break;
			}
			int sum=1;
			for(int i=0;i<B;i++) {
				sum*=A;
				sum%=1000;
			}
			System.out.println(sum);
		}
	}

}
