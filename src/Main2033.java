import java.util.Scanner;

public class Main2033 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int AH=sc.nextInt();
			int AM=sc.nextInt();
			int AS=sc.nextInt();
			int BH=sc.nextInt();
			int BM=sc.nextInt();
			int BS=sc.nextInt();
			int H=0;
			int M=0;
			int S=0;
			int g=0;
			if((AS+BS)>60) {
				g=(AS+BS)/60;
				S=AS+BS-g*60;
				M=M+g;
				g=0;
			}else {
				S=AS+BS;
			}
			if((M+AM+BM)>60) {
				g=(M+AM+BM)/60;
				M=(M+AM+BM)-g*60;
				H=H+g;
				g=0;
			}else {
				M=AM+BM;
			}
			if((H+AH+BH)>24) {
				g=(H+AH+BH)/24;
				H=(H+AH+BH);
			}else {
				H=AH+BH;
			}
			System.out.println(H+" "+M+" "+S);
		}
	}

}
