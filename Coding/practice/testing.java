package practice;
import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int K= (int)(Math.log(n)/Math.log(2));

        // K = (int)Math.pow(2, K+1);

        int i = sc.nextInt();
        int j = sc.nextInt();
        // int j = sc.nextInt();
        // int k = sc.nextInt();

        if((i&j)%2==(i|j)%2)
            System.out.println("Same");
            else
                System.out.println("Not Same");
        // double m = Math.pow((0.143*i), i);
        // System.out.println(m);
        // m = m - (int)m;
        // String s = sc.next();

        // int m = ( (i|j) & (j|k) & (k|i));

            // System.out.println(m);

        // System.out.println(m);
        sc.close();
    }
}
