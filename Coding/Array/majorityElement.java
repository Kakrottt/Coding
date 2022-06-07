package Array;

public class majorityElement {
    int findMajority(int[] arr){
        int count=1, curr = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[curr]==arr[i])
                count++;
            else
                count--;
            if(count==0){
                curr = i;
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[curr]==arr[i])
                count++;
            if(count<(arr.length/2))
                count = -1;
        }
        return count;
    }
}
