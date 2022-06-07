package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class longestConsequtiveSubsequnce {
    public static int findLongestN(int[] a) {
        
        Arrays.sort(a);
        int res = 0;
        int curr=1;

        for (int i = 1; i < a.length; i++) {
            if(a[i]==a[i-1]+1)
                curr++;
            else{
                // res = Math.max(res, curr);
                curr=1;
            } 
            res = Math.max(res, curr);                 
        }
        // res = Math.max(res, curr);
        return res;
    }

    public static int findLongestE(int[] a) {
        int res = 0;
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            h.add(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if(h.contains(a[i]-1)==false){
                int curr = 1;
                while(h.contains(a[i]+curr))
                curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }
}
