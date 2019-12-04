import java.util.Arrays;
import java.util.Scanner;

public class Main2039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		double [] c=new double [3];
		for(int i=1;i<=n;i++) {
			for(int j=0;j<3;j++) {
				c[j]=sc.nextDouble();
			}
			Arrays.sort(c);
			if(c[0]+c[1]>c[2]&&c[2]+c[1]>c[0]&&c[0]+c[2]>c[1]) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
