package String;

public class stringIsSubsequencce {
    public static boolean solnIterative(String s1, String s2) {
        int j = 0;
        for (int i = 0; i < s1.length() && j<s2.length(); i++) {
            if(s1.charAt(i)==s2.charAt(j))
                j++;
        }
        return (j==s2.length());
    }

    public static boolean solnRecursive(String s1, String s2, int n, int m) {
        if(m==0)
            return true;
        if(n==0)
            return false;
        if(s1.charAt(n-1)==s2.charAt(m-1))
            return solnRecursive(s1, s2, n-1, m-1);
            else
                return solnRecursive(s1, s2, n-1, m);
    }
}
