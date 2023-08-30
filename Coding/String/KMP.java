package String;

import java.util.Scanner;

public class KMP {

    public static void fillLPS(String str, int[] lps){
        int n = str.length();
        int len = 0;
        lps[0] = 0;
        int i = 1;

        while(i<n){
            if(str.charAt(i)==str.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len == 0){
                    lps[i] = 0;
                    i++;
                }
                else{
                    len = lps[len - 1];
                }
            }
        }
    }

    void kmp(String text, String pat){
        int n = text.length();
        int m = pat.length();
        int[] lps = new int[m];
        fillLPS(pat, lps);
        
        int i = 0, j = 0;
        while(i < n){
            if(text.charAt(i) == pat.charAt(j)){
                i++;
                j++;
            }
            if(j == m){
                System.out.print(i-j + " ");
                j = lps[j-1];
            }
            else if(i < n && pat.charAt(j) != text.charAt(i)){
                if(j == 0){
                    i++;
                }
                else {
                    j = lps[j-1];
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String("AAABAAAAC");
        // String pat = new String();
        int[] lps = new int[str.length()];

        fillLPS(str, lps);
        KMP x = new KMP();
        x.kmp(str, "AA");
        System.out.println();
        
        for (int i = 0; i < lps.length; i++) {
            System.out.print(lps[i] + " ");
        }

        sc.close();
        
    }
}
