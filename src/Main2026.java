import java.util.Scanner;

public class Main2026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
        	String a=scanner.nextLine();
        	for(int i=0;i<a.length();i++) {
        		if(i==0||a.charAt(i-1)==' ') {
        			System.out.print((char)(a.charAt(i)-32));
        		}
        		else {
        			System.out.print(a.charAt(i));
        		}
        		
        	}
        }
        System.out.println();
    }

}