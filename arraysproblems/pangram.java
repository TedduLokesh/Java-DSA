package arraysproblems;

import java.util.HashMap;

public class pangram {
    public static void main(String[] args) {
        String letter = "theQuickbrownfoxjumpsoverthelazydog";
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<letter.length();i++){
            map.put(letter.charAt(i),1);
        }
        if (map.size() == 26){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
