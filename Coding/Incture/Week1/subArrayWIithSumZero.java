package Incture.Week1;

import java.util.HashMap;
import java.util.Scanner;

public class subArrayWIithSumZero {
    private void soln(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum == 0){
                printSoln(arr, 0, i+1);
            }
            else if(map.get(sum) != null){
                printSoln(arr, map.get(sum)+1, i+1);
            }
            else
                map.put(sum, i);
        }
    }

    private void printSoln(int[] arr, int s, int e){
        for (int i = s; i < e; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        subArrayWIithSumZero obj = new subArrayWIithSumZero();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();            
        }

        obj.soln(arr, n);
        sc.close();
    }
}
