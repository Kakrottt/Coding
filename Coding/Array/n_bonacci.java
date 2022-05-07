package Array;

import java.util.Scanner;

public class n_bonacci {
    static void nBonacci(int k, int m){
        int[] arr = new int[m];
        arr[k-1] = 1;
        arr[k] = 1; 
        int sum = 2;

        for (int i = k+1; i < m; i++) {
            arr[i] = sum;
            sum = sum+arr[i]-arr[i-k];
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();

        nBonacci(k, m);
        sc.close();
    }
}
