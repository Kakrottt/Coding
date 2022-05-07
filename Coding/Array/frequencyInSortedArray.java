package Array;

import java.util.Scanner;

public class frequencyInSortedArray extends stockBuySell {

    static void frequencyInSortArray(int[] arr){
        int frq = 1, i = 1;

        while(i<arr.length){
            while(i<arr.length && arr[i]==arr[i-1]){
                frq++;
                i++;
            }
            System.out.println(arr[i-1] + "  :  " + frq);
            i++;
            frq = 1;
        }

        if(i==1 || arr[arr.length-1]!=arr[arr.length-2])
        System.out.println(arr[i-1] + "  :  " + frq);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // frequencyInSortArray(arr);
        // int x =buysell(arr);
        // int x = maxSumSubarray.maxSumSubarray(arr);
        System.out.println();
        sc.close();
    }
}
