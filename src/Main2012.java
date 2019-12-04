import java.util.Scanner;

public class Main2012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x==0&&y==0){break;}
            if (-39<=x&&x<y&&y<=50) {
                int k = 0;
                int sum;
                for (int n=x;n<=y;n++) {
                    sum = (n * n) + n + 41;
                    for (int i=2;i<sum;i++) {
                        if (sum%i==0) {
                            k++;
                        }
                    }
                }
                if (k == 0) {
                    System.out.println("OK");
                } else {
                    System.out.println("Sorry");
                }
                
            }
            
        }
    }
}
