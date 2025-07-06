package arraysproblems;

import java.util.Arrays;
import java.util.Scanner;

public class maximumsumofsubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //[-2,1,-3,4,-1,2,1,-5,4]
        System.out.println(max_sub_arr(arr));
    }

    static int max_sub_arr(int[] nums){
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        for (int i=0;i<nums.length;i++){
            current_sum +=nums[i];
            if (current_sum > max_sum){
                max_sum = current_sum;
            }
            if (current_sum < 0){
                current_sum = 0;
            }
        }
        return max_sum;
    }
}
