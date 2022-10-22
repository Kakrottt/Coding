package edifecs;

import java.util.List;
import java.util.Stack;

public class swapTopStack {
    public static void swapTopOfStack(List<Integer> arr1, List<Integer> arr2){
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        for(int i = 0; i < arr1.size(); i++){
            s1.push(arr1.get(i));
        }

        for(int i = 0; i < arr2.size(); i++){
            s2.push(arr2.get(i));
        }

        int temp = s1.pop();
        s1.push(s2.pop());
        s2.push(temp);

        System.out.println(s1);
        System.out.println(s2);
    }
}
