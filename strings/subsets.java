package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String name = sc.next();
        subsetsofstring("",name);
//        System.out.println(res + "");
    }
//    static ArrayList<String> ans = new ArrayList<>();
    static void subsetsofstring(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsetsofstring(p,up.substring(1));
        subsetsofstring(p+ch,up.substring(1));
    }
}
