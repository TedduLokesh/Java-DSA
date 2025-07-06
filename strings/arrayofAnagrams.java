package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayofAnagrams {
    public static void main(String[] args) {
        String words = "listen silent enlist heart earth hater";
        char[] names = words.toCharArray();

    }

    static boolean anagramornot(String s1,String s2){
        if (s1 == s2 || s1.equals(s2) ||s1.length() == s2.length()){
            return true;
        }else{
            return false;
        }
    }
}
