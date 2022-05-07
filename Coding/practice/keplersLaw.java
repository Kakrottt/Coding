package practice;
import java.util.Scanner;

public class keplersLaw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();

            double d1 = (double)(t1*t1)/(r1*r1*r1);
            double d2 = (double)(t2*t2)/(r2*r2*r2);

            System.out.println(d1 + " " + d2);
            
            if(d1==d2)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

        sc.close();
    }
}
