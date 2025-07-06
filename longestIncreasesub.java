import java.lang.reflect.Array;
import java.util.Arrays;

public class longestIncreasesub {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
//        int count = 0;
        sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(longest_subsequence(nums));
    }

    static void sort(int[] nums){
        int temp = 0;
        for (int i = 0;i < nums.length;i++){
            for (int j = i + 1; j < nums.length;j++){
                if (nums[i] > nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    static int longest_subsequence(int[] nums){
        int count = 1;
        for (int i=1;i<nums.length;i++){
            if (nums[i] - nums[i-1] == 1){
                count++;
            }
        }
        return count;
    }
}
