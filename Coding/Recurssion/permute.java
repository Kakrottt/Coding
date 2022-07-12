package Recurssion;

import java.util.Scanner;

public class permute {
    public static void permut(String s, int i) {
        if(i == s.length()-1){
            System.out.println(s + " ");
            return;
        }
        for (int j = i; j < s.length(); j++) {
            s = swap(s, i, j);
            permut(s, i+1);
            s = swap(s, i, j);
        }
    }

    public static String swap(String s, int i, int j) {
        char[] tempArr = s.toCharArray();
        char temp = tempArr[i];
        tempArr[i] = tempArr[j];
        tempArr[j] = temp;
        // System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> " + String.valueOf(tempArr));
        return String.valueOf(tempArr);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // StringBuffer s = new StringBuffer(str);
        int i = 0;

        permut(s, i);
        sc.close();
    }
}
