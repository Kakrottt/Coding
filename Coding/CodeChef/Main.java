package CodeChef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        

        List<List<Integer>> ans = new ArrayList<>();
        // System.out.println("hello");

        Solution s = new Solution();
        s.soln(0, -1, arr, n, new ArrayList<>(), ans);
        
        System.out.println(ans);
        System.out.println(ans.size());
        sc.close();
    }
}
