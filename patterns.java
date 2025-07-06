import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4};
        int count = 0;
        for (int i=1;i<arr.length;i++){
            int correct = arr[i]-1;
            if(arr[i] == correct) {
                count++;
            }
            System.out.println(count + "" );
        }
    }
}
