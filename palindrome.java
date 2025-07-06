import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
//        if(isPalindrome(num)){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }

//    }
//    static boolean isPalindrome(int number){
//        String s = "";
////        System.out.println("number string is" + (String)(num)
//
//        int i;
//        String res_string1 = num + s;
//        String res_string2 = "";
//        for(i=res_string1.length()-1;i>=0;i--){
//            res_string2 +=res_string1.charAt(i);
//        }
//        for (i=0;i<res_string1.length();i++){
//            if(res_string1.length() == res_string2.length()){
//                System.out.println(true);
//                break;
//            }else{
//                System.out.println(false);
//                break;
//            }
//        }

        int reverse = 0;
        int rem = 0;
        while (num != 0){
//            rem = num % 10;
            reverse = (reverse * 10) + (num % 10);
            num/=10;
        }
        if(reverse == num){
            System.out.println(true);
        }{
            System.out.println(false);
        }
    }
}
