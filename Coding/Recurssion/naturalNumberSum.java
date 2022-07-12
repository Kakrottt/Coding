package Recurssion;

import java.util.Scanner;

public class naturalNumberSum {
    
    public static int printSum(int n ) {
        if(n==0)
            return 0;
        else
            return n+printSum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printSum(n));

        sc.close();
    }
}
