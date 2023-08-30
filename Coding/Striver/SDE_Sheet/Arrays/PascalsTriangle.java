package Striver.SDE_Sheet.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    static List<Integer> generateRow(int i){
        long ans = 1;
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for(int col = 1; col < i; col++){
            ans = ans * (i - col);
            ans = ans / (col);
            row.add((int)ans);
        }
        

        return row;
    }

    public static List< List < Integer > > pascalTriangle(int N) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 1; i <= N; i++){
            res.add(generateRow(i));
        }
        
        return res;
        // Write your code here.
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int N = sc.nextInt();

        List<List<Integer>> res = pascalTriangle(5);

        System.out.println(res);
        sc.close();
    }
}
