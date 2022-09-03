package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class moreThannbykOccurence {
    public static List<Integer> bigOnkSoln(int[] nums, int k){
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            if(m.containsKey(nums[i]))
                m.put(nums[i], m.get(nums[i])+1);
            else if(m.size()<k)
                m.put(nums[i], 1);
            else{
                for(Map.Entry<Integer, Integer> e : m.entrySet()){
                    if(e.getValue()==1)
                        m.remove(e.getKey());
                    else
                        m.put(e.getKey(), e.getValue()-1);
                }
            }
        }
        
        for(Map.Entry<Integer, Integer> e : m.entrySet()){
            int count = 0;
            for(int i = 0; i < n; i++){
                if(e.getKey()==nums[i])
                    count++;
            }
            if(count>n/k)
                res.add(e.getKey());
        }
        
        return res;

    }
}
