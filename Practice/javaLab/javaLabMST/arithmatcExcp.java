package javaLab.javaLabMST;

import java.util.Scanner;

public class arithmatcExcp {
    public static void main(String[] args) {
        try{
            int a, b;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter First Number >>  ");
            a = sc.nextInt();
            System.out.print("Enter 2nd Number >>  ");
            b = sc.nextInt();
            int c = a/b;
            System.out.println("Result = " + c );
        }
        catch(ArithmeticException e){
            System.out.println("\nArithmetic Exception >> Can-not divide by Zero \n");
        }     


    }
}
