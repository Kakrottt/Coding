package practice;
import java.util.Scanner;

public class sort012s {
    public static void sort012(int arr[]){
        int n = arr.length;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sort012(arr);

        
        sc.close();
    }
}
