package Recurssion;

import java.util.Scanner;

public class subsetSumProblem {
    public static int soln(int[] arr,int n, int sum) {
        if(n==0)
            return sum == 0? 1 : 0;
        return soln(arr, n-1, sum) + soln(arr, n-1, sum-arr[n-1]);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(soln(arr, n, sum));
        sc.close();
    }
}
