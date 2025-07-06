package arraysproblems;

public class hello {
    public static void main(String[] args) {
        // if the given number is satisfied with in the range then say hello! other wise bye!
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int GuessNumber = sc.nextInt();
        for (int i=n1; i <= n2; i++){
             if (GuessNumber == n1){
                 System.out.println("Hello");
                 break;
             }
        }
        System.out.println("Bye!");
    }
}
