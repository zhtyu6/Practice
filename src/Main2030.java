import java.util.Scanner;

public class Main2030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=n;i++) {
			String a=sc.nextLine();
			char [] b=a.toCharArray();
			int t=0;
			for(int j=0;j<b.length;j++) {
				int s=b[j];
				if(s>127) {
					t++;
				}
			}System.out.println(t);
		}
	}
}
