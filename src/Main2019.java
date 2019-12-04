import java.util.*;
public class Main2019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(m==0&&n==0){
			System.exit(0);
		}
		int [] a = new int [n+1];
		for(int i = 0; i< n;i++){
			a[i] = sc.nextInt();
		}
		a[n] = m;
		Arrays.sort(a);
		for(int i = 0 ;i< n+1;i++){
			if(i==0){
			System.out.print(a[i]);
		}else
			System.out.print(" "+a[i]);
	}
		System.out.println();
}
	}
}