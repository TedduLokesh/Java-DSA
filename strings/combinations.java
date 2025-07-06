package strings;

import java.util.ArrayList;

public class combinations {
    public static void main(String[] args) {
        String up = "abc";
        String p = "";
        System.out.println(combinations(p,up));
//        System.out.println("\n");
        combinations2(p,up);
    }

    static ArrayList<String> combinations(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(combinations(f+ch+s,up.substring(1)));
        }
        return ans;
    }

    static void combinations2(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
//        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            combinations2(f+ch+s,up.substring(1));
        }
    }
}
