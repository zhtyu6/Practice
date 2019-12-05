import java.util.Scanner;

public class Main2045 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            long[] m = new long[50];
            m[0] = 3;
            m[1] = 6;
            m[2]=6;
            m[3]=18;
            for (int i = 3; i < 50; i++) {
                m[i] = m[i - 1] + 2*m[i - 2];
            }
            int n = sc.nextInt();
            System.out.println(m[n - 1]);
        }
    }


}
