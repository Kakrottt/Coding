package practice;
import java.util.Scanner;

public class twoRooks {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        int t = sc.nextInt();
        for(int i =0; i<t; i++){
            long x1 = sc.nextLong();
            long x2 = sc.nextLong();
            long y1 = sc.nextLong();
            long y2 = sc.nextLong();
            
            if(x1 == x2 || y1 == y2)
                System.out.println("Yes");
            else
                System.out.println("No");
        }    
        sc.close();
    }

}