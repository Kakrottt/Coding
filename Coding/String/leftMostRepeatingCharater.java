package String;

import java.util.Arrays;

public class leftMostRepeatingCharater {
    static final int CHAR = 256;
    public static int SolnBetter(String s) {
        int[] count = new int[CHAR];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>1)
                return s.charAt(i);
        }

        return -1;
    }


    public static int solnE1(String s) {
        int[] fIndex = new int[CHAR];
        Arrays.fill(fIndex, -1);
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            int fi = fIndex[s.charAt(i)];
            if(fi==-1)
                fIndex[s.charAt(i)] = i;
            else
                res = Math.min(res, fi);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public static int solnE2(String s) {
        boolean[] visited = new boolean[CHAR];
        int res = -1;

        for (int i = s.length()-1; i >= 0; i--) {
            if(visited[s.charAt(i)])
                res = i;
            else
                visited[s.charAt(i)] = true;
        }

        return res;

    }


}