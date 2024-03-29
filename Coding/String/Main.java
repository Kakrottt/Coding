package String;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-->0){
            String s = br.readLine();
            subsequenceOfString soln = new subsequenceOfString();
            soln.printSubsequence(s, "", 0);
        }

        br.close();
    }
}
