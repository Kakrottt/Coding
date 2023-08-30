package Incture.Week1;

import java.util.Scanner;

public class secondLargestElement {
    private int soln(int[] arr, int n){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }

        if(second == Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
        return second;
    }
    public static void main(String[] args) {
        secondLargestElement obj = new secondLargestElement();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        if(obj.soln(arr, n) == Integer.MIN_VALUE)
            System.out.println("No Second Largest Element Exist");
        else
            System.out.println("Second Largest Element is : " + obj.soln(arr, n));

        sc.close();
    }
}
