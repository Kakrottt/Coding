package Array;

// import java.util.HashMap;
import java.util.Scanner;

public class findUniquieElement {
    static void soln1(int[] arr){
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            // int mid = (l + r)/2;
            
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        soln1(arr);
        in.close();
    }
}
