import java.util.Scanner;

public class Main2101 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int n=sc.nextInt();
		int m=sc.nextInt();
		if((m+n)%86==0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
}
