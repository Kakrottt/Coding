package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class subArray0Sum {
    public static boolean is0Sum(int[] arr) {
        HashSet<Integer> h = new HashSet<>();
        int pre_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            pre_sum += arr[i];
            if(h.contains(pre_sum))
                return true;
            if(pre_sum==0)
                return true;
            h.add(pre_sum);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(is0Sum(arr));
        sc.close();
    }
}
