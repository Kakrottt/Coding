package Prog.pattern;

import java.util.Scanner;


public class patternStar {
    public static void main(String[] args) {
            System.out.print("Enter Number : ");
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            int colm = sc.nextInt();

            for(int i=0; i<row; i++){
                for(int j=0; j<colm; j++){
                    System.out.print("* ");
                }
                
                System.out.println();
            }

        }
}
