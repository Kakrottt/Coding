package Leetcode;

import java.util.HashSet;
import java.util.Set;


public class findMaximumXOR {
    public void soln(int[] arr) {
        int max = 0;
        int mask = 0;

        for (int i =6; i >= 0; i--) {
            mask = mask | (1 << i);
            System.out.println(i + " " + mask);
            Set<Integer> s = new HashSet<>();
            for(int num:arr){
                s.add(num & mask);
            }
            System.out.print(s + " -> ");
            int temp = max | (1 << i);
            System.out.print(temp + " -> ");
            for(int prefix:s){
                System.out.print((temp^prefix) + " ");
                if(s.contains(temp^prefix)){
                    max = temp;
                    break;
                }
            }
            System.out.println();
        }
        System.out.println(max);
    }
}
