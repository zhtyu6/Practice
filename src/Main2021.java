import java.util.Scanner;

public class Main2021 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		while (sc.hasNext()) {
			int n=sc.nextInt();
			int [] num=new int [n];
			if(n==0) {break;}
			for(int i=0;i<num.length;i++) {
				num[i]=sc.nextInt();
			}
			int t=0;
			for(int k=0;k<num.length;k++) {
				if(num[k]>=100) {
					t=num[k]/100+t;
					num[k]=num[k]%100;
				}
				if(num[k]>=50) {
					t=num[k]/50+t;
					num[k]=num[k]%50;
				}
				if(num[k]>=10) {
					t=num[k]/10+t;
					num[k]=num[k]%10;
				}
				if(num[k]>=5) {
					t=num[k]/5+t;
					num[k]=num[k]%5;
				}
				if(num[k]>=2) {
					t=num[k]/2+t;
					num[k]=num[k]%2;
				}
				if(num[k]>=1) {
					t=num[k]/1+t;
					num[k]=num[k]%1;
				}
					}
			System.out.println(t);
				}
			}
		}
