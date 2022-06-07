package Hashing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // longestCommonSpanBInary spanBInary = new longestCommonSpanBInary();

        int n = sc.nextInt();
        int[] a = new int[n];
        // int m = sc.nextInt();
        // int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        // for (int i = 0; i < n; i++) {
        //     b[i] = sc.nextInt();
        // }

        // System.out.println(longestCommonSpanBInary.maxCommonN(a, b));
        // System.out.println(longestCommonSpanBInary.maxCommonE(a, b));

        // System.out.println(longestConsequtiveSubsequnce.findLongestE(a));

        // System.out.println(moreThannbykOccurence.bigOnkSoln(a, k));

        moreThannbykOccurence.bigOnkSoln(a, k);

        sc.close();
    }
}
