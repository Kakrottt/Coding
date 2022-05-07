package javaLab.javaLabMST;

import java.util.Scanner;

public class arrrayOutofBnd extends arithmatcExcp{
        public static void main(String[] args) {
            try {
                int a[] = new int[5];
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter How many numbers you want to enter = ");
                int lim = sc.nextInt();
                // a[5] = 4;
                for(int i=0; i<lim; i++){
                    a[i] = sc.nextInt();
                }
                
                for(int i =0; i<5; i++)
                    System.out.print(a[i] + " ");
            } 
            
            catch (ArrayIndexOutOfBoundsException e) {
                //TODO: handle exception
                System.out.println("\n Array Index Out out of Bound Occured\n");
            }
        }
}
