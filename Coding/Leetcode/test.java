package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        
        
        // for(int i = 0; i >= 0; i--){
        //     // System.out.print(Integer.toBinaryString(mask) + " " + Integer.toBinaryString(1<<i) + " = ");
        //     // mask = mask | (1 << i);
        //     // System.out.println(Integer.toBinaryString(mask));
        // }

        int n = 919;
        long mod = (long)10e9+7;
        long mask = 0;
        List<Long> pow = new ArrayList<>();
        int i = 0;
        while(i < 32){
            mask = (1 << i)%mod;
            if((n & mask) > 0){
                pow.add((1<<i)%mod);
            }
            // pow.add(0);
            i++;
        }
        System.out.println(pow);
    }
}