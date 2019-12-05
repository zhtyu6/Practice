import java.util.Scanner;

public class Main2044 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        long []m=new long [51];
        m[1]=0;
        m[2]=1;
        m[3]=2;
        for(int i=4;i<=50;i++) {
            m[i]=m[i-1]+m[i-2];
        }
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(m[b-a+1]);
        }
    }
}
