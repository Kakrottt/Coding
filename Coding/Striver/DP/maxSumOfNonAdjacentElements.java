package Striver.DP;

import java.util.List;

public class maxSumOfNonAdjacentElements {
    public static int solnRec(List<Integer> arr, int idx) {
        if(idx == 0)
            return arr.get(idx);

        if(idx < 0)
            return 0;

        int pick = arr.get(idx) + solnRec(arr, idx - 2);
        int notPick = 0 + solnRec(arr, idx - 1);
        return Math.max(pick, notPick);
    }

    public static int solnMem(List<Integer> arr, int idx, int[] dp) {
        if(idx == 0)
            return arr.get(idx);

        if(idx < 0)
            return 0;

        if(dp[idx] != -1)
            return dp[idx];        

        int pick = arr.get(idx) + solnMem(arr, idx - 2, dp);
        int notPick = 0 + solnMem(arr, idx - 1, dp);

        return dp[idx] = Math.max(pick, notPick);
    }

    public static int solnTab(List<Integer> arr, int[] dp){
        dp[0] = arr.get(0);
        for (int i = 1; i < dp.length; i++) {
            int pick = arr.get(i) + (i > 1 ? dp[i - 2] : 0);
            int notPick = 0 + dp[i - 1];
            dp[i] = Math.max(pick, notPick);
        }
        return dp[arr.size()-1];
    }

    public static int solnTabOpt(List<Integer> arr){
        int prev = arr.get(0);
        int prev2 = 0;
        for (int i = 1; i < arr.size(); i++) {
            int pick = arr.get(i) + prev2;
            int notPick = 0 + prev;
            int curr = Math.max(pick, notPick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}
