import java.util.Scanner;

public class Main2013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while(sc.hasNext()) {
		int n =sc.nextInt();
		int num=0;
		int d=0;
		for (int i=n;i>0;i--) {
			if(i==n) {
				d=1;
			}else {
				d=(d+1)*2;				
			}
		}
		System.out.println(d);
		}
	}

}
