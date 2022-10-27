package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {
    ArrayList<Integer> printNextGreater(int arr[]){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        s.push(n-1);
        res.add(-1);
        for(int i = n-2; i >= 0; i--){
            while(!s.empty() && s.peek() <= arr[i])
                s.pop();

            int nextGreater = s.empty() ? arr[i] : s.peek();
            res.add(nextGreater);
            s.push(arr[i]);
        }
        Collections.reverse(res);
        return res;
    }
}
