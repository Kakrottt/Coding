package Incture.Week1;

import java.util.Scanner;

public class commonElementArrays {
    private void findcommon(int n, int m, String[] arr1, String[] arr2){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            //Comparing Each String of Two Arrays
                if(stringMatch(arr1[i], arr2[j])){
                //Printing them if they Matches
                    System.out.println(arr1[i] + " " + arr2[j]);
                }
            } 
        }
    }

//Boolean funtion if two strings matches return true
    private boolean stringMatch(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
    //Object 
        commonElementArrays obj = new commonElementArrays();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] arr1 = new String[n];
        String[] arr2 = new String[m];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.next();
        }

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.next();
        }

    //function Call
        obj.findcommon(n, m, arr1, arr2);

        sc.close();
    }
}
