package Array;

public class WST {
    static Boolean nonNegativeIntegers(int[] arr, int sum){
        int s=0, currSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            
            while(currSum>sum && s<(i-1)){
                currSum-=arr[s];
                s++;
            }

            if(currSum==sum)
                return true;

            if(currSum<sum)
                currSum += arr[i];

        }
        return(currSum==sum);
    }

    public static void main(String[] args) {
        
    }
}

