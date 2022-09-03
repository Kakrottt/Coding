

import java.util.Scanner;

public class bitPP {
    
    public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
        int x  = 0;

        while(n-->0){
            String s = sc.next();
            if(s.equals("X++") || s.equals("++X") || s.equals("x++") || s.equals("++x"))
                x++;
            else
                --x;
        }
        
        System.out.println(x);
        sc.close();
	}
}
