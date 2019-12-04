import java.util.Arrays;
import java.util.Scanner;

public class Main2028 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int sum=1;
			int k=0;
			int [] num=new int[n];
			for(int i=0;i<n;i++) {
				num[i]=sc.nextInt();
			}
			/*for(int i=0;i<n;i++) {
				sum*=num[i];
			}*/
			Arrays.sort(num);
				for(int j=0;j<num.length-1;j++) {
					int x=1;
					int s=num[j];
					for(int i=s;k<j+1;i++) {
						if(i%num[j+1]==0) {
						x=i;
						k++;
						System.out.println(k);
						}
				}
					if(k==num.length) {
						System.out.println(x);
					}
			}
		}
	}

}
