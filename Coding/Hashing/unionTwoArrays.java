package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class unionTwoArrays {
    public static int countUnion(int[] a, int[] b) {
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            h.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            h.add(b[i]);
        }
        return h.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int m = sc.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println(countUnion(a, b));

        sc.close();
    }
}
