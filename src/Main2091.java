import java.util.Scanner;

public class Main2091 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int	k=0;
		while(sc.hasNext()) {
			String c=sc.next();
			if(c.equals("@")) {
				break ;
			}else if(k!=0){
				System.out.println();
			}
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				for(int j=0;j<n+i;j++) {
					if(i==0) {
						if(j==n-1) {
							System.out.print(c);
						}else {
							System.out.print(" ");
						}
					}else if(i!=n-1){
						if(j==n+i-1) {
							System.out.print(c);
						}else if(j==n-i-1) {
							System.out.print(c);
						}else {
							System.out.print(" ");
						}
					}else {
						System.out.print(c);
					}
				}
				System.out.println();
			}k++;
		}
	}
}
