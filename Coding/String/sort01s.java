package String;

import java.util.Scanner;

public class sort01s {
    static String soln(char[] arr){
        int l = 0;
        int r = arr.length-1;

        while(l < r){
            if(arr[l] == '0')
                l++;
            if(arr[r] == '1')
                r--;
            
            if(l < r){
                char t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
            }
        }
        String s = new String(arr);
        return s;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] x = s.toCharArray();
        System.out.println(soln(x));
        sc.close();
    }
}
