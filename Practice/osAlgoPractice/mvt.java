package osAlgoPractice;

import java.util.Scanner;

public class mvt {
    public static void main(String[] args) {


        Scanner si = new Scanner(System.in);

        System.out.print("Enter the total available memory : ");
        int m = si.nextInt();

        System.out.print("Enter the number of process : ");
        int p = si.nextInt();
        int proc[] = new int[p+1];


        for (int i = 1; i <= p; i++) {
            System.out.println("Enter memory required for Process " + i + " : ");
            proc[i] = si.nextInt();
            m = m-proc[i];  
            
            if(m<proc[i])
                System.out.println("Memory Full");
        }

    }
}
