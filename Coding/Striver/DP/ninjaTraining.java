package Striver.DP;

import java.util.List;

public class ninjaTraining {
    public static int solnRec(List<List<Integer>> arr, int currDay, int lastTask) {
        if(currDay == 0){
            int maxi = 0;
            for(int task = 0; task < 3; task++){
                if(task != lastTask)
                    maxi = Math.max(maxi, arr.get(0).get(task));
            }
            return maxi;
        }

        int maxi = 0;

        for (int task = 0; task < 3; task++) {
            int tempRes = 0;
            if(task != lastTask){
                tempRes = arr.get(currDay).get(task) + solnRec(arr, currDay - 1, task);
                maxi = Math.max(maxi, tempRes);
            }
        }

        return maxi;
    }

    public static int solnMem(List<List<Integer>> arr, int currDay, int lastTask, int[][] dp) {
        if(currDay == 0){
            int maxi = 0;
            for(int task = 0; task < 3; task++){
                if(task != lastTask)
                    maxi = Math.max(maxi, arr.get(0).get(task));
            }
            return maxi;
        }

        if(dp[currDay][lastTask] != -1)
            return dp[currDay][lastTask];
        int maxi = 0;

        for (int task = 0; task < 3; task++) {
            int tempRes = 0;
            if(task != lastTask){
                tempRes = arr.get(currDay).get(task) + solnMem(arr, currDay - 1, task, dp);
                maxi = Math.max(maxi, tempRes);
            }
        }

        return dp[currDay][lastTask] = maxi;
    }

    public static int solnTab(List<List<Integer>> arr, int n, int[][] dp){
        dp[0][0] = Math.max(arr.get(0).get(1), arr.get(0).get(2));
        dp[0][1] = Math.max(arr.get(0).get(0), arr.get(0).get(2));
        dp[0][2] = Math.max(arr.get(0).get(1), arr.get(0).get(0));
        dp[0][3] = Math.max(arr.get(0).get(0), Math.max(arr.get(0).get(1), arr.get(0).get(2)));

        for(int day = 1 ; day < n; day++){
            for(int last = 0; last < 4; last++){
                dp[day][last] = 0;
                for(int task = 0; task < 3; task++){
                    if(task != last){
                        int point = arr.get(day).get(task) + dp[day - 1][task];
                        dp[day][last] = Math.max(dp[day][last], point);
                    }
                }
            }
        }
        return dp[n-1][3];
    }

    public static int solnTabOpt(List<List<Integer>> arr, int n){
        int[] prev = new int[4];

        prev[0] = Math.max(arr.get(0).get(1), arr.get(0).get(2));
        prev[1] = Math.max(arr.get(0).get(0), arr.get(0).get(2));
        prev[2] = Math.max(arr.get(0).get(1), arr.get(0).get(0));
        prev[3] = Math.max(arr.get(0).get(0), Math.max(arr.get(0).get(1), arr.get(0).get(2)));

        for(int day = 1; day < n; day++){
            int[] temp = new int[4];
            for(int last = 0; last < 4; last++){
                temp[last] = 0;
                for(int task = 0; task < 3; task++){
                    if(task != last)
                        temp[last] = Math.max(temp[last], arr.get(day).get(task) + prev[task]);
                }
            }
            prev = temp.clone();
        }

        return prev[3];
    }
}
