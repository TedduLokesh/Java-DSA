package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class asciivaluesubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter first string: ");
        String p = "";
        System.out.println("enter the second: ");
        String up = sc.next();
        System.out.println(subsetAssciivales(p,up));
    }

    static ArrayList<String> subsetAssciivales(String p,String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> first = subsetAssciivales(p+ch,up.substring(1));
        ArrayList<String> second = subsetAssciivales(p,up.substring(1));
        ArrayList<String> third = subsetAssciivales(p + (ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
