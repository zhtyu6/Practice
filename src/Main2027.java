import java.util.Scanner;

public class Main2027 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
            for(int k=1;k<=n;k++) {
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            int num4 = 0;
            int num5 = 0;
                String a = sc.nextLine();
                char[] b = a.toCharArray();
                for (int i = 0; i < b.length; i++) {
                    if (b[i]=='a') {
                        num1=num1+1;
                    }
                    if (b[i] == 'e') {
                        num2=num2+1;
                    }
                    if (b[i] == 'i') {
                        num3=num3+1;
                    }
                    if (b[i] == 'o') {
                        num4=num4+1;
                    }
                    if (b[i] == 'u') {
                        num5=num5+1;
                    }
                }
                    System.out.println("a:" + num1);
                    System.out.println("e:" + num2);
                    System.out.println("i:" + num3);
                    System.out.println("o:" + num4);
                    System.out.println("u:" + num5);
                    if(k!=n) {
                    	System.out.println();
                    }
                }
                
        }
    }

