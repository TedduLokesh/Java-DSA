import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        String number = reverseNumber(num);
//        int result = Integer.parseInt(number);
//        for (int i=0;i<number.length();i++){
//            result +=number.charAt(i);
//        }
//        System.out.println("The sum is" + (int) (result) + num);
//        System.out.println("The reverseNumber and number sum is " + " : " + (int) (Integer.parseInt(number)) + num);

    }


    static String reverseNumber(int num){
        int rem = 0;
        String count = "";
        while (num > 0){
            rem = num % 10;
            count += rem;
            num = num / 10;
        }
        return count;
    }
}
