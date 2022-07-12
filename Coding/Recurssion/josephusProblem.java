package Recurssion;

import java.util.Scanner;

public class josephusProblem {
    public static int jos(int n, int k) {
        if(n==1)
            return 0;
        else
            return (jos(n-1, k)+k)%n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(jos(n, k));
        sc.close();

    }
}
