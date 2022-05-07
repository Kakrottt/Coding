package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        isSorted chekSor = new isSorted();
        reverseArray rA = new reverseArray();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }

        System.out.println(rA.revArr(arr));

        sc.close();
    }
}
