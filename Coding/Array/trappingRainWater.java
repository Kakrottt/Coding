package Array;

public class trappingRainWater {
    static int trappRainWater(int[] arr){
        int res = 0, n = arr.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];

        lmax[0] = arr[0];
        for (int i = 1; i < n-1; i++) {
            lmax[i] = (Math.max(arr[i], lmax[i-1]));
        }
        // System.out.println(lmax);

        rmax[n-1] = arr[n-1];
        for (int i = n-2; i >=0; i--) {
            rmax[i] = (Math.max(arr[i], rmax[i+1]));
        }
        // System.out.println(rmax);

        for (int i = 1; i < n-2; i++) {
            res = res + (Math.min(lmax[i], rmax[i])) - arr[i];
        }
        return res;
    }
}
