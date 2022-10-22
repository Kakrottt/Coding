package InterviewBit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class longestIncreasingSubsequence {
    static int[][] mem;
    
    public static int lisMem(final List<Integer> A) {
        mem = new int[A.size()][A.size()+1];
        for(int[] row : mem)
            Arrays.fill(row, -1);
        
        int res = soln(0, -1, A);
        return res;
    }

    static int soln(int idx, int preIdx, List<Integer> A){
        if(idx == A.size())
            return 0;

        if(mem[idx][preIdx + 1] != -1)
            return mem[idx][preIdx + 1];

        int len = soln(idx + 1, preIdx, A);
        if(preIdx == -1 || A.get(idx) > A.get(preIdx))
            len = Math.max(len, 1 + soln(idx + 1, idx, A));
        
        return mem[idx][preIdx + 1] = len;
    }

    static int lisMemOptimized(List<Integer> A){
        int n = A.size();
        int[][] dp = new int[n + 1][n + 1];

        for(int idx = n-1; idx >= 0; idx--){
            for(int pre = idx - 1; pre >= -1; pre--){
                int len = 0 + dp[idx + 1][pre + 1];
                if(pre == -1 || A.get(idx)>A.get(pre))
                    len = Math.max(len, 1 + dp[idx + 1][idx + 1]);
                dp[idx][pre + 1] = len;
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            int t = Integer.parseInt(br.readLine().trim());
            while(t-->0){
                List<Integer> A = new ArrayList<>();
                String[] inputLine = br.readLine().trim().split(", ");
                for(int i = 0; i < inputLine.length; i++){
                    A.add(Integer.parseInt(inputLine[i]));
                }
                try (PrintStream out = new PrintStream(new FileOutputStream("output.txt"))) {
                    out.println(lisMemOptimized(A));
                    // out.println(inputLine.length);
                    // for(String s : inputLine)
                    //     out.print(s + " ");
                }
            }
        }
    }
}
