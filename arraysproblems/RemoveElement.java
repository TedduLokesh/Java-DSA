package arraysproblems;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int value = 3;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != value) {
                nums[k] = nums[i];
                k+=1;
            }
        }
        System.out.println("The resultant array after removing element: " + Arrays.toString(nums));
    }
}
