import java.util.*;
import java.text.DecimalFormat;

public class Main2011{
	public static void main(String args[]){ 

		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int m = s.nextInt();
			
		int[] a = new int[m];
		for(int i =0;i<m;i++){
			a[i] = s.nextInt();
		}
		for(int j =0;j<a.length;j++){
			double sum = 0;
			for(int i =1;i<=a[j];i++){
				if(i%2==0){
					sum = sum - (double)1/i;
				}else{
					sum = sum + (double)1/i;
				}
			}
			System.out.println(df.format(sum));			
		}
	}
}