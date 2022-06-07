package practice;
import java.util.Scanner;

public class splitIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        long t = sc.nextLong();

        for(int i=0; i<t; i++){
            // long n = sc.nextLong();
            String s = sc.nextLine();

            for(int j = 0; j<s.length(); j++){
                if(s.charAt(j)==s.charAt(s.length()-1)){
                    flag = true;
                }
            }
        }
        System.out.println(flag);

        sc.close();
    }
}
