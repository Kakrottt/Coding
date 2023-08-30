package Mazeeeee;

import java.lang.Thread;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //String s = "hello world";
        String curr = "";
        char j = 65;

        for(int i = 0; i < s.length(); i++){
            for( ; j < 123; j++){
                System.out.print(curr);
                System.out.println(j);
                if(s.charAt(i) == ' '){
                    curr += ' ';
                    j = 65;
                    break;
                } else if(j == s.charAt(i)){
                    curr += j;
                    //System.out.println();
                    break;
                }
                Thread.sleep(10);
            }
            j = (char) (j == 65 ? 65 : 97);
        }
        System.out.println("\n" + s);
        System.out.println();
        sc.close();
    }
}
