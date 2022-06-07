package Hashing;

import java.util.HashMap;

public class longestCommonSpanBInary {
    public static int maxCommonN(int[] a, int[] b) {
        int res = 0;
        for (int i = 0; i < b.length; i++) {
            int sum1 =0, sum2 = 0;
            for (int j = i; j < b.length; j++) {
                sum1 += a[j];
                sum2 += b[j];
                if(sum1==sum2)
                    res = Math.max(res, j-i+1);
            }
        }
        return res;
    }

    public static int maxCommonE(int[] a, int[] b) {
        int res = 0;
        int[] temp = new int[b.length];
        
        for (int i = 0; i < b.length; i++) {
            temp[i] = a[i] - b[i];
        }

        HashMap<Integer, Integer> m = new HashMap<>();
        int pre_sum = 0;
        for (int i = 0; i < temp.length; i++) {
            pre_sum += temp[i];
            if(pre_sum==0)
                res = i+1;
            if(m.containsKey(pre_sum)==false)
                m.put(pre_sum, i);
            if(m.containsKey(pre_sum))
                res = Math.max(res, i-m.get(pre_sum));
        }
        return res;
    }
}
