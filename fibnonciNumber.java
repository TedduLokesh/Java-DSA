import java.util.Scanner;

public class fibnonciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int number = fibnonci(num);
        System.out.println("fibnonciNumber is " + number);
    }


    static int fibnonci(int n){
        if(n < 2){
            return n;
        }
        return fibnonci(n-1) + fibnonci(n-2);
    }
}
