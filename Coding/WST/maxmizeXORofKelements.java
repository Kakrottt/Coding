package WST;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class maxmizeXORofKelements {
    static int solnWST(int[] arr, int k, int x){
        int res = -1;
        for(int i = 0; i+k-1 < arr.length; i++){
            for (int j = 0; j < k; j++) {
                arr[i+j] -= x;
            }
            res = Math.max(res, k == 0 ? -1 : xor(arr));
            for (int j = 0; j < k; j++) {
                arr[i+j] += x;
            }
        }
        return res;
    }

    static int xor(int[] arr){
        int xor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor ^= arr[i];
        }
        return xor;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String[] in = br.readLine().trim().split(" ");
        int n = in.length;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(in[i]);

        int k = Integer.parseInt(br.readLine().trim());
        int x = Integer.parseInt(br.readLine().trim());

        int res = solnWST(arr, k, x);

        System.out.println(res);

        br.close();

    }
}
