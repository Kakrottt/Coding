package Striver;

import java.util.List;
// import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class recursion_subSetSum {
    static List<List<Integer>> ans = new ArrayList<>();
    // public static void soln(int idx, int[] arr, int n, ArrayList<Integer> arrl, int sum) {
    //     if(idx == n){
    //         ans.add(sum);
    //         return;
    //     }

    //     soln(idx+1, arr, n, arrl, sum);
    //     sum += arr[idx];
    //     arrl.add(arr[idx]);
    //     soln(idx+1, arr, n, arrl, sum);
    //     sum -= arr[idx];
    //     arrl.remove(arrl.size()-1);
    // }

    static int minK = 1;
    static int maxK = 5;
    public static void subset(int idx, int[] arr, int n, ArrayList<Integer> ds){
        if(idx == n){
            if(ds.size()>0)
                ans.add(new ArrayList<>(ds));
            return;
        }

        subset(idx+1, arr, n, ds);
        if(arr[idx] >= minK && arr[idx] <= maxK){
            ds.add(arr[idx]);
            subset(idx+1, arr, n, ds);
            ds.remove(ds.size()-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // soln(0, arr, n, new ArrayList<Integer>(), 0);
        // Collections.sort(ans);
        subset(0, arr, n, new ArrayList<>());

        System.out.print(ans + " ");
    }
}
