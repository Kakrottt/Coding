package Array;

public class maxSumSubarray {
    // static int maxSumSubarray(int[] arr){
    //     int resMax = arr[0], resMin = arr[0];
    //     int res = arr[0];
    //     int maxEnding = arr[0];
    //     int minEnding = arr[0];

    //     for (int i = 1; i < arr.length; i++) {
    //             maxEnding = Math.max((maxEnding+arr[i]), arr[i]);
    //             resMax = Math.max(maxEnding, resMax);
    //     }

    //     for (int i = 1; i < arr.length; i++) {
    //         minEnding = Math.min(minEnding+arr[i], arr[i]);
    //         resMin = Math.min(minEnding, resMin);
    //     }

    //     System.err.println(resMax + " : " + resMin);

    //     res = Math.max(resMax-resMin, resMax);

    //     return res;
    // }


    static int maxSumSubarray2(int[] arr){
        int res = arr[0], maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(maxEnding, res);
        }
        return res;
    }

    static int overallSum(int[] arr){
        int maxNormal = maxSumSubarray2(arr);
        int arrSum = 0;
        if(maxNormal<0)
            return maxNormal;
        else{
            for (int i = 0; i < arr.length; i++) {
                arrSum += arr[i];
                arr[i] = -arr[i];
            }
             int maxCircular = arrSum + maxSumSubarray2(arr);
             return Math.max(maxNormal, maxCircular);
        }
        
    }
}
