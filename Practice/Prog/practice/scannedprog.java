package Prog.practice;

import java.util.Scanner;

public class scannedprog {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x + y;

        System.out.println(sum);

        int z = sc.nextInt();
        System.out.println(z);
        }
}
