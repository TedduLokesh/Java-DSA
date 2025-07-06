package arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class findingUniquesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int size = sc.nextInt();
//        System.out.println("elements: ");
//        int[] arr = new int[size];

        int[] nums = new int[size];
        int left = 0;
        int right = size-1;
        int start = 1;
        while (left < right){
            nums[left] = start;
            left++;
            nums[right] = (-1) * start;
            right--;
            start++;
        }
        int sum = 0;
        for (int i=0;i<nums.length;i++){
            sum +=nums[i];
        }
        System.out.println("The sum of the array is " + sum);

        System.out.println("The required array is " + Arrays.toString(nums));
        System.out.println("The required array is using function" + Arrays.toString(arrayform(nums,size)));
    }

    static int[] arrayform(int[] nums,int n){
        int l = 0,r = n-1,start = 1;
        while (l < r){
            nums[l++] = start;
            nums[r--] = -1 * start;
            start++;
        }
        return nums;
    }
}
