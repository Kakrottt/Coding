package Array;

public class stockBuySell {
    
    static int buysell(int[] arr){
        int profit = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[i-1]){
                profit += (arr[i] - arr[i-1]);
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        
    }
}
