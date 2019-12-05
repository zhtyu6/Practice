import java.util.Scanner;
public class Hdu2081 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            long a=sc.nextLong();
            long c=a%100000;
            System.out.println(c+600000);
        }
    }


}
