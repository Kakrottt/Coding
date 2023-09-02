package Array;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class check {

    public static long maxValue(int n, int[] arr){
        long res = Long.MIN_VALUE;
        //int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                long temp = arr[i]-arr[j];
                for(int k = j+1; k < n; k++){
                    long soln = temp*arr[k];
                    res = Math.max(res, soln);
                }
            }
        }
        
        if(res < 0)
            return 0; 
        
        return res;
    }

    public static long MaxScore(int N, int arr[]){
        // Code Here.
        int l = 0; 
        int r = N-1;
        long element = arr[0];
        long res = 0;
        
        while(l < r){
            long min = minm(arr, l, r);
            
            if(arr[l] > arr[r]){
                element = arr[l];
                l++;
            }
            else{
                element = arr[r];
                r--;
            }
                
            res += (element*N--)+min;
            System.out.println(element + " * " + N + " + " + min + " " + res);
        }
        
        return res;
    }
    
    static long minm(int[] arr, int l, int r){
        long min = Long.MAX_VALUE;
        for(int i = l; i <= r; i++){
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    public static void main(String[] args) throws IOException{
        //Scanner sc = new Scanner(System.in);
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().trim().split(" ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }

        System.out.println(MaxScore(n, arr));

        // for (int i = 0; i < n; i++) {
        //     System.out.println(n + " " + arr[i]);
        // }
        br.close();
    }
}
