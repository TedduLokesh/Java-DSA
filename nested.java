import java.util.ArrayList;
import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
//        String name = new String();
//        name = "Lokesh";
//        System.out.println(name.length());
//        System.out.printf("The value is of %d and %s and", 56, "arraylokesy");
//        float num = 3455.33434f;
//        System.out.printf("%.2f", num);
//        System.out.println('\n' + name + '\t' + new ArrayList<>());
//        // programm to print the given string is palindrome or not//
//        Scanner sc = new Scanner(System.in);
////        String name2 = new String("abccba");
////        System.out.println(comma(name2));
        String songa = "retter";
        System.out.println(comma(songa));
    }

    static boolean comma(String name) {
        for (int i = 0; i < name.length()/2;i++) {
            name.toLowerCase();
            char start = name.charAt(0);
            char end = name.charAt(name.length()-1-i);
            if (start!=end) {
                return false;
            }
        }
        return true;
    }
}
