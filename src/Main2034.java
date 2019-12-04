import java.util.Arrays;
import java.util.Scanner;

public class Main2034 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int m=sc.nextInt();
			if(n==0&&m==0) {
				break;
			}
			int [] a=new int [n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			int [] b=new int [m];
			for(int i=0;i<m;i++) {
				b[i]=sc.nextInt();
			}
			int k=0;
			int c=0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(a[i]==b[j]) {
						b[j]=0;
						a[i]=0;
						c++;
					}
				}
				Arrays.sort(a);
				if(a[i]!=0) {
					System.out.print(a[i]+" ");
					a[i]=0;
				}
				
				}
			if(c==a.length) {
				System.out.print("NULL");
			}
			System.out.println();
		}
	}
}
