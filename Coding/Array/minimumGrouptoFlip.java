package Array;

import java.util.Scanner;

public class minimumGrouptoFlip {
    
    void printGroupFilp(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1]){
                if(arr[i]==arr[0])
                    System.out.println(i + " ");
                else
                    System.out.println(i-1);
            }
        }
        if(arr[arr.length-1]!=arr[0])
            System.out.println(arr.length-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        minimumGrouptoFlip mgf = new minimumGrouptoFlip();
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mgf.printGroupFilp(arr);
        sc.close();
    }
}
