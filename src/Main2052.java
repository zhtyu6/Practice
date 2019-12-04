import java.util.Scanner;

public class Main2052 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			int h=sc.nextInt();
			int d=sc.nextInt();
			for(int i=0;i<d+2;i++) {
				for(int j=0;j<h+2;j++) {
					if((i==0&&j==0)||(i==0&&j==h+1)||(i==d+1&&j==0)||(i==d+1&&j==1+h)) {
						System.out.print("+");
					}else if(i==0||i==d+1) {
						System.out.print("-");
					}else if(j==0||j==h+1) {
						System.out.print("|");
					}else {
						System.out.print(" ");
					
					}
				
			}
			System.out.println();
		}
			System.out.println();
	}

}
}