package arraysproblems;

import java.util.Arrays;

public class countingsort {
    public static void main(String[] args) {
        int[] nums = {1,4,1,3,2,4,3,7};

//        int[] countArray = new int[nums.length];
        int largest = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            largest = Math.max(largest,nums[i]);
        }

        int[] countArray = new int[largest+1];
        for (int i=0;i<nums.length;i++){
            countArray[nums[i]]++;
        }

        int j=0;
        for (int i=0;i<countArray.length;i++){
            while (countArray[i] > 0){
                nums[j] = i;
                j++;
                countArray[i]--;
            }
        }
        System.out.println("The resultant array is: " + Arrays.toString(countArray));
    }
}
