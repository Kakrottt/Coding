package Recurssion;

import java.util.Scanner;

public class palindromeCheck {
        public static boolean isPalindrome(String s, int start, int end) {
            if(start>=end)
                return true;

            return (s.charAt(start)==s.charAt(end)) && isPalindrome(s, start+1, end-1);
            
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int start = 0, end = s.length()-1;
            System.out.println(isPalindrome(s, start, end));
            sc.close();
        }
}
