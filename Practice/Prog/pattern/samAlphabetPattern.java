package Prog.pattern;

import java.util.Scanner;

public class samAlphabetPattern {
    public static void main(String[] args) {
        System.out.println("Enter Character : ");
        char alphabet = 'A';
        // Scanner sc = new Scanner(System.in);
        char last = 'E';
        // String input = sc.next();
        // char last = input;

        for(int i =1; i<=(last - 'A' + 1); i++){
            for(int j=1; j<=i; j++){
                System.out.print(alphabet + " ");
            }
            ++alphabet;
            System.out.println();
        }

    }
}
