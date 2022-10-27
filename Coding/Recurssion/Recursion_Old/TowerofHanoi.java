package Recurssion.Recursion_Old;

import java.util.Scanner;

public class TowerofHanoi {
    public static void TOH(int n, char A, char B, char C) {
        if(n==1){
            System.out.println("Move Disk 1 from " + A + " to " + C);
            return;
        }
        TOH(n-1, A, C, B);
        System.out.println("Move Disk " + n + " from " + A + " to " + C);
        TOH(n-1, B, A, C); 
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char A = 'A', B = 'B', C = 'C';
        TOH(n, A, B, C);
        sc.close();
    }
}
