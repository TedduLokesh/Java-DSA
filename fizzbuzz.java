import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        int c1 = 3;
        int c2 = 5;
        for (int i=1;i<=num;i++){
            if(c1%i == 0){
                System.out.println(i + " ");
            }
        }
    }
}
