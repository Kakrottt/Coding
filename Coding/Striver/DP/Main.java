package Striver.DP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        //String[] input = br.readLine().trim().split(" ");
        int n = Integer.parseInt(br.readLine().trim());
        List<List<Integer>> arr = new ArrayList<>();
        //int[][] dp = new int[n][4];
        
        // for(int i = 0; i < n; i++)
        //     Arrays.fill(dp[i], -1);

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().trim().split(" ");
            List<Integer> temp = new ArrayList<>(3);
            for (int j = 0; j < 3; j++) {
                temp.add(Integer.parseInt(input[j]));
            }
            arr.add(temp);
        }

        // int res = maxSumOfNonAdjacentElements.solnTabOpt(arr);
        int res = ninjaTraining.solnTabOpt(arr, n);
        System.out.println(res);
        br.close();
    }
}
