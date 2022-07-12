package String;

import java.util.Arrays;

public class AnagramCheck {
    public static boolean solnN(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        String s11 = new String(a1);

        char[] a2 = s2.toCharArray();
        Arrays.sort(a2);
        String s22 = new String(a2);

        return s11.equals(s22);
    }
}
