package CodeChef;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    void soln(int idx, int prev, int[] arr, int n, List<Integer> ds, List<List<Integer>> ans){
        if(idx == n){
            if(ds.size()>0)
                ans.add(new ArrayList<>(ds));
            return;
        }

        // System.out.println("Hello");
        soln(idx+1, idx, arr, n, ds, ans);
        if(prev == -1 || (arr[prev] < arr[idx]) || (-arr[prev] < arr[idx])){
            ds.add(arr[idx]);
            soln(idx+1, idx, arr, n, ds, ans);
            ds.remove(ds.size()-1);
        }
    }
}
