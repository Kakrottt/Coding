package Array;

public class Test {
    static int maxSumSubArr(int[] arr){
        int res = arr[0], maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(maxEnding, res);
        }
        
        return res;
    }

    static int trappRainWatertest(int[] arr){
        int res = 0;
        int n = arr.length;
        int lmax = arr[0], rmax = arr[n-1];

        for (int i = 1; i < n-1; i++) {
            if(arr[i]>=lmax){
                lmax = arr[i];
            }
        }

        for (int i = n-1; i > 0; i--) {
            if (arr[i]>=rmax) {
                rmax = arr[i];
            }
        }

        for (int i = 1; i < arr.length-1; i++) {
            res = res + (Math.min(lmax, rmax)-arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 0, 2, 4};
        System.out.println(trappRainWatertest(arr));
    }
}
