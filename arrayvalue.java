import java.util.Arrays;
import java.util.Scanner;

public class arrayvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println("The list is in sorted or not!");
//        for (int i=1;i<arr.length;i++){
//            if(arr[i] < arr[i-1]){
//                System.out.println(true);
//            }
//        }

        System.out.println(sortornot(arr));
    }

    static boolean sortornot(int[] nums){
        for (int i=1;i<nums.length-1;i++){
            if(nums[i] < nums[i-1]){
                return false;
            }
        }
        return true;
    }
}
