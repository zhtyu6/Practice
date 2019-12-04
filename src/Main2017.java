import java.util.*;

public class Main2017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int n=sc.nextInt();
        	for(int j=1;j<=n;j++) {
        		String a=sc.next();
        		char[] b=a.toCharArray();
        		int k=0;
        		for(int i=0;i<b.length;i++) {
        			if(b[i]<='9'&&b[i]>='0') {
        				k++;
        			}
        		}
        		System.out.println(k);
        	}
        }
    }
}