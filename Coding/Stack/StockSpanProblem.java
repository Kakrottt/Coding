package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {
    ArrayList<Integer> printSpan(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.push(0);
        res.add(1);
        
        for (int i = 1; i < arr.length; i++) {
            while(s.empty() == false && arr[s.peek()] < arr[i])
                s.pop();

            int span = s.empty() ? i + 1 : i - s.peek();
            res.add(span);
            s.push(i);
        }
        return res;
    }
}
