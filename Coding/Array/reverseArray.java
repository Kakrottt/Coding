package Array;

import java.util.ArrayList;
import java.util.Collections;

public class reverseArray {
    ArrayList<Integer> revArr(ArrayList<Integer> arr){
        int l = 0;
        int r = (arr.size()-1);

        // Collections.swap(arr, l, r);

        while(l<r){
            Collections.swap(arr, l, r);
            l++;
            r--;
        }
        return arr;
    }
}
