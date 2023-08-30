package Striver.SDE_Sheet.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ZeroMatrix {
    static ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
            int[] row = new int[n];
            int[] col = new int[m];

            Arrays.fill(row, 0);
            Arrays.fill(col, 0);

            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(matrix.get(i).get(j)==0){
                        row[i] = 1;
                        col[j] = 1;
                    }
                }
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(row[i] == 1 || col[j] == 1)
                        matrix.get(i).set(j, 0);
                }
            }
            
            return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.valueOf(sc.nextInt());
        Integer m = Integer.valueOf(sc.nextInt());

        System.out.println(n + " " + m);

        for(int i = 0; i < n; i++){
            matrix.add(new ArrayList<>());
            for (int j = 0; j < m; j++) {
                matrix.get(i).add(sc.nextInt());
            }
        }

        System.out.println(matrix);

        zeroMatrix(matrix, n, m);

        System.out.println(matrix);

        sc.close();
    }
}
