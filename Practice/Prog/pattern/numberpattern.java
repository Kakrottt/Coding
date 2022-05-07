package Prog.pattern;

import java.util.Scanner;

public class numberpattern {
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i=1; i<=input; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            // if(i==input-1){
            //     System.out.println(input);
            // }
            System.out.println();
        }
    }
}
