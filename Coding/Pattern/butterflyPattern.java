package Pattern;

import java.util.Scanner;

public class butterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }

            for (int j = i; j <= (10-(2*i)); j++) {
                System.out.print(" k");
            }

            for (int j = 5; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
