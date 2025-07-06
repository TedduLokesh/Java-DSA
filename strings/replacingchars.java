package strings;

import java.util.Arrays;
import java.util.Scanner;

public class replacingchars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();
        System.out.println("enter the replace value");
        char ch = sc.next().trim().charAt(0);
        System.out.println("The resultant string value is ");
        String value = replacingchars(str,ch);
        System.out.println(value + " ");
        System.out.println("The array values of the given string is " + Arrays.toString(value.toCharArray()));
        System.out.println("The array values of the given string is " + value.toLowerCase());
        System.out.println("The array values of the given string is " + value.toUpperCase());
        System.out.println("The number of times 3 should be occur in the resultant string is " + count(value));
    }

    static String replacingchars(String str,char ch){
        String name = "";
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i'|| str.charAt(i) == 'o'|| str.charAt(i) == 'u'){
                name +=ch;
            }else {
                name +=str.charAt(i);
            }
        }
        return name;
    }

    static int count(String str){
        int sum = 0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) == '3'){
                sum++;
            }
        }
        return sum;
    }
}
