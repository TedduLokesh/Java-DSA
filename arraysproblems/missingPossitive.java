package arraysproblems;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.Scanner;

public class missingPossitive {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        Arrays.sort(nums);
        System.out.println(missingPossitive(nums));
    }


    static int missingPossitive(int[] arr){
        int index = 0;
        while (index < arr.length){
            int correct_index = arr[index]-1;
            if (arr[index]!=correct_index){
                swap(index,correct_index,arr);
            }
            else{
                index++;
            }
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i]!=i+1){
                return i+1;
            }
        }
        return arr.length;
    }

    static void swap(int first,int second,int[] nums){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
