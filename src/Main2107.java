import java.util.Arrays;
import java.util.Scanner;

public class Main2107 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			if(n==0) {break;}
			int []m =new int [n];
			for(int i=0;i<n;i++) {
				m[i]=sc.nextInt();
			}
			Arrays.sort(m);
			System.out.println(m[m.length-1]);
		}
	}

}
