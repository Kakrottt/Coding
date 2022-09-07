package Striver;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class recursion_subSetSum {
    static List<Integer> ans = new ArrayList<>();
    public static void soln(int idx, int[] arr, int n, ArrayList<Integer> arrl, int sum) {
        if(idx == n){
            ans.add(sum);
            return;
        }

        soln(idx+1, arr, n, arrl, sum);
        sum += arr[idx];
        arrl.add(arr[idx]);
        soln(idx+1, arr, n, arrl, sum);
        sum -= arr[idx];
        arrl.remove(arrl.size()-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        soln(0, arr, n, new ArrayList<Integer>(), 0);
        Collections.sort(ans);
        System.out.print(ans + " ");
    }
}
