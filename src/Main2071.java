import java.util.Arrays;
import java.util.Scanner;

public class Main2071 {
	public static void main(String[] args) {
	  Scanner sc=new Scanner (System.in);
	  while(sc.hasNext()) {
		  int n=sc.nextInt();
		  for(int i=1;i<=n;i++) {
			  int m=sc.nextInt();
			  double [] num=new double [m];
			  for(int j=0;j<m;j++) {
				  num[j]=sc.nextDouble();
			  }
			  Arrays.sort(num);
			  double c=num[m-1];
		  System.out.println(String.format("%.2f",c));
		  }
	  }
	}
}
