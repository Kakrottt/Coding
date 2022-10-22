package String;

public class subsequenceOfString {
    
    void printSubsequence(String s, String curr, int idx){
        if(idx == s.length()){
            if(curr.length()>0)
                System.out.println(curr);
            return;
        }

        printSubsequence(s, curr, idx + 1);
        printSubsequence(s, curr + s.charAt(idx), idx + 1);
    }
}
