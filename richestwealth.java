import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.Scanner;

public class richestwealth {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter row: ");
//        int row = sc.nextInt();
//        System.out.println("enter the col: ");
//        int col = sc.nextInt();
        int[][] nums = {{1, 2, 3}, {3, 2, 1}};
        int richest = 0;
        int sum = 0;
        for (int[] arr:nums){
            for (int i=0;i<arr.length;i++){
                sum +=arr[i];
            }
            richest = Math.max(sum,richest);
        }
        System.out.println(richest + " ");
    }
}
