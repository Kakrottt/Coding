package Prog.pattern;

import java.util.Scanner;

public class sameNumberPattern {
        public static void main(String[] args) {
            // char input = 'A';
            System.out.print("Enter Number : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(i + "  ");
                }
                System.out.println();
            }
        }
}
