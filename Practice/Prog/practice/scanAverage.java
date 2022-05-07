package Prog.practice;

import java.util.Scanner;

public class scanAverage {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.print("Number " + i + ": ");
            int input = sc.nextInt();
            arr[i] = input;
            sum = sum + input;
        }
        
        int av = sum/10;
        System.out.println("Total Sum : " + sum);
        System.out.println("Average : " + av);
    }
}
