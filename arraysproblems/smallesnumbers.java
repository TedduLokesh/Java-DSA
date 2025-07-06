package arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class smallesnumbers {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] arr = new int[nums.length];
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0;i<nums.length;i++) {
            int count = 0;
            for (int j=1;j<nums.length;j++){
                if (j!=i && nums[i] > nums[j]){
                    count++;
                }
            }
            arr[i] = count;
        }
        System.out.println(Arrays.toString(arr));
    }
}
