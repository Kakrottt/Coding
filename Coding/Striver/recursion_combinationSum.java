package Striver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class recursion_combinationSum {
    public static void printS(int[] arr, int n, int i, List<Integer> arrl, int sum) {
        if(i == n){
            if(sum == 0){
                System.out.println(arrl);
                return;
            }
            else
                return;
        }

        if(arr[i]<=sum){
            arrl.add(arr[i]);
            printS(arr, n, i, arrl, sum-arr[i]);
            arrl.remove(arrl.size()-1);
        }
        printS(arr, n, i+1, arrl, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        List<Integer> arrl = new ArrayList<>();
        int sum = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printS(arr, n, 0, arrl, sum);
        
        sc.close();
    }
}
