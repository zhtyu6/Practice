import java.util.Scanner;
	
	public class Main2032 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        while (sc.hasNext()) {
	        	int sum=0;
	        	int n=sc.nextInt();
	        	int [] [] a=new int [n][n];
	        	for(int i=0;i<a.length;i++) {
	        		a[i][0]=1;
	        	}
	        	for(int i=1;i<a.length;i++) {
	        		for(int j=1;j<=i;j++) {
	        			a[i][j]=a[i-1][j]+a[i-1][j-1];
	        		}
	        	}
	        	for(int i=0;i<a.length;i++) {
	        		for(int j=0;j<=i;j++) {
	        		if(sum==0) {
	        			System.out.print(a[i][j]);
	        			sum++;
	        		}else {
	        			System.out.print(" "+a[i][j]);
	        		}
	        		}
	        		sum=0;
	        		System.out.println();
	        	}
	        	System.out.println();
	        	
	        }
	
	    }
	
	}