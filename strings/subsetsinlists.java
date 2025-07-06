package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class subsetsinlists {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string process: ");
//        String process = sc.next();
//        System.out.println("Enter a unprocessed string: ");
//        String upprocess = sc.next();
//        ArrayList<String> result;
        System.out.println(subsets("","abc"));
//        System.out.println(result);
    }

    static ArrayList<String> subsets(String p,String up){
        if (up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);
        ArrayList<String> list2 = subsets(p,up.substring(1));
        ArrayList<String> list1 = subsets(p+ch,up.substring(1));
        list1.addAll(list2);
        return list1;
    }
}
