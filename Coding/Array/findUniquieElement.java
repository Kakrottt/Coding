package Array;

import java.util.HashMap;
import java.util.Scanner;

public class findUniquieElement {
    static void soln1(int[] arr){
        HashMap<Integer, Integer> m = new  HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(m.containsValue(1));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        soln1(arr);
        in.close();
    }
}
