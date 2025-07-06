package arraysproblems;

import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = sc.nextInt();
        System.out.println("enter the elements of the array: ");
        int[] nums = new int[size];
        for (int k=0;k<nums.length;k++){
            nums[k] = sc.nextInt();
        }

        for (int i=0;i<nums.length-1;i++){
            for (int j=0;j<nums.length-i-1;j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println("The result array is " + Arrays.toString(nums));
    }

}
