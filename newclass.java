import java.util.Arrays;
import java.util.Scanner;

public class newclass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int num = in.nextInt();
        int i;
        while (num > 0){
            if (num < 0 || num == 1 || num == num * num){
                System.out.println("it's not  a prime number");
                break;
            } else if (num > 1) {
                for (i=2;i<num;i++){
                    if(num%i == 0){
                        System.out.println("it's not a prime number");
                        break;
                    }
                    System.out.println("Yes! it is prime number!");
                    break;
                }
                break;
            }
        }
    }
}
