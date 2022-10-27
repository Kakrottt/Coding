package Recurssion.Recursion_Old;

// import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;

public class subsequenceofKSum {
    public static int printS(int[] arr, int n, int i, int k, int sum) {
        if(i == n){
            if(sum == k){
                return 1;
            }
            else
                return 0;

        }

        
        sum += arr[i];
        int l = printS(arr, n, i+1, k, sum);

        sum -= arr[i];
        
        int r = printS(arr, n, i+1, k, sum);
                
        return l + r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        int sum = 0;
        // List<Integer> arrl = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(printS(arr, n, 0, k, sum));


        sc.close();
    }
}
