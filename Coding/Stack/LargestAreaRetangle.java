package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class LargestAreaRetangle {
    ArrayList<Integer> prevSmaller(int[] arr){
        ArrayList<Integer> prevS = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.push(0);
        prevS.add(-1);
        for(int i = 1; i < arr.length; i++){
            while(!s.empty() && arr[s.peek()] >= arr[i])
                s.pop();
            
            int prev = s.empty() ? -1 : s.peek();
            prevS.add(prev);
            s.add(i);
        }

        return prevS;
    }

    ArrayList<Integer> nextSmaller(int[] arr){
        ArrayList<Integer> nextS = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        s.push(n-1);
        nextS.add(n);
        for (int i = n-2; i >= 0; i--) {
            while(!s.empty() && arr[s.peek()] >= arr[i])
                s.pop();
            
            int next = s.empty() ? n : s.peek();
            nextS.add(next);
            s.add(i);
        }

        Collections.reverse(nextS);
        return nextS;
    }
}
