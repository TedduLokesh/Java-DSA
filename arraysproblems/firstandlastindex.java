package arraysproblems;

import java.util.Arrays;
import java.util.Scanner;

public class firstandlastindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(nums));
        int[] result = new int[2];
        System.out.println("enter the target: ");
        int target = sc.nextInt();
        result[0] = search(nums,target);
        System.out.println(result[0]);
    }

    static int search(int[] nums,int target){
        int start = 0;
        int end = 0;

        int mid;

        while (start < end){
            mid = (start + (end -start))/2;
            if (nums[mid] == target) {
                return mid;
            }
            if(nums[mid] < target){
                end = mid-11;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
