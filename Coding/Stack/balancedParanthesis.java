package Stack;
import java.util.Stack;

public class balancedParanthesis {

    public static boolean soln(String str) {
        Stack<Character> s = new Stack<>();
        
        for (int i = 0; i < str.length();) {
               if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
                    s.push(str.charAt(i));
                else{
                    if(s.isEmpty())
                        return false;
                    else if(!isMatching(s.peek(), str.charAt(i)))
                        return false;
                    else
                        s.pop();
                }
                return (s.isEmpty()==true);
        }
        return false;
    }

    public static boolean isMatching(char a, char b) {
        if ((a == '(' && b == ')') || 
           ( a == '{' && b == '}') ||
           (a == '[' && b == ']'))
            return true;
        return false;
    }
}
