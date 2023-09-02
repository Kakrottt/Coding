package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static boolean wordBreak(String s, List<String> wordDict) {
        int[] charMap = new int[256];

        //Arrays.fill(charMap,  0);
        
        for(int i = 0; i < wordDict.size(); i++){
            for(int j = 0; j < wordDict.get(i).length(); j++){
                charMap[wordDict.get(i).charAt(j)]++;
            }
        }
        
        for(int i = 0; i < 256; i++)
            System.out.print(charMap[i]);
        
        for(int i = 0; i < s.length(); i++){
            charMap[s.charAt(i)]--;
        }
        
        for(int i = 0; i < 256; i++)
            System.out.print(charMap[i]);
        
        boolean flag = true;
        for(int i = 0; i < 256; i++){
            if(charMap[i] > 0){
                flag = false;
                break;
            }
                
        }
        
        return flag;
    }
    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();
        arr.add("apple");
        arr.add("pen");

        boolean res = wordBreak("applepenapple", arr);

        System.out.println(res);
        
        
        // // for(int i = 0; i >= 0; i--){
        // //     // System.out.print(Integer.toBinaryString(mask) + " " + Integer.toBinaryString(1<<i) + " = ");
        // //     // mask = mask | (1 << i);
        // //     // System.out.println(Integer.toBinaryString(mask));
        // // }

        // int n = 919;
        // long mod = (long)10e9+7;
        // long mask = 0;
        // List<Long> pow = new ArrayList<>();
        // int i = 0;
        // while(i < 32){
        //     mask = (1 << i)%mod;
        //     if((n & mask) > 0){
        //         pow.add((1<<i)%mod);
        //     }
        //     // pow.add(0);
        //     i++;
        // }
        // System.out.println(pow);
    }
}