import java.util.Scanner;

public class Main2020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int score[] = new int[n];
			if (n == 0) {
				break;
			}
			for(int i=0;i<=score.length-1;i++) {
				score[i]=sc.nextInt();
			}
			for (int i = 1; i <= score.length - 1; i++) {
				for (int j = 0; j <= score.length - 1 - i; j++) {
					int x=Math.abs(score[j]);
					int y=Math.abs(score[j+1]);
					if (x<y) {
						int temp = score[j];
						score[j] = score[j + 1];
						score[j + 1] = temp;
					}
				}
			}
			for (int m = 0; m < score.length; m++) {
				System.out.print(score[m]);
				if(m+1==n) {break;}
				System.out.print(" ");
			}System.out.println();
		}
	}
}
