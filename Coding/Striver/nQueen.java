package Striver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nQueen {

    static void soln(int n){
        List<List<String>> ans = new ArrayList<>();
        List<int[]> board = new ArrayList<>(n);

        int[] arr = new int[n];
        Arrays.fill(arr, 1); 

        for(int i = 0; i < n; i++){
            board.add(new int[n]);
        }

        nQueenAppraoch1(0, board, ans, n);

        System.out.println(board);
    }

    static void nQueenAppraoch1(int col, List<int[]> board, List<List<String>> ans, int n){
        if(col == n){

        }

        for(int row = 0; row < n; row++){
            if(isSafe(row, col, board, n)){
                ;
            }
        }

    }

    static boolean isSafe(int row, int col, List<int[]> board, int n){
        return false;
    }
    
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        int n = Integer.parseInt(br.readLine().trim());
        soln(n);

        br.close();
    }
}
