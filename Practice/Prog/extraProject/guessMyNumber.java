package Prog.extraProject;

import java.util.Scanner;

public class guessMyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do {
            System.out.print("Guess My Number : ");

            userNumber =    sc.nextInt();
            if(userNumber == myNumber){
                System.out.println("Correct Number");
                break;
            }

            else if (userNumber > myNumber) {
                System.out.println("You Number is Bigger\n");
            }

            else{
                System.out.println("You Number is Small\n");
            }


        } while (userNumber >= 0);

        System.out.println("My Number was : " + myNumber);

    }
}
