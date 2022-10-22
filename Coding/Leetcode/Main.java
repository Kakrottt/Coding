package Leetcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String[] in = br.readLine().trim().split(" ");
        int n = in.length;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(in[i]);
        }

        findMaximumXOR t = new findMaximumXOR();
        t.soln(arr);
        br.close();
    }
}
