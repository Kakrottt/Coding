package Matrix;

import java.util.Scanner;

public class snakePattern {
    public static void printSnake(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            if(i%2==0){
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.print(">> ");
            }
            else{
                for (int j = mat[i].length - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.print(">> ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // boundryElements BE = new boundryElements();
        // transposeMatrix Tprint = new transposeMatrix();
        // rotateBy90 RT90 = new rotateBy90();
        spiralMatrix Spriral = new spiralMatrix();

        int mat[][] =  {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
                        // {17, 18, 19, 20}};

        System.out.println(mat.length);
        System.out.println(mat[0].length);
        
        // printSnake(mat);

        // BE.printBoundryElements(mat);

        // Tprint.printTranspose(mat);

        // RT90.printR90(mat);

        Spriral.printSpiral(mat);

        sc.close();
    }
}
