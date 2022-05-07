package Array;

public class maxConsecutiveOnes {
     int maxConsecutive1s(int[] arr){
        int res = 0, curr = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                curr = 0;
            }
            else
                curr++;
        }
        res = Math.max(res, curr);

        return res;
     }
}
