import java.util.Scanner;

public class Main2016 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n=sc.nextInt();
			int []score=new int [n];
			if(n==0) {
				break;
			}
			for(int i=0;i<=score.length-1;i++) {
				score[i]=sc.nextInt();
			}
			int min=getMin(score);
			for(int i=0;i<=score.length-1;i++) {
				if(min==score[i]) {
					int t=score[0];
					score[i]=t;
					score[0]=min;
				}
			
			}
			for(int i=0;i<=score.length-1;i++) {
				System.out.print(score[i]);
				if(i+1==n) {
					break;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	private static int getMin(int[] score) {
		int min=score[0];
		for(int i=0;i<=score.length-1;i++) {
			if(min>score[i]) {
				min=score[i];
			}
		}
		return min;
	}

}
