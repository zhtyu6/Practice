import java.util.Scanner;

public class Main2009 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	while(sc.hasNext()) {
		double n=sc.nextDouble(),S=n,num=0;
		int m=sc.nextInt();
		for(int i=1;i<m;i++) {
			n=Math.sqrt(n);
			num+=n;
		}
		double y=S+num;
		System.out.printf("%.2f\n\n",y);
			}
	}

}
