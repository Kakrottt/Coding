package Kickstart;

import java.util.Scanner;

public class distributingCandyProblem {
    static int distributingCandy(int m, int[] arr){
        int res = 0, totalCandy = 0;
        for (int i = 0; i < arr.length; i++) {
            totalCandy += arr[i];
        }

        res = totalCandy%m;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println("Case #" + i + ": " + distributingCandy(m, arr));
        }
        sc.close();
    }
}
