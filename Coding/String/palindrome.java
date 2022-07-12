package String;

public class palindrome {
    public static boolean solnN(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }

    public static boolean solnE(String str) {
        int l = 0;
        int h = str.length()-1;
        while (l<h) {
            if(str.charAt(l)!=str.charAt(h))
                return false;
            l++;
            h--;
        }
        return true;
    }
}
