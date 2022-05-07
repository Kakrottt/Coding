package Array;

import java.util.ArrayList;

public class isSorted {
    boolean checkSorted(ArrayList<Integer> arr){
        for (int i = 1; i < arr.size(); i++) {
            if(arr.get(i)<arr.get(i-1))
                return false;
        }

        return true;
    }
}
