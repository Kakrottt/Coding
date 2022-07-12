package Recurssion;

import java.util.Scanner;

public class printNto1 {
    public static void print(int n) {
        if(n==0)
            return;
        else{
            System.out.println(n);
            print(n-1);
            // System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);

        sc.close();
    }
}
