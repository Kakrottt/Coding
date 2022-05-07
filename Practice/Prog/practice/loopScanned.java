package Prog.practice;

import java.util.Scanner;

public class loopScanned {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<names.length; i++){
            System.out.print("Input : ");
            String input = sc.nextLine();
            names[i] = input; 
        }
        for(String n:names){
// System.out.println();
// System.out.println();
            System.out.print(n + "  ");
        }
    }
}
