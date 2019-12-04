
import java.util.Scanner;

		public class Main2548 {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				while(sc.hasNext()){
					int n=sc.nextInt();
					for(int i=1;i<=n;i++){
						double u=sc.nextDouble();
						double v=sc.nextDouble();
						double w=sc.nextDouble();
						double l=sc.nextDouble();
						double sum=0;
						double t=0;
						t=l/(u+v);
						sum=t*w;
						System.out.println(String.format("%.3f", sum));
					}
				}
			}

}
