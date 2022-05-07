package Bit_Magic;

import java.util.Scanner;

public class countSetBits {
    
    int countSBits(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i)&1)==1)
                count++;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        countSetBits csb = new countSetBits();
        String s = sc.nextLine();

        System.out.println(csb.countSBits(s));

        sc.close();
    }
}
