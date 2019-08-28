package algorithms.problems;

import java.util.ArrayList;
import java.util.List;

public class StringReverse {
    public static String reverse(String str) {
        List<List<Integer>> result = new ArrayList<>();
        if(str == null) return null;
        if(str.length() == 1) return str;
        int len = str.length();
        String reverseString = "";
        for(int i = len - 1; i > -1; i--) {
            reverseString += str.charAt(i);
        }
        return reverseString;
    }
}
