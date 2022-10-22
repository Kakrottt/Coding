package String;

import java.util.Scanner;

public class minNumberOfFlips {

    char flipCoin(char exp){
        return exp == '0' ? '1' : '0';
    }

    int setFlip(String s, char exp){
        int flipCount = 0;
        for(int i = 0; i < s.length(); i++){
            System.out.print(exp);
            if(s.charAt(i) != exp){
                flipCount++;
            }

            exp = flipCoin(exp);
        }
        System.out.println();
        return flipCount;
    }
    
    int minFlips(String s){
        int res = Math.min(setFlip(s, '0'), setFlip(s, '1'));
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        String s = "0001010111";
        minNumberOfFlips t = new minNumberOfFlips();

        int res = t.minFlips(s);

        System.out.println(res);

        sc.close();
    }
}
