import java.util.Scanner;

public class happynumber {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//        boolean res = happynumber(num);
        int num = 19;
        boolean total_result = happynumber(num);
        if(total_result){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    static boolean happynumber(int num){
        int count = 0;
        while (num > 0){
            int value = num % 10;
            int result = (int) (value * value);
            count+=result;
            num = num / 10;
        }
        if(count == 1)
        {
            return true;
        } else if (count == 4) {
            return false;
        }
        return happynumber(count);
    }
}
