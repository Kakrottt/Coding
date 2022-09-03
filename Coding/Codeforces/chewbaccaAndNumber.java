

import java.util.Scanner;

public class chewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();

        if(c[0] !='9' && c[0] > '4')
            c[0] = (char)(9 - c[0]);

        for(int i = 1; i<c.length; i++){
            if(c[i]>4)
                c[i] = (char)('9' - c[i]);
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }

        // s = new String(c);
        // System.out.println(s);
        sc.close();
        
    }
}
