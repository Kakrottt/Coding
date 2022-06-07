package Hashing;

import java.util.HashMap;

public class distinctElementInWindow {
    public static void ESoln(int[] a, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < k; i++) {
            if(m.containsKey(a[i])){
                m.put(a[i], m.getOrDefault(a[i], 0)+1);
            }
            else
                m.put(a[i], 1);
        }
        System.out.println(m.size());

        for (int i = k; i < a.length; i++) {
            if(m.containsKey(a[i])){
                if(m.get(a[i-k])==1)
                    m.remove(a[i-k]);
                else
                    m.put(a[i-k], m.get(a[i-k])-1);
            }

            m.put(a[i], m.getOrDefault(a[i], 0)+1);
            System.out.println(m.size());
        }
    }

    public static void main(String arg[])
    {
        int arr[] = { 1, 2, 1, 3, 4, 2, 3 };
        int k = 4;
        ESoln(arr, k);
    }
}
