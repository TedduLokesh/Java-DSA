package arraysproblems;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        System.out.println(Arrays.toString((insertionSort(arr))));
    }

    public static int[]  insertionSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i-1;

            while (prev >=0 && nums[prev] > curr){
                nums[prev+1] = nums[prev];
                prev--;
            }

            nums[prev+1] = curr;
        }
        return nums;
    }
}
