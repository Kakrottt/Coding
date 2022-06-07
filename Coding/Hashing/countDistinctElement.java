package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class countDistinctElement {
    public int countDist(int[] arr) {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        return s.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        countDistinctElement cd = new countDistinctElement();

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(cd.countDist(arr));

        sc.close();
    }
}
