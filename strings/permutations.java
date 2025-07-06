package strings;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
//        permuatation("","abc");

        ArrayList<String> ans = permuatation("","abcd");
//        System.out.println("Printing the values in the form of the list: ");
        System.out.println(ans);
//        System.out.println("Printing the values in the list all the permutations");
//        for (int i=0;i<ans.size();i++){
//            System.out.print(ans.get(i) + " ");
//        }
//        permutation("","abcd"));
        System.out.println("The number of permutations are there for a given string is " + " : " + permuatationcount("","abcd"));
    }

    static ArrayList<String> permuatation(String p,String up){
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
            ans.addAll(permuatation(f+ch+s,up.substring(1)));
        }
        return ans;
    }

    static int permuatationcount(String p,String up){
        if (up.isEmpty()){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
            return 1;
        }
//        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        int count = 0;
        for (int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + (permuatationcount(f+ch+s,up.substring(1)));
        }
        return count;
    }
}
