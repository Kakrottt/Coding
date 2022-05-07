package practice;
import java.util.Scanner;

public class covidSpred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            long n = sc.nextLong();
            long d = sc.nextLong();
            long res = 1;

            for (int j = 1; j <= d; j++) {
                if(j>10){
                    res *= 3;
                }
                else
                    res *= 2;          
            }

            if(res>=n){
                System.out.println(n);
            }
            else
                System.out.println(res); 
            
        }

        sc.close();
    }
}
