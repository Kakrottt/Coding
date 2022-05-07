package Array;

public class maxEvenOddSubArray {
    int maxEvenOdd(int[] arr){
        int res = 1, curr=1;
        for (int i = 1; i < arr.length; i++) {
            if((arr[i]%2==0) && (arr[i-1]%2!=0) || (arr[i]%2!=0) && (arr[i-1]%2==0)){
                curr++;
                res = Math.max(curr, res);
            }
            else
                curr = 1;          
        }

        return res;
    }
}
