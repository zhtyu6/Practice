import java.util.Scanner;

public class Main2004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int t =sc.nextInt();
			if (100 >=t && t>=90) {
				System.out.println("A");
			}else if (90 >t && t>=80) {
				System.out.println("B");
			}else if (80 >t && t>=70) {
				System.out.println("C");
			}else if (70 >t && t>=60) {
				System.out.println("D");
			}else if (60 >t && t>=0) {
				System.out.println("E");
			}else {
				System.out.println("Score is error!");
			}
		}
	}
}
