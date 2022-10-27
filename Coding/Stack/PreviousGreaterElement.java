package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class PreviousGreaterElement {

    ArrayList<Integer> printPreviousGreater(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        s.push(arr[0]);
        res.add(-1);
        for(int i = 1; i < arr.length; i++){
            while(!s.empty() && s.peek()<= arr[i])
                s.pop();

            if(s.empty())
                res.add(-1);
            else
                res.add(s.peek());
            
            s.push(arr[i]);            
        }

        return res;
    }
}
