import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();
        String str2 = "";
        int i;
        System.out.println("new string");
        for(i=str.length()-1;i>=0;i--){
            str2 +=str.charAt(i);
        }
        System.out.println("The reversed string is " + " : " + str2);
//        System.out.println();
        int count_result = string_count(str,str2);
        System.out.println("The count value is" + count_result);
    }
    static int string_count(String str,String str2){
        int i;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a target");
        char ch = in.next().trim().charAt(0);
        String name = str + str2;
        for (i=0;i<name.length();i++){
            if(name.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("The whole string after merging both strings is" + " : " + str + str2);
        return count;
    }

}
