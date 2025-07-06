import java.util.Arrays;
import java.util.Scanner;

public class arraysub {
    public static int number_value(int[] nums,int target){
        int start = 0;
        int end = nums.length - 1;
        while (start <=end){
            int mid = start + (end - start)/2;
            if (target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return nums[start];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int result = number_value(num);
//        System.out.println(result);
        int[] nums = {12,22,34,56,98};
        int target = 27;
        int result =  number_value(nums,target);
        System.out.println("The result value is " + result);
    }
}
