package Hashing;

import java.util.HashMap;
import java.util.Map;

public class moreThannbykOccurence {
        public static void bigOnkSoln(int[] arr, int k) {
            HashMap<Integer, Integer> m = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {
                if(m.containsKey(arr[i]))
                    m.put(arr[i], m.getOrDefault(arr[i], 0)+1);
                else if(m.size()<(k-1))
                    m.put(arr[i], 1);
                else
                    for(int j = 0; j < m.size(); j++)
                        if(m.get(arr[j])==1)
                            m.remove(arr[j]);
                        else
                            m.get(arr[j]-1);                
            }

            for (Map.Entry<Integer,Integer> e : m.entrySet()) {
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if(e.getKey()==arr[i])
                        count++;
                }
                if(count>(arr.length/k))
                    System.out.println(e.getKey());
            }
        }
}
