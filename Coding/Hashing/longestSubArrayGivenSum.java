package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class longestSubArrayGivenSum {
    public static int maxLen(int[] arr, int sum) {
       int pre_sum = 0, res = 0;
       HashMap<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            pre_sum += arr[i];
            if(pre_sum==sum){
                res = i+1;
            }
            if(m.containsKey(pre_sum)==false){
                m.put(pre_sum, i);
            }
            if(m.containsKey(pre_sum-sum)){
                res = Math.max(res, i-m.get(pre_sum-sum));
            }
        }
        return res;
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = sc.nextInt();

        System.out.println(maxLen(arr, sum));

        sc.close();
    }
}
