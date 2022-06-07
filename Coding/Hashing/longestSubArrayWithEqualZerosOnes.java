package Hashing;

import java.util.HashMap;

public class longestSubArrayWithEqualZerosOnes {
    public static int longestSubN(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int c0 = 0, c1 = 0;
            for (int j = i; j < arr.length; j++) {
                if(arr[i]==0)
                    c0++;
                else
                    c1++;
                if(c0==c1)
                    res = Math.max(res, j-i+1);
            }
        }
        return res;
    }

    public static int longSubE(int[] arr) {
        int res = 0, pre_sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
                arr[i]= -1;
        }

        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            pre_sum += arr[i];
            if(pre_sum==0)
                res=i+1;
            if(m.containsKey(pre_sum)==false)
                m.put(pre_sum, i);
            if(m.containsKey(pre_sum))
                res = Math.max(res, i-m.get(pre_sum));
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
