package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class givenSumInArray {
    public static boolean isPair(int[] a, int sum) {
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            int temp = sum;
            if(h.contains(temp-a[i]))
                return true;
            h.add(a[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int sum = sc.nextInt();
        
        System.out.println(isPair(a, sum));

        sc.close();
    }
}
