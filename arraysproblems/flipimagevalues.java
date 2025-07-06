package arraysproblems;

import java.util.Arrays;
import java.util.Scanner;

public class flipimagevalues {
    public static void main(String[] args) {
        int[][] nums = {
                {1,1,0},
                {1,0,1},
                {0,1,1},
        };
        int[][] result = reverseArray(nums);
        for (int i=0;i<result.length;i++){
            for (int j=0;j<result.length;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] reverseArray(int[][] nums){
        for (int[] arr:nums){
            for (int row = 0;row <(nums[0].length + 1)/2;row++){
                int temp = arr[row] ^ 1;
                arr[row] = arr[nums[0].length-row-1] ^ 1;
                arr[nums[0].length-row-1] = temp;
            }
        }
        return nums;
    }
}
