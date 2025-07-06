package arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class plusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,3};
        int carry = 1;
        int n = nums.length;
        reverse_arr(nums);
        for (int i=0;i<n;i++){
            int temp = nums[i] + carry;
            carry = temp/10;
            nums[i] = temp % 10;
        }
        if (carry!=0){
            int[] temp = new int[n+1];
            for (int i=0;i<n;i++){
                temp[i] = nums[i];
            }
            temp[n] = carry;
            reverse_arr(temp);
            System.out.println(Arrays.toString(temp));
        }
    }


    static void reverse_arr(int[] nums){
        int n = nums.length;
        for(int i=0; i<n/2; i++){
            int temp = nums[i];
            nums[i] = nums[n-i-1];
            nums[n-i-1] = temp;
        }
    }
}
