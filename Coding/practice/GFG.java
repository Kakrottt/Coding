package practice;

// import java.util.Scanner;

/**
 * GFG
 */
public class GFG {

    public static void merge(int[]arr1, int[] arr2, int n, int m) {
        int gap = (n+m)>>1;
        while(gap>=1){
            int i = gap;
            while(i<n){
                int temp = arr1[i-gap];
                arr1[i-gap] = arr1[i];
                arr1[i] = temp;
                i += gap;
                System.out.println(i);
            }
            
            int k = i%n;
            // if(k<m){
            //     int temp = arr1[n+k-gap-1];
            //     arr1[n+k-gap-1] = arr2[k];
            //     arr2[k] = temp;
            //     k = i;
            // }
            while(k<m){
                if(k-gap<0){
                    int temp = arr1[i-gap];
                    arr1[i-gap] = arr2[k];
                    arr2[k] = temp;
                    k += gap;
                }
                else{
                    int temp = arr2[k];
                    arr2[k] = arr2[k-gap];
                    arr2[k-gap] = temp;
                }
            }
            gap = gap>>1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }

        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n = 4;
        int m = 5;
        int[] arr1= {1,3,5,7};
        int[] arr2= {0,2,6,8,9};

        merge(arr1, arr2, n, m);

    }
}